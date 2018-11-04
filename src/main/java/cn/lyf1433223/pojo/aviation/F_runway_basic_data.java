package cn.lyf1433223.pojo.aviation;

import java.io.Serializable;
import java.math.BigDecimal;

public class F_runway_basic_data implements Serializable{
    private Integer id;

    private String number;

    private BigDecimal length;

    private String direction;

    private String attribute;

    private String remark;

    public F_runway_basic_data() {
    }

    public F_runway_basic_data(Integer id) {
        this.id = id;
    }

    public F_runway_basic_data(Integer id, String number, BigDecimal length, String direction, String attribute, String remark) {
        this.id = id;
        this.number = number;
        this.length = length;
        this.direction = direction;
        this.attribute = attribute;
        this.remark = remark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "F_runway_basic_data{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", length=" + length +
                ", direction='" + direction + '\'' +
                ", attribute='" + attribute + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}