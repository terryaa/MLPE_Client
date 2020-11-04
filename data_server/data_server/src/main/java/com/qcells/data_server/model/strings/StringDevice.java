package com.qcells.data_server.model.strings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
@JsonIgnoreProperties(ignoreUnknown = true)
public class StringDevice {
	private StringDeviceInfo info;
	private String error;
	private int stringVoltage;
	private float stringCurrent;
	private int temperature;
	private int totalWh;
	private com.qcells.data_server.model.strings.Modules Modules;


	public StringDevice() {
	}

	public StringDevice(StringDeviceInfo info, String error, int stringVoltage, float stringCurrent, int temperature, int totalWh, com.qcells.data_server.model.strings.Modules Modules) {
		this.info = info;
		this.error = error;
		this.stringVoltage = stringVoltage;
		this.stringCurrent = stringCurrent;
		this.temperature = temperature;
		this.totalWh = totalWh;
		this.Modules = Modules;
	}

	public StringDeviceInfo getInfo() {
		return this.info;
	}

	public void setInfo(StringDeviceInfo info) {
		this.info = info;
	}

	public String getError() {
		return this.error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public int getStringVoltage() {
		return this.stringVoltage;
	}

	public void setStringVoltage(int stringVoltage) {
		this.stringVoltage = stringVoltage;
	}

	public float getStringCurrent() {
		return this.stringCurrent;
	}

	public void setStringCurrent(float stringCurrent) {
		this.stringCurrent = stringCurrent;
	}

	public int getTemperature() {
		return this.temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getTotalWh() {
		return this.totalWh;
	}

	public void setTotalWh(int totalWh) {
		this.totalWh = totalWh;
	}

	public com.qcells.data_server.model.strings.Modules getModules() {
		return this.Modules;
	}

	public void setModules(com.qcells.data_server.model.strings.Modules Modules) {
		this.Modules = Modules;
	}

	public StringDevice info(StringDeviceInfo info) {
		this.info = info;
		return this;
	}

	public StringDevice error(String error) {
		this.error = error;
		return this;
	}

	public StringDevice stringVoltage(int stringVoltage) {
		this.stringVoltage = stringVoltage;
		return this;
	}

	public StringDevice stringCurrent(float stringCurrent) {
		this.stringCurrent = stringCurrent;
		return this;
	}

	public StringDevice temperature(int temperature) {
		this.temperature = temperature;
		return this;
	}

	public StringDevice totalWh(int totalWh) {
		this.totalWh = totalWh;
		return this;
	}

	public StringDevice Modules(com.qcells.data_server.model.strings.Modules Modules) {
		this.Modules = Modules;
		return this;
	}


	@Override
	public String toString() {
		return "{" +
			" info='" + getInfo() + "'" +
			", error='" + getError() + "'" +
			", stringVoltage='" + getStringVoltage() + "'" +
			", stringCurrent='" + getStringCurrent() + "'" +
			", temperature='" + getTemperature() + "'" +
			", totalWh='" + getTotalWh() + "'" +
			", Modules='" + getModules() + "'" +
			"}";
	}

}
