package cn.lyf1433223.pojo.aviation;

import java.io.Serializable;
import java.util.Date;

public class F_passenger_info implements Serializable{
    private Integer id;

    private String code;

    private Integer relation_Id;

    private String flight_No;

    private String name;

    private String seat;

    private String cabin;

    private String voyage;

    private String check_Time;

    private String check_Counter;

    private String security_Time;

    private String security_Channel;

    private String boarding_Time;

    private String peer;

    private String arrive;

    private String remark;

    public F_passenger_info() {
    }

    public F_passenger_info(Integer id) {
        this.id = id;
    }

    public F_passenger_info(Integer id, String code, Integer relation_Id, String flight_No, String name, String seat, String cabin, String voyage, String check_Time, String check_Counter, String security_Time, String security_Channel, String boarding_Time, String peer, String arrive, String remark) {
        this.id = id;
        this.code = code;
        this.relation_Id = relation_Id;
        this.flight_No = flight_No;
        this.name = name;
        this.seat = seat;
        this.cabin = cabin;
        this.voyage = voyage;
        this.check_Time = check_Time;
        this.check_Counter = check_Counter;
        this.security_Time = security_Time;
        this.security_Channel = security_Channel;
        this.boarding_Time = boarding_Time;
        this.peer = peer;
        this.arrive = arrive;
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

    public Integer getRelation_Id() {
        return relation_Id;
    }

    public void setRelation_Id(Integer relation_Id) {
        this.relation_Id = relation_Id;
    }

    public String getFlight_No() {
        return flight_No;
    }

    public void setFlight_No(String flight_No) {
        this.flight_No = flight_No;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public String getVoyage() {
        return voyage;
    }

    public void setVoyage(String voyage) {
        this.voyage = voyage;
    }

    public String getCheck_Time() {
        return check_Time;
    }

    public void setCheck_Time(String check_Time) {
        this.check_Time = check_Time;
    }

    public String getCheck_Counter() {
        return check_Counter;
    }

    public void setCheck_Counter(String check_Counter) {
        this.check_Counter = check_Counter;
    }

    public String getSecurity_Time() {
        return security_Time;
    }

    public void setSecurity_Time(String security_Time) {
        this.security_Time = security_Time;
    }

    public String getSecurity_Channel() {
        return security_Channel;
    }

    public void setSecurity_Channel(String security_Channel) {
        this.security_Channel = security_Channel;
    }

    public String getBoarding_Time() {
        return boarding_Time;
    }

    public void setBoarding_Time(String boarding_Time) {
        this.boarding_Time = boarding_Time;
    }

    public String getPeer() {
        return peer;
    }

    public void setPeer(String peer) {
        this.peer = peer;
    }

    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "F_passenger_info{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", relation_Id=" + relation_Id +
                ", flight_No='" + flight_No + '\'' +
                ", name='" + name + '\'' +
                ", seat='" + seat + '\'' +
                ", cabin='" + cabin + '\'' +
                ", voyage='" + voyage + '\'' +
                ", check_Time='" + check_Time + '\'' +
                ", check_Counter='" + check_Counter + '\'' +
                ", security_Time='" + security_Time + '\'' +
                ", security_Channel='" + security_Channel + '\'' +
                ", boarding_Time='" + boarding_Time + '\'' +
                ", peer='" + peer + '\'' +
                ", arrive='" + arrive + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}