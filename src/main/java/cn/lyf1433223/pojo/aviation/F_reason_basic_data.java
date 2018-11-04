package cn.lyf1433223.pojo.aviation;

import java.io.Serializable;

public class F_reason_basic_data implements Serializable{
    private Integer id;

    private String code;

    private String zwms;

    private String ywms;

    private String remark;

    public F_reason_basic_data() {
    }

    public F_reason_basic_data(Integer id) {
        this.id = id;
    }

    public F_reason_basic_data(Integer id, String code, String zwms, String ywms, String remark) {
        this.id = id;
        this.code = code;
        this.zwms = zwms;
        this.ywms = ywms;
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

    public String getZwms() {
        return zwms;
    }

    public void setZwms(String zwms) {
        this.zwms = zwms;
    }

    public String getYwms() {
        return ywms;
    }

    public void setYwms(String ywms) {
        this.ywms = ywms;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "F_reason_basic_data{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", zwms='" + zwms + '\'' +
                ", ywms='" + ywms + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}