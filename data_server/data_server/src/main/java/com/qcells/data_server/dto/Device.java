package com.qcells.data_server.dto;


public class Device {
    private int dv_id;
    private String information;

    public Device() {
    }

    public Device(int dv_id, String information) {
        this.dv_id = dv_id;
        this.information = information;
    }

    public int getDv_id() {
        return this.dv_id;
    }

    public void setDv_id(int dv_id) {
        this.dv_id = dv_id;
    }

    public String getInformation() {
        return this.information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Device dv_id(int dv_id) {
        this.dv_id = dv_id;
        return this;
    }

    public Device information(String information) {
        this.information = information;
        return this;
    }



    @Override
    public String toString() {
        return "{" +
            " dv_id='" + getDv_id() + "'" +
            ", information='" + getInformation() + "'" +
            "}";
    }


}
