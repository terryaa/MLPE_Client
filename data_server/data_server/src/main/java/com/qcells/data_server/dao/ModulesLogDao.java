package com.qcells.data_server.dao;

import java.util.List;

import com.qcells.data_server.dto.ModulesLog;

import org.springframework.stereotype.Repository;

@Repository
public interface ModulesLogDao {
    public List<ModulesLog> getModulesLogList() throws Exception;
    public int insertModules(ModulesLog modulesLog);
    

}
