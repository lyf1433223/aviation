package cn.lyf1433223.pojo.aviation;

import java.util.Date;

public class F_aircraft_basic_data {
    private Integer id;

    private String flt_Reg;

    private String flt_Type;

    private String mtow;

    private String payload;

    private String max_Seats;

    private String wide_Body;

    private String flt_Types;

    private String aln_Iata;

    private String aln_Icao;

    private String aln_Internal;

    private String aln_Internal_Chn;

    private String start_Date;

    private String end_Date;

    private String change_Flag;

    private String remark;

    public F_aircraft_basic_data() {
    }

    public F_aircraft_basic_data(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlt_Reg() {
        return flt_Reg;
    }

    public void setFlt_Reg(String flt_Reg) {
        this.flt_Reg = flt_Reg;
    }

    public String getFlt_Type() {
        return flt_Type;
    }

    public void setFlt_Type(String flt_Type) {
        this.flt_Type = flt_Type;
    }

    public String getMtow() {
        return mtow;
    }

    public void setMtow(String mtow) {
        this.mtow = mtow;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getMax_Seats() {
        return max_Seats;
    }

    public void setMax_Seats(String max_Seats) {
        this.max_Seats = max_Seats;
    }

    public String getWide_Body() {
        return wide_Body;
    }

    public void setWide_Body(String wide_Body) {
        this.wide_Body = wide_Body;
    }

    public String getFlt_Types() {
        return flt_Types;
    }

    public void setFlt_Types(String flt_Types) {
        this.flt_Types = flt_Types;
    }

    public String getAln_Iata() {
        return aln_Iata;
    }

    public void setAln_Iata(String aln_Iata) {
        this.aln_Iata = aln_Iata;
    }

    public String getAln_Icao() {
        return aln_Icao;
    }

    public void setAln_Icao(String aln_Icao) {
        this.aln_Icao = aln_Icao;
    }

    public String getAln_Internal() {
        return aln_Internal;
    }

    public void setAln_Internal(String aln_Internal) {
        this.aln_Internal = aln_Internal;
    }

    public String getAln_Internal_Chn() {
        return aln_Internal_Chn;
    }

    public void setAln_Internal_Chn(String aln_Internal_Chn) {
        this.aln_Internal_Chn = aln_Internal_Chn;
    }

    public String getStart_Date() {
        return start_Date;
    }

    public void setStart_Date(String start_Date) {
        this.start_Date = start_Date;
    }

    public String getEnd_Date() {
        return end_Date;
    }

    public void setEnd_Date(String end_Date) {
        this.end_Date = end_Date;
    }

    public String getChange_Flag() {
        return change_Flag;
    }

    public void setChange_Flag(String change_Flag) {
        this.change_Flag = change_Flag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "F_aircraft_basic_data{" +
                "id=" + id +
                ", flt_Reg='" + flt_Reg + '\'' +
                ", flt_Type='" + flt_Type + '\'' +
                ", mtow='" + mtow + '\'' +
                ", payload='" + payload + '\'' +
                ", max_Seats='" + max_Seats + '\'' +
                ", wide_Body='" + wide_Body + '\'' +
                ", flt_Types='" + flt_Types + '\'' +
                ", aln_Iata='" + aln_Iata + '\'' +
                ", aln_Icao='" + aln_Icao + '\'' +
                ", aln_Internal='" + aln_Internal + '\'' +
                ", aln_Internal_Chn='" + aln_Internal_Chn + '\'' +
                ", start_Date='" + start_Date + '\'' +
                ", end_Date='" + end_Date + '\'' +
                ", change_Flag='" + change_Flag + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}