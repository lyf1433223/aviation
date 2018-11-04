package cn.lyf1433223.pojo.aviation;

import java.io.Serializable;

public class F_gate_basic_data implements Serializable{
    private Integer id;

    private String code;

    private String name;

    private String attribute;

    private String type;

    private String state;

    private String bay;

    private String terminal;

    private String tpxs;

    private String remark;

    public F_gate_basic_data() {
    }

    public F_gate_basic_data(Integer id) {
        this.id = id;
    }

    public F_gate_basic_data(Integer id, String code, String name, String attribute, String type, String state, String bay, String terminal, String tpxs, String remark) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.attribute = attribute;
        this.type = type;
        this.state = state;
        this.bay = bay;
        this.terminal = terminal;
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

    public String getBay() {
        return bay;
    }

    public void setBay(String bay) {
        this.bay = bay;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
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
        return "F_gate_basic_data{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", attribute='" + attribute + '\'' +
                ", type='" + type + '\'' +
                ", state='" + state + '\'' +
                ", bay='" + bay + '\'' +
                ", terminal='" + terminal + '\'' +
                ", tpxs='" + tpxs + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}