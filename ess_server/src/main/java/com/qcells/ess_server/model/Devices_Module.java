package com.qcells.ess_server.model;
//Data객체 구성
public class Devices_Module {
    private String moduleSerial;
    private float moduleVoltage;
    private float moduleTemperature;

    public Devices_Module(String moduleSerial, float moduleVoltage, float moduleTemperature) {
        this.moduleSerial = moduleSerial;
        this.moduleVoltage = moduleVoltage;
        this.moduleTemperature = moduleTemperature;
    }

    public String getModuleSerial() {
        return this.moduleSerial;
    }

    public void setModuleSerial(String moduleSerial) {
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

}