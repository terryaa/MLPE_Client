package com.qcells.data_server.dto;


public class StringsLog {
    private int gt_id;
    private int st_id;
    private long startTs;
    private long endTs;
    private String postError;
    private String host_fix;
    private int port_fix;
    private String name_fix;
    private int serialNo_fix;
    private String fwVersion_fix;
    private int comparator_fix;
    private int devider_fix;
    private int rawPulsesCounter_fix;
    private String error;
    private int stringVoltage;
    private float stringCurrent;
    private int temperature;
    private int totalWatt;

    public StringsLog() {
    }

    public StringsLog(int gt_id, int st_id, long startTs, long endTs, String postError, String host_fix, int port_fix, String name_fix, int serialNo_fix, String fwVersion_fix, int comparator_fix, int devider_fix, int rawPulsesCounter_fix, String error, int stringVoltage, float stringCurrent, int temperature, int totalWatt) {
        this.gt_id = gt_id;
        this.st_id = st_id;
        this.startTs = startTs;
        this.endTs = endTs;
        this.postError = postError;
        this.host_fix = host_fix;
        this.port_fix = port_fix;
        this.name_fix = name_fix;
        this.serialNo_fix = serialNo_fix;
        this.fwVersion_fix = fwVersion_fix;
        this.comparator_fix = comparator_fix;
        this.devider_fix = devider_fix;
        this.rawPulsesCounter_fix = rawPulsesCounter_fix;
        this.error = error;
        this.stringVoltage = stringVoltage;
        this.stringCurrent = stringCurrent;
        this.temperature = temperature;
        this.totalWatt = totalWatt;
    }

    public int getGt_id() {
        return this.gt_id;
    }

    public void setGt_id(int gt_id) {
        this.gt_id = gt_id;
    }

    public int getSt_id() {
        return this.st_id;
    }

    public void setSt_id(int st_id) {
        this.st_id = st_id;
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

    public String getPostError() {
        return this.postError;
    }

    public void setPostError(String postError) {
        this.postError = postError;
    }

    public String getHost_fix() {
        return this.host_fix;
    }

    public void setHost_fix(String host_fix) {
        this.host_fix = host_fix;
    }

    public int getPort_fix() {
        return this.port_fix;
    }

    public void setPort_fix(int port_fix) {
        this.port_fix = port_fix;
    }

    public String getName_fix() {
        return this.name_fix;
    }

    public void setName_fix(String name_fix) {
        this.name_fix = name_fix;
    }

    public int getSerialNo_fix() {
        return this.serialNo_fix;
    }

    public void setSerialNo_fix(int serialNo_fix) {
        this.serialNo_fix = serialNo_fix;
    }

    public String getFwVersion_fix() {
        return this.fwVersion_fix;
    }

    public void setFwVersion_fix(String fwVersion_fix) {
        this.fwVersion_fix = fwVersion_fix;
    }

    public int getComparator_fix() {
        return this.comparator_fix;
    }

    public void setComparator_fix(int comparator_fix) {
        this.comparator_fix = comparator_fix;
    }

    public int getDevider_fix() {
        return this.devider_fix;
    }

    public void setDevider_fix(int devider_fix) {
        this.devider_fix = devider_fix;
    }

    public int getRawPulsesCounter_fix() {
        return this.rawPulsesCounter_fix;
    }

    public void setRawPulsesCounter_fix(int rawPulsesCounter_fix) {
        this.rawPulsesCounter_fix = rawPulsesCounter_fix;
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

    public int getTotalWatt() {
        return this.totalWatt;
    }

    public void setTotalWatt(int totalWatt) {
        this.totalWatt = totalWatt;
    }

    public StringsLog gt_id(int gt_id) {
        this.gt_id = gt_id;
        return this;
    }

    public StringsLog st_id(int st_id) {
        this.st_id = st_id;
        return this;
    }

    public StringsLog startTs(long startTs) {
        this.startTs = startTs;
        return this;
    }

    public StringsLog endTs(long endTs) {
        this.endTs = endTs;
        return this;
    }

    public StringsLog postError(String postError) {
        this.postError = postError;
        return this;
    }

    public StringsLog host_fix(String host_fix) {
        this.host_fix = host_fix;
        return this;
    }

    public StringsLog port_fix(int port_fix) {
        this.port_fix = port_fix;
        return this;
    }

    public StringsLog name_fix(String name_fix) {
        this.name_fix = name_fix;
        return this;
    }

    public StringsLog serialNo_fix(int serialNo_fix) {
        this.serialNo_fix = serialNo_fix;
        return this;
    }

    public StringsLog fwVersion_fix(String fwVersion_fix) {
        this.fwVersion_fix = fwVersion_fix;
        return this;
    }

    public StringsLog comparator_fix(int comparator_fix) {
        this.comparator_fix = comparator_fix;
        return this;
    }

    public StringsLog devider_fix(int devider_fix) {
        this.devider_fix = devider_fix;
        return this;
    }

    public StringsLog rawPulsesCounter_fix(int rawPulsesCounter_fix) {
        this.rawPulsesCounter_fix = rawPulsesCounter_fix;
        return this;
    }

    public StringsLog error(String error) {
        this.error = error;
        return this;
    }

    public StringsLog stringVoltage(int stringVoltage) {
        this.stringVoltage = stringVoltage;
        return this;
    }

    public StringsLog stringCurrent(float stringCurrent) {
        this.stringCurrent = stringCurrent;
        return this;
    }

    public StringsLog temperature(int temperature) {
        this.temperature = temperature;
        return this;
    }

    public StringsLog totalWatt(int totalWatt) {
        this.totalWatt = totalWatt;
        return this;
    }




    @Override
    public String toString() {
        return "{" +
            " gt_id='" + getGt_id() + "'" +
            ", st_id='" + getSt_id() + "'" +
            ", startTs='" + getStartTs() + "'" +
            ", endTs='" + getEndTs() + "'" +
            ", postError='" + getPostError() + "'" +
            ", host_fix='" + getHost_fix() + "'" +
            ", port_fix='" + getPort_fix() + "'" +
            ", name_fix='" + getName_fix() + "'" +
            ", serialNo_fix='" + getSerialNo_fix() + "'" +
            ", fwVersion_fix='" + getFwVersion_fix() + "'" +
            ", comparator_fix='" + getComparator_fix() + "'" +
            ", devider_fix='" + getDevider_fix() + "'" +
            ", rawPulsesCounter_fix='" + getRawPulsesCounter_fix() + "'" +
            ", error='" + getError() + "'" +
            ", stringVoltage='" + getStringVoltage() + "'" +
            ", stringCurrent='" + getStringCurrent() + "'" +
            ", temperature='" + getTemperature() + "'" +
            ", totalWatt='" + getTotalWatt() + "'" +
            "}";
    }

}
