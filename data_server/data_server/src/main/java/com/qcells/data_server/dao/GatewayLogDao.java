package com.qcells.data_server.dao;
import com.qcells.data_server.dto.GatewayLog;
import org.springframework.stereotype.Repository;

@Repository
public interface GatewayLogDao {
	public int insertGateway(GatewayLog gatewayLog);
}
