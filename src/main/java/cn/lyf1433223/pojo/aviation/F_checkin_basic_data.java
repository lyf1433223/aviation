package cn.lyf1433223.pojo.aviation;

import java.io.Serializable;

public class F_checkin_basic_data implements Serializable{
    private Integer id;

    private String code;

    private String name;

    private String number;

    private String company;

    private String region;

    private String terminal;

    private String attribute;

    private String type;

    private String state;

    private String csd;

    private String tpxs;

    private String remark;

    public F_checkin_basic_data() {
    }

    public F_checkin_basic_data(Integer id) {
        this.id = id;
    }

    public F_checkin_basic_data(Integer id, String code, String name, String number, String company, String region, String terminal, String attribute, String type, String state, String csd, String tpxs, String remark) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.number = number;
        this.company = company;
        this.region = region;
        this.terminal = terminal;
        this.attribute = attribute;
        this.type = type;
        this.state = state;
        this.csd = csd;
        this.tpxs = tpxs;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCsd() {
        return csd;
    }

    public void setCsd(String csd) {
        this.csd = csd;
    }

    public String getTpxs() {
        return tpxs;
    }

    public void setTpxs(String tpxs) {
        this.tpxs = tpxs;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "F_checkin_basic_data{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", company='" + company + '\'' +
                ", region='" + region + '\'' +
                ", terminal='" + terminal + '\'' +
                ", attribute='" + attribute + '\'' +
                ", type='" + type + '\'' +
                ", state='" + state + '\'' +
                ", csd='" + csd + '\'' +
                ", tpxs='" + tpxs + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}