package com.qcells.ess_server.rest;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.google.gson.Gson;
import com.qcells.ess_server.dao.ModulesLogDao;
import com.qcells.ess_server.dto.ModulesLog;
import com.qcells.ess_server.model.Data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


//Data 생성,전송 확인을 위한 Endpoint(=Resource =Controller)
//deviceDataIncomString이 Client가 보내는 데이터를 받는 역할을 한다.
@Path("/data")
public class DataResource {
    private static int count=0;
    private final Logger logger= LoggerFactory.getLogger(this.getClass());
    //Client가 서버로 보내는 데이터를 전달받음-> 확인만 한뒤 후처리는 없음.
    //Client는 Data객체를 ->Json화->String 형태로 변환하여 보내며
    //Server는 다시 String->Json->Data객체화 를 진행하여 Data객체정보를 얻어낸다.
    @POST
    @Consumes( MediaType.TEXT_PLAIN)
    public Response deviceDataIncomeString(String str, @Context UriInfo uriInfo) {
        count++;
        Data dat=new Gson().fromJson(str, Data.class);
        logger.info(dat.getGateway().getDevices().get(0).getId()+" received");
        return Response.status(Response.Status.CREATED.getStatusCode()).header("Location", String.format("%s/%s", uriInfo.getAbsolutePath().toString(), dat.getGateway().getDevices().get(0).getMac())).build();
    }

    
	private int md_sn;
	private int st_id;
	private int gt_id;
	private long startTs;
	private long endTs;
	private float moduleVoltage;
	private float moduleTemperature;
	private int moduleWatt;
	private float moduleCurrent;

	@Autowired
	private ModulesLogDao modulesDao;
    @GET
    @Path("/hello")
    public String hello(){
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


        return "hello";
    }

}