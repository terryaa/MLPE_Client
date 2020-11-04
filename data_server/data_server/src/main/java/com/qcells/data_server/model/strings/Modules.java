package com.qcells.data_server.model.strings;

import lombok.*;

import java.util.List;

public class Modules {
	private long startTs;
	private long endTs;
	private List<ModuleDevice> devices;


	public Modules() {
	}

	public Modules(long startTs, long endTs, List<ModuleDevice> devices) {
		this.startTs = startTs;
		this.endTs = endTs;
		this.devices = devices;
	}

	public long getStartTs() {
		return this.startTs;
	}

	public void setStartTs(long startTs) {
		this.startTs = startTs;
	}

	public long getEndTs() {
		return this.endTs;
	}

	public void setEndTs(long endTs) {
		this.endTs = endTs;
	}

	public List<ModuleDevice> getDevices() {
		return this.devices;
	}

	public void setDevices(List<ModuleDevice> devices) {
		this.devices = devices;
	}

	public Modules startTs(long startTs) {
		this.startTs = startTs;
		return this;
	}

	public Modules endTs(long endTs) {
		this.endTs = endTs;
		return this;
	}

	public Modules devices(List<ModuleDevice> devices) {
		this.devices = devices;
		return this;
	}



	@Override
	public String toString() {
		return "{" +
			" startTs='" + getStartTs() + "'" +
			", endTs='" + getEndTs() + "'" +
			", devices='" + getDevices() + "'" +
			"}";
	}

}
