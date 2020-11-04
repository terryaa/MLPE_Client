package com.qcells.data_server.dto;


public class GatewayLog {
    private int gt_id;
    private long startTs;
    private long endTs;
    private String mac_fix;
    private String sn_fix;
    private String software_version_fix;
    private String ioboard_fix;

    public GatewayLog() {
    }

    public GatewayLog(int gt_id, long startTs, long endTs, String mac_fix, String sn_fix, String software_version_fix, String ioboard_fix) {
        this.gt_id = gt_id;
        this.startTs = startTs;
        this.endTs = endTs;
        this.mac_fix = mac_fix;
        this.sn_fix = sn_fix;
        this.software_version_fix = software_version_fix;
        this.ioboard_fix = ioboard_fix;
    }

    public int getGt_id() {
        return this.gt_id;
    }

    public void setGt_id(int gt_id) {
        this.gt_id = gt_id;
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

    public String getMac_fix() {
        return this.mac_fix;
    }

    public void setMac_fix(String mac_fix) {
        this.mac_fix = mac_fix;
    }

    public String getSn_fix() {
        return this.sn_fix;
    }

    public void setSn_fix(String sn_fix) {
        this.sn_fix = sn_fix;
    }

    public String getSoftware_version_fix() {
        return this.software_version_fix;
    }

    public void setSoftware_version_fix(String software_version_fix) {
        this.software_version_fix = software_version_fix;
    }

    public String getIoboard_fix() {
        return this.ioboard_fix;
    }

    public void setIoboard_fix(String ioboard_fix) {
        this.ioboard_fix = ioboard_fix;
    }

    public GatewayLog gt_id(int gt_id) {
        this.gt_id = gt_id;
        return this;
    }

    public GatewayLog startTs(long startTs) {
        this.startTs = startTs;
        return this;
    }

    public GatewayLog endTs(long endTs) {
        this.endTs = endTs;
        return this;
    }

    public GatewayLog mac_fix(String mac_fix) {
        this.mac_fix = mac_fix;
        return this;
    }

    public GatewayLog sn_fix(String sn_fix) {
        this.sn_fix = sn_fix;
        return this;
    }

    public GatewayLog software_version_fix(String software_version_fix) {
        this.software_version_fix = software_version_fix;
        return this;
    }

    public GatewayLog ioboard_fix(String ioboard_fix) {
        this.ioboard_fix = ioboard_fix;
        return this;
    }
    @Override
    public String toString() {
        return "{" +
            " gt_id='" + getGt_id() + "'" +
            ", startTs='" + getStartTs() + "'" +
            ", endTs='" + getEndTs() + "'" +
            ", mac_fix='" + getMac_fix() + "'" +
            ", sn_fix='" + getSn_fix() + "'" +
            ", software_version_fix='" + getSoftware_version_fix() + "'" +
            ", ioboard_fix='" + getIoboard_fix() + "'" +
            "}";
    }

}
