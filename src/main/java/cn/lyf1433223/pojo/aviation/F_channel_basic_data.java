package cn.lyf1433223.pojo.aviation;

import java.io.Serializable;

public class F_channel_basic_data implements Serializable{
    private Integer id;

    private String code;

    private String number;

    private String attribute;

    private String region;

    private Integer state;

    private String tpxs;

    private String terminal;

    private String remark;

    public F_channel_basic_data() {
    }

    public F_channel_basic_data(Integer id) {
        this.id = id;
    }

    public F_channel_basic_data(Integer id, String code, String number, String attribute, String region, Integer state, String tpxs, String terminal, String remark) {
        this.id = id;
        this.code = code;
        this.number = number;
        this.attribute = attribute;
        this.region = region;
        this.state = state;
        this.tpxs = tpxs;
        this.terminal = terminal;
        this.remark = remark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getTpxs() {
        return tpxs;
    }

    public void setTpxs(String tpxs) {
        this.tpxs = tpxs;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "F_channel_basic_data{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", number='" + number + '\'' +
                ", attribute='" + attribute + '\'' +
                ", region='" + region + '\'' +
                ", state=" + state +
                ", tpxs='" + tpxs + '\'' +
                ", terminal='" + terminal + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}