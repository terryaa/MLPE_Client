package com.qcells.data_server.model.inverter;


import java.util.List;

public class Inverter {
	private long startTS;
	private long endTS;
	private String error;
	private List<InverterDevice> devices;


	public Inverter() {
	}

	public Inverter(long startTS, long endTS, String error, List<InverterDevice> devices) {
		this.startTS = startTS;
		this.endTS = endTS;
		this.error = error;
		this.devices = devices;
	}

	public long getStartTS() {
		return this.startTS;
	}

	public void setStartTS(long startTS) {
		this.startTS = startTS;
	}

	public long getEndTS() {
		return this.endTS;
	}

	public void setEndTS(long endTS) {
		this.endTS = endTS;
	}

	public String getError() {
		return this.error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public List<InverterDevice> getDevices() {
		return this.devices;
	}

	public void setDevices(List<InverterDevice> devices) {
		this.devices = devices;
	}

	public Inverter startTS(long startTS) {
		this.startTS = startTS;
		return this;
	}

	public Inverter endTS(long endTS) {
		this.endTS = endTS;
		return this;
	}

	public Inverter error(String error) {
		this.error = error;
		return this;
	}

	public Inverter devices(List<InverterDevice> devices) {
		this.devices = devices;
		return this;
	}



	@Override
	public String toString() {
		return "{" +
			" startTS='" + getStartTS() + "'" +
			", endTS='" + getEndTS() + "'" +
			", error='" + getError() + "'" +
			", devices='" + getDevices() + "'" +
			"}";
	}

}
