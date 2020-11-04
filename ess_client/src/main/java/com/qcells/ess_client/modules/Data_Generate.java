package com.qcells.ess_client.modules;

import java.util.List;

import com.google.gson.Gson;
import com.qcells.ess_client.model.Data;


//DataGenerator을 통하여 Data를 만들어낸뒤, Local파일시스템에 데이터를 저장한다.
public class Data_Generate {

    private DataGenerator data_gen;
    private FileHandler fh=new FileHandler();

    //Exception handling이 안되있긴함.
    public void generate_data(int devices, int strings_devcs,int modules,String file_path){
        data_gen=new DataGenerator();
        List<Data> ary_data=data_gen.Make_Data(devices, strings_devcs, modules);
        Gson gs=new Gson();
        for(Data dat: ary_data){
            fh.File_Writer(gs.toJson(dat),file_path
            +"/data"+dat.getGateway().getDevices().get(0).getId()+".json");
        }
    }
}