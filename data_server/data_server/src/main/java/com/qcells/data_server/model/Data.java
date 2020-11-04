package com.qcells.data_server.model;


import com.qcells.data_server.model.inverter.Inverter;
import com.qcells.data_server.model.strings.Strings;

public class Data {
    private com.qcells.data_server.model.gateway.Gateway Gateway;
    private Inverter Inverters;
    private Strings Strings;

    public Data() {
    }

    public Data(com.qcells.data_server.model.gateway.Gateway Gateway, Inverter Inverters, Strings Strings) {
        this.Gateway = Gateway;
        this.Inverters = Inverters;
        this.Strings = Strings;
    }

    public com.qcells.data_server.model.gateway.Gateway getGateway() {
        return this.Gateway;
    }

    public void setGateway(com.qcells.data_server.model.gateway.Gateway Gateway) {
        this.Gateway = Gateway;
    }

    public Inverter getInverters() {
        return this.Inverters;
    }

    public void setInverters(Inverter Inverters) {
        this.Inverters = Inverters;
    }

    public Strings getStrings() {
        return this.Strings;
    }

    public void setStrings(Strings Strings) {
        this.Strings = Strings;
    }

    public Data Gateway(com.qcells.data_server.model.gateway.Gateway Gateway) {
        this.Gateway = Gateway;
        return this;
    }

    public Data Inverters(Inverter Inverters) {
        this.Inverters = Inverters;
        return this;
    }

    public Data Strings(Strings Strings) {
        this.Strings = Strings;
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " Gateway='" + getGateway() + "'" +
            ", Inverters='" + getInverters() + "'" +
            ", Strings='" + getStrings() + "'" +
            "}";
    }

}