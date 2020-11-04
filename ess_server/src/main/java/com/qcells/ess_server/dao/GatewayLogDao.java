package com.qcells.ess_server.dao;

import com.qcells.ess_server.dto.GatewayLog;
import org.springframework.stereotype.Repository;

@Repository
public interface GatewayLogDao {
	public int insertGateway(GatewayLog gatewayLog);
}
