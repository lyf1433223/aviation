package cn.lyf1433223.pojo.aviation;

import java.io.Serializable;

public class F_rec_basic_data implements Serializable{
    private Integer id;

    private String code;

    private String number;

    private String bay;

    private String terminal;

    private String remark;

    public F_rec_basic_data() {
    }

    public F_rec_basic_data(Integer id) {
        this.id = id;
    }

    public F_rec_basic_data(Integer id, String code, String number, String bay, String terminal, String remark) {
        this.id = id;
        this.code = code;
        this.number = number;
        this.bay = bay;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "F_rec_basic_data{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", number='" + number + '\'' +
                ", bay='" + bay + '\'' +
                ", terminal='" + terminal + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}