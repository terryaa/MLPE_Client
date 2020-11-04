package com.qcells.data_server.model.strings;

import lombok.*;

import java.util.List;

public class Strings {
	private long startTs;
	private long endTs;
	private List<StringDevice> devices;


	public Strings() {
	}

	public Strings(long startTs, long endTs, List<StringDevice> devices) {
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

	public List<StringDevice> getDevices() {
		return this.devices;
	}

	public void setDevices(List<StringDevice> devices) {
		this.devices = devices;
	}

	public Strings startTs(long startTs) {
		this.startTs = startTs;
		return this;
	}

	public Strings endTs(long endTs) {
		this.endTs = endTs;
		return this;
	}

	public Strings devices(List<StringDevice> devices) {
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
