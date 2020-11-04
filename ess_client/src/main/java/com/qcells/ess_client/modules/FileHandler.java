package com.qcells.ess_client.modules;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.qcells.ess_client.model.Data;


//Path를 입력받아 File IO관련 작업을 처리한다.
public class FileHandler {

    private FileWriter fw;
    private FileReader fr;
    public void File_Writer(String text, String path) {
        try {
            fw = new FileWriter(path);
            fw.write(text);
            fw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public List<Data> File_Read_All_data(String path) throws IOException {
        
        File data_dir=new File(path);
        List<Data> ary_data=new ArrayList<>();
        Gson gs=new Gson();
        for(File file : data_dir.listFiles()){
            if(!file.isDirectory()){
                fr=new FileReader(file);
                JsonReader reader=new JsonReader(fr);
                ary_data.add(gs.fromJson(reader, Data.class));
                fr.close();
            }
        }
        return ary_data;
    }

}