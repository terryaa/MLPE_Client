package com.qcells.data_server.model.strings;

import lombok.*;


public class StringDeviceInfo {
	private String portError;
	private String host;
	private int port;
	private int id;
	private String name;
	private int serialNo;
	private String fwVersion;
	private int comparator;
	private int devider;
	private int rawPulsesCounter;


	public StringDeviceInfo() {
	}

	public StringDeviceInfo(String portError, String host, int port, int id, String name, int serialNo, String fwVersion, int comparator, int devider, int rawPulsesCounter) {
		this.portError = portError;
		this.host = host;
		this.port = port;
		this.id = id;
		this.name = name;
		this.serialNo = serialNo;
		this.fwVersion = fwVersion;
		this.comparator = comparator;
		this.devider = devider;
		this.rawPulsesCounter = rawPulsesCounter;
	}

	public String getPortError() {
		return this.portError;
	}

	public void setPortError(String portError) {
		this.portError = portError;
	}

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return this.port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public String getFwVersion() {
		return this.fwVersion;
	}

	public void setFwVersion(String fwVersion) {
		this.fwVersion = fwVersion;
	}

	public int getComparator() {
		return this.comparator;
	}

	public void setComparator(int comparator) {
		this.comparator = comparator;
	}

	public int getDevider() {
		return this.devider;
	}

	public void setDevider(int devider) {
		this.devider = devider;
	}

	public int getRawPulsesCounter() {
		return this.rawPulsesCounter;
	}

	public void setRawPulsesCounter(int rawPulsesCounter) {
		this.rawPulsesCounter = rawPulsesCounter;
	}

	public StringDeviceInfo portError(String portError) {
		this.portError = portError;
		return this;
	}

	public StringDeviceInfo host(String host) {
		this.host = host;
		return this;
	}

	public StringDeviceInfo port(int port) {
		this.port = port;
		return this;
	}

	public StringDeviceInfo id(int id) {
		this.id = id;
		return this;
	}

	public StringDeviceInfo name(String name) {
		this.name = name;
		return this;
	}

	public StringDeviceInfo serialNo(int serialNo) {
		this.serialNo = serialNo;
		return this;
	}

	public StringDeviceInfo fwVersion(String fwVersion) {
		this.fwVersion = fwVersion;
		return this;
	}

	public StringDeviceInfo comparator(int comparator) {
		this.comparator = comparator;
		return this;
	}

	public StringDeviceInfo devider(int devider) {
		this.devider = devider;
		return this;
	}

	public StringDeviceInfo rawPulsesCounter(int rawPulsesCounter) {
		this.rawPulsesCounter = rawPulsesCounter;
		return this;
	}



	@Override
	public String toString() {
		return "{" +
			" portError='" + getPortError() + "'" +
			", host='" + getHost() + "'" +
			", port='" + getPort() + "'" +
			", id='" + getId() + "'" +
			", name='" + getName() + "'" +
			", serialNo='" + getSerialNo() + "'" +
			", fwVersion='" + getFwVersion() + "'" +
			", comparator='" + getComparator() + "'" +
			", devider='" + getDevider() + "'" +
			", rawPulsesCounter='" + getRawPulsesCounter() + "'" +
			"}";
	}

}
