package com.qcells.data_server.model.strings;


public class ModuleDevice {
	private int moduleSerial;
	private float moduleVoltage;
	private float moduleTemperature;
	private int moduleWatt;
	private float moduleCurrent;

	public ModuleDevice() {
	}

	public ModuleDevice(int moduleSerial, float moduleVoltage, float moduleTemperature, int moduleWatt, float moduleCurrent) {
		this.moduleSerial = moduleSerial;
		this.moduleVoltage = moduleVoltage;
		this.moduleTemperature = moduleTemperature;
		this.moduleWatt = moduleWatt;
		this.moduleCurrent = moduleCurrent;
	}

	public int getModuleSerial() {
		return this.moduleSerial;
	}

	public void setModuleSerial(int moduleSerial) {
		this.moduleSerial = moduleSerial;
	}

	public float getModuleVoltage() {
		return this.moduleVoltage;
	}

	public void setModuleVoltage(float moduleVoltage) {
		this.moduleVoltage = moduleVoltage;
	}

	public float getModuleTemperature() {
		return this.moduleTemperature;
	}

	public void setModuleTemperature(float moduleTemperature) {
		this.moduleTemperature = moduleTemperature;
	}

	public int getModuleWatt() {
		return this.moduleWatt;
	}

	public void setModuleWatt(int moduleWatt) {
		this.moduleWatt = moduleWatt;
	}

	public float getModuleCurrent() {
		return this.moduleCurrent;
	}

	public void setModuleCurrent(float moduleCurrent) {
		this.moduleCurrent = moduleCurrent;
	}

	public ModuleDevice moduleSerial(int moduleSerial) {
		this.moduleSerial = moduleSerial;
		return this;
	}

	public ModuleDevice moduleVoltage(float moduleVoltage) {
		this.moduleVoltage = moduleVoltage;
		return this;
	}

	public ModuleDevice moduleTemperature(float moduleTemperature) {
		this.moduleTemperature = moduleTemperature;
		return this;
	}

	public ModuleDevice moduleWatt(int moduleWatt) {
		this.moduleWatt = moduleWatt;
		return this;
	}

	public ModuleDevice moduleCurrent(float moduleCurrent) {
		this.moduleCurrent = moduleCurrent;
		return this;
	}


	@Override
	public String toString() {
		return "{" +
			" moduleSerial='" + getModuleSerial() + "'" +
			", moduleVoltage='" + getModuleVoltage() + "'" +
			", moduleTemperature='" + getModuleTemperature() + "'" +
			", moduleWatt='" + getModuleWatt() + "'" +
			", moduleCurrent='" + getModuleCurrent() + "'" +
			"}";
	}

}
