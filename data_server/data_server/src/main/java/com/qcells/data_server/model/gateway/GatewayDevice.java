package com.qcells.data_server.model.gateway;

import lombok.*;

public class GatewayDevice {
	private long startTs;
	private long endTs;
	private String mac;
	private String id;
	private String sn;
	private Software software;
	private Ioboard ioboard;


	public GatewayDevice() {
	}

	public GatewayDevice(long startTs, long endTs, String mac, String id, String sn, Software software, Ioboard ioboard) {
		this.startTs = startTs;
		this.endTs = endTs;
		this.mac = mac;
		this.id = id;
		this.sn = sn;
		this.software = software;
		this.ioboard = ioboard;
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

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSn() {
		return this.sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public Software getSoftware() {
		return this.software;
	}

	public void setSoftware(Software software) {
		this.software = software;
	}

	public Ioboard getIoboard() {
		return this.ioboard;
	}

	public void setIoboard(Ioboard ioboard) {
		this.ioboard = ioboard;
	}

	public GatewayDevice startTs(long startTs) {
		this.startTs = startTs;
		return this;
	}

	public GatewayDevice endTs(long endTs) {
		this.endTs = endTs;
		return this;
	}

	public GatewayDevice mac(String mac) {
		this.mac = mac;
		return this;
	}

	public GatewayDevice id(String id) {
		this.id = id;
		return this;
	}

	public GatewayDevice sn(String sn) {
		this.sn = sn;
		return this;
	}

	public GatewayDevice software(Software software) {
		this.software = software;
		return this;
	}

	public GatewayDevice ioboard(Ioboard ioboard) {
		this.ioboard = ioboard;
		return this;
	}


	@Override
	public String toString() {
		return "{" +
			" startTs='" + getStartTs() + "'" +
			", endTs='" + getEndTs() + "'" +
			", mac='" + getMac() + "'" +
			", id='" + getId() + "'" +
			", sn='" + getSn() + "'" +
			", software='" + getSoftware() + "'" +
			", ioboard='" + getIoboard() + "'" +
			"}";
	}

}
