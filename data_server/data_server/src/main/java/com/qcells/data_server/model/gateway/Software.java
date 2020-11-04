package com.qcells.data_server.model.gateway;

import lombok.*;


public class Software {
    private String version;

    public Software() {
    }

    public Software(String version) {
        this.version = version;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Software version(String version) {
        this.version = version;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " version='" + getVersion() + "'" +
            "}";
    }

}
