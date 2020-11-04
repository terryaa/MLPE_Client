package com.qcells.data_server.service;

import java.util.List;

import com.google.gson.Gson;
import com.qcells.data_server.dao.*;
import com.qcells.data_server.dto.*;
import com.qcells.data_server.model.Data;
import com.qcells.data_server.model.gateway.*;
import com.qcells.data_server.model.inverter.*;
import com.qcells.data_server.model.strings.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModulesService {
 
    @Autowired
    private ModulesLogDao dao;
    
    public List<ModulesLog> getModulesLogs() throws Exception {
        
        return dao.getModulesLogList();
    }
    public int insertModules(ModulesLog log) throws Exception {
        
        return dao.insertModules(log);
    }

    Gson gson;
    Data data;

    @Autowired
    private GatewayLogDao gatewayDao;
    @Autowired
    private StringsLogDao stringsDao;
    @Autowired
    private ModulesLogDao modulesDao;
    @Autowired
    private DeviceDao deviceDao;

    private Gateway gw;
    private GatewayDevice gwd;
    private GatewayLog gwLog;

    private Strings st;
    private StringDevice std;
    private StringDeviceInfo stdinfo;
    private StringsLog stLog;

    private Modules md;
    private ModuleDevice mdd;
    private ModulesLog mdLog;

    private Device dv;
    public synchronized void parseData(String str){
        gson = new Gson();
        data = gson.fromJson(str, Data.class);

        gw = data.getGateway();

        System.out.println(gw.toString());


        insertGateway(str);
        insertStrings();
    }

    public void insertGateway(String str){


        for(int i=0; i<gw.getDevices().size(); ++i){
            gwd = gw.getDevices().get(i);
            gwLog = new GatewayLog(Integer.parseInt(gwd.getId()), gwd.getStartTs(), gwd.getEndTs(), gwd.getMac(), gwd.getSn(), gwd.getSoftware().getVersion(), gwd.getIoboard().getFirmware());
            gatewayDao.insertGateway(gwLog);

            dv = new Device(Integer.parseInt(gwd.getId()), str);
            deviceDao.updateDeviceInfo(dv);
        }

    }

    public void insertStrings(){

        st = data.getStrings();

        for(int i=0; i<st.getDevices().size(); ++i){
            std = st.getDevices().get(i);
            stdinfo = std.getInfo();
            stLog = new StringsLog(Integer.parseInt(gwd.getId()), stdinfo.getId(), st.getStartTs(), st.getEndTs(),
                    stdinfo.getPortError(), stdinfo.getHost(), stdinfo.getPort(),
                    stdinfo.getName(), stdinfo.getSerialNo(), stdinfo.getFwVersion(), stdinfo.getComparator(),
                    stdinfo.getDevider(), stdinfo.getRawPulsesCounter(), std.getError(),
                    std.getStringVoltage(), std.getStringCurrent(), std.getTemperature(), std.getTotalWh());

            stringsDao.insertStrings(stLog);

            md = std.getModules();

            insertModules();
        }
    }

    public void insertModules(){
        for(int i=0; i<md.getDevices().size(); ++i){
            mdd = md.getDevices().get(i);
            mdLog = new ModulesLog(mdd.getModuleSerial(), stdinfo.getId(), Integer.parseInt(gwd.getId()), md.getStartTs(), md.getEndTs(), mdd.getModuleVoltage(), mdd.getModuleTemperature(), mdd.getModuleWatt(), mdd.getModuleCurrent());
            modulesDao.insertModules(mdLog);
        }
    }
}