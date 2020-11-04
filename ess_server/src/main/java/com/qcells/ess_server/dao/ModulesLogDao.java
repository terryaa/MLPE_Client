package com.qcells.ess_server.dao;

import com.qcells.ess_server.dto.ModulesLog;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface ModulesLogDao {
	public int insertModules(ModulesLog modulesLog);
}
