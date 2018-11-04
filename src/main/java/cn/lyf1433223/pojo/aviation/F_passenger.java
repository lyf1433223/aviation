package cn.lyf1433223.pojo.aviation;

import java.io.Serializable;
import java.util.Date;

public class F_passenger implements Serializable{
    private Integer id;

    private String code;

    private String name;

    private String id_Number;

    private String tel;

    private String sex;

    private String email;

    private String is_Vip;

    private String last_Land_Time;

    private String last_Land_Flight;

    private String remark;

    public F_passenger() {
    }

    public F_passenger(Integer id) {
        this.id = id;
    }

    public F_passenger(Integer id, String code, String name, String id_Number, String tel, String sex, String email, String is_Vip, String last_Land_Time, String last_Land_Flight, String remark) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.id_Number = id_Number;
        this.tel = tel;
        this.sex = sex;
        this.email = email;
        this.is_Vip = is_Vip;
        this.last_Land_Time = last_Land_Time;
        this.last_Land_Flight = last_Land_Flight;
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

    public String getId_Number() {
        return id_Number;
    }

    public void setId_Number(String id_Number) {
        this.id_Number = id_Number;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIs_Vip() {
        return is_Vip;
    }

    public void setIs_Vip(String is_Vip) {
        this.is_Vip = is_Vip;
    }

    public String getLast_Land_Time() {
        return last_Land_Time;
    }

    public void setLast_Land_Time(String last_Land_Time) {
        this.last_Land_Time = last_Land_Time;
    }

    public String getLast_Land_Flight() {
        return last_Land_Flight;
    }

    public void setLast_Land_Flight(String last_Land_Flight) {
        this.last_Land_Flight = last_Land_Flight;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "F_passenger{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", id_Number='" + id_Number + '\'' +
                ", tel='" + tel + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", is_Vip='" + is_Vip + '\'' +
                ", last_Land_Time='" + last_Land_Time + '\'' +
                ", last_Land_Flight='" + last_Land_Flight + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}