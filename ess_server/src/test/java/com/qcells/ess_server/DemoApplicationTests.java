package com.qcells.ess_server;

import javax.annotation.Resource;

import com.qcells.ess_server.dao.DeviceDao;
import com.qcells.ess_server.dao.GatewayLogDao;
import com.qcells.ess_server.dao.ModulesLogDao;
import com.qcells.ess_server.dao.StringsLogDao;
import com.qcells.ess_server.dto.ModulesLog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

@SpringBootTest
class DemoApplicationTests {

	private int md_sn;
	private int st_id;
	private int gt_id;
	private long startTs;
	private long endTs;
	private float moduleVoltage;
	private float moduleTemperature;
	private int moduleWatt;
	private float moduleCurrent;

	@Resource
	private ModulesLogDao modulesDao;



	@Test
	void contextLoads() {
		md_sn=1111;
		st_id=111;
		gt_id=11;
		startTs=1597454160000L;
		endTs=1597454160000L;
		moduleVoltage=123;
		moduleTemperature=23;
		moduleCurrent=12.2F;
		moduleWatt=123;

		modulesDao.insertModules(new ModulesLog(md_sn,st_id,gt_id,startTs,endTs,moduleVoltage,moduleTemperature,moduleWatt,moduleCurrent));


		
	}

}
