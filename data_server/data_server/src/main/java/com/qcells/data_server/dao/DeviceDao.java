package com.qcells.data_server.dao;

import com.qcells.data_server.dto.Device;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceDao {
	public int updateDeviceInfo(Device device);
}
