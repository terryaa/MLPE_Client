package com.qcells.data_server.model.gateway;

import lombok.*;

import java.util.List;

public class Gateway {
	private List<GatewayDevice> devices;

	public Gateway() {
	}

	public Gateway(List<GatewayDevice> devices) {
		this.devices = devices;
	}

	public List<GatewayDevice> getDevices() {
		return this.devices;
	}

	public void setDevices(List<GatewayDevice> devices) {
		this.devices = devices;
	}

	public Gateway devices(List<GatewayDevice> devices) {
		this.devices = devices;
		return this;
	}
	
	@Override
	public String toString() {
		return "{" +
			" devices='" + getDevices() + "'" +
			"}";
	}

}
