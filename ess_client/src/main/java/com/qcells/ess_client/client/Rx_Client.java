package com.qcells.ess_client.client;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.qcells.ess_client.model.Data;
import com.qcells.ess_client.modules.DataUpdater;
import com.qcells.ess_client.modules.Data_Generate;
import com.qcells.ess_client.modules.FileHandler;
import com.qcells.ess_client.profile.Develop;
import com.qcells.ess_client.profile.Production;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/*
생성된 데이터를 읽어들여 서버와 통신하는 simulation메소드,
서버 시작부터 1분마다 실행되는 exec_scheduled메소드를 가지고있는 Client.
비동기식 Request를 날리는 Client2번째이다
*/

@EnableAsync
@Component
@Configuration
public class Rx_Client {
    @Value("${spring.profile.value}")
    private String profile;
    @Value("${server.ip}")
    private String target_IP;
    //application.properties파일에서 정보를 읽어와 데이터개수에대한 생성정보를 저장한다.
    @Value("${devices.num}")
    private String device_num;
    @Value("${strings.num}")
    private String string_num;
    @Value("${modules.num}")
    private String module_num;


    private final String file_path="./data";
    private Client client = ClientBuilder.newClient();
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    Data_Generate dg = new Data_Generate();
    DataUpdater data_udt = new DataUpdater();
    FileHandler fw = new FileHandler();



    //경로에 있는 data파일들을 읽어와 data리스트를 만든다.
    //List를 Iterate하며 Data객체 1개당 1개의 Request를 비동기식으로 전송한다.
    //전송후 Update를 진행하고, update된 file을 로컬에 다시 write한다.
    public void simulation() throws InterruptedException {
        WebTarget targett = client.target(target_IP);

        
        // Parameter of Constructor should be numbers of async requests which will be
        // made.
        // 파일 읽어오기(100개의 Data)
        List<Data> ary_data = new ArrayList<>();
        try {
            ary_data = fw.File_Read_All_data(file_path);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(ary_data.get(0).getGateway().getDevices().get(0).getEndTs()>1588474800000L){
            return;
        }
        // updator : Data업데이트
        data_udt.update(ary_data);
        //만들 Thread의 개수가 정해진다.
        int repeat=ary_data.size();
        // send data to server asyncronously 서버로 파일 보내기.
        Gson gs = new Gson();
        CountDownLatch completionTracker = new CountDownLatch(repeat);
        for (int i = 0; i < repeat; i++) {
            try{
            CompletionStage<Response> completion = targett.path("/data").request(MediaType.TEXT_PLAIN).rx()
                    .post(Entity.entity(gs.toJson(ary_data.get(i)), MediaType.TEXT_PLAIN));
                    
            completion.thenAccept(res -> {
                // each async requests will countdown 1 then finish thread.
                completionTracker.countDown();
            });
            }catch (Exception e){
                logger.error(e.getMessage());
            }

        }
        if (!completionTracker.await(10, TimeUnit.SECONDS)) {
            logger.warn("Some requests didn't complete within the timeout");
        }
        logger.info("-------------------transfer success-----------");

            // 여기도 filehandler가 더 담당하도록 줄여보자.
            // end -> save data 종료후 자료 재저장
            for (Data dat : ary_data) {
                fw.File_Writer(gs.toJson(dat), file_path + "/data" + dat.getGateway().getDevices().get(0).getId() + ".json");
            }
        }
        
    
        

    


    // 1분(60초)마다 Server로의 전송을 실행한다.전송할 데이터가 없으면 Generate하고,
    //있으면 전송을바로시작한다.
    @Async
    @Scheduled(fixedRate=5000)
    public void exec_scheduled() throws NumberFormatException, InterruptedException {
        //폴더가 비어있으면 자료가 생성되지 않은것으로 판단, 생성작업을 먼저 처리한다.
        //if directory is empty, start data generation.
        logger.info("----------------data transmission started-------------");
        logger.info(target_IP);
        if(profile.equals("develop")){
            //target_IP=new Develop().getPath();
            target_IP="http://localhost:8080";
        }
        else{
            //target_IP=new Production().getPath();
            target_IP="http://localhost:8081";
        }
        try {
            File data_path=new File(file_path);
            if(!data_path.exists()){
                data_path.mkdir();
            }
            DirectoryStream<Path> dirStream = Files.newDirectoryStream(Paths.get(file_path));
            if(!dirStream.iterator().hasNext()){
                dg.generate_data(Integer.parseInt(device_num),Integer.parseInt(string_num),Integer.parseInt(module_num),file_path);
            }
            dirStream.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        simulation();
        logger.info("---------data transmission ended----------");

    } 
}