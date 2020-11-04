package com.qcells.data_server.model.gateway;

import lombok.*;


public class Ioboard {


    private String firmware;

    public Ioboard() {
    }

    public Ioboard(String firmware) {
        this.firmware = firmware;
    }

    public String getFirmware() {
        return this.firmware;
    }

    public void setFirmware(String firmware) {
        this.firmware = firmware;
    }

    public Ioboard firmware(String firmware) {
        this.firmware = firmware;
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " firmware='" + getFirmware() + "'" +
            "}";
    }

}
