package com.qcells.ess_server.dao;

import com.qcells.ess_server.dto.Device;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceDao {
	public int updateDeviceInfo(Device device);
}
