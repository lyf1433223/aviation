package cn.lyf1433223.pojo.aviation;

import java.io.Serializable;

public class F_airport_basic_data implements Serializable{
    private Integer id;

    private String apt_Iata;

    private String apt_Icao;

    private String apt_Doi;

    private String apt_Hxdm;

    private String apt_Short_Chn;

    private String apt_Min_Chn;

    private String apt_Short_Eng;

    private String apt_Name_Chn;

    private String apt_Name_Eng;

    private String apt_Level;

    private String apt_Area;

    private String jx_Dm;

    private String apt_Rnwy_Lnth;

    private String apt_Jd;

    private String apt_Wd;

    private String apt_Altitude;

    private String apt_Distance;

    private Float apt_Jpjg;

    private String apt_Province;

    private String apt_Tel;

    private String apt_Tel_Atc;

    private String apt_Tel_Acc;

    private String apt_Fax;

    private String apt_Addr;

    private String apt_Zip;

    private String apt_Email;

    private String apt_Url;

    private String apt_Direct_Flt;

    private String apt_Dscrp;

    private String remark;

    public F_airport_basic_data() {
    }

    public F_airport_basic_data(Integer id) {
        this.id = id;
    }

    public F_airport_basic_data(Integer id, String apt_Iata, String apt_Icao, String apt_Doi, String apt_Hxdm, String apt_Short_Chn, String apt_Min_Chn, String apt_Short_Eng, String apt_Name_Chn, String apt_Name_Eng, String apt_Level, String apt_Area, String jx_Dm, String apt_Rnwy_Lnth, String apt_Jd, String apt_Wd, String apt_Altitude, String apt_Distance, Float apt_Jpjg, String apt_Province, String apt_Tel, String apt_Tel_Atc, String apt_Tel_Acc, String apt_Fax, String apt_Addr, String apt_Zip, String apt_Email, String apt_Url, String apt_Direct_Flt, String apt_Dscrp, String remark) {
        this.id = id;
        this.apt_Iata = apt_Iata;
        this.apt_Icao = apt_Icao;
        this.apt_Doi = apt_Doi;
        this.apt_Hxdm = apt_Hxdm;
        this.apt_Short_Chn = apt_Short_Chn;
        this.apt_Min_Chn = apt_Min_Chn;
        this.apt_Short_Eng = apt_Short_Eng;
        this.apt_Name_Chn = apt_Name_Chn;
        this.apt_Name_Eng = apt_Name_Eng;
        this.apt_Level = apt_Level;
        this.apt_Area = apt_Area;
        this.jx_Dm = jx_Dm;
        this.apt_Rnwy_Lnth = apt_Rnwy_Lnth;
        this.apt_Jd = apt_Jd;
        this.apt_Wd = apt_Wd;
        this.apt_Altitude = apt_Altitude;
        this.apt_Distance = apt_Distance;
        this.apt_Jpjg = apt_Jpjg;
        this.apt_Province = apt_Province;
        this.apt_Tel = apt_Tel;
        this.apt_Tel_Atc = apt_Tel_Atc;
        this.apt_Tel_Acc = apt_Tel_Acc;
        this.apt_Fax = apt_Fax;
        this.apt_Addr = apt_Addr;
        this.apt_Zip = apt_Zip;
        this.apt_Email = apt_Email;
        this.apt_Url = apt_Url;
        this.apt_Direct_Flt = apt_Direct_Flt;
        this.apt_Dscrp = apt_Dscrp;
        this.remark = remark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApt_Iata() {
        return apt_Iata;
    }

    public void setApt_Iata(String apt_Iata) {
        this.apt_Iata = apt_Iata;
    }

    public String getApt_Icao() {
        return apt_Icao;
    }

    public void setApt_Icao(String apt_Icao) {
        this.apt_Icao = apt_Icao;
    }

    public String getApt_Doi() {
        return apt_Doi;
    }

    public void setApt_Doi(String apt_Doi) {
        this.apt_Doi = apt_Doi;
    }

    public String getApt_Hxdm() {
        return apt_Hxdm;
    }

    public void setApt_Hxdm(String apt_Hxdm) {
        this.apt_Hxdm = apt_Hxdm;
    }

    public String getApt_Short_Chn() {
        return apt_Short_Chn;
    }

    public void setApt_Short_Chn(String apt_Short_Chn) {
        this.apt_Short_Chn = apt_Short_Chn;
    }

    public String getApt_Min_Chn() {
        return apt_Min_Chn;
    }

    public void setApt_Min_Chn(String apt_Min_Chn) {
        this.apt_Min_Chn = apt_Min_Chn;
    }

    public String getApt_Short_Eng() {
        return apt_Short_Eng;
    }

    public void setApt_Short_Eng(String apt_Short_Eng) {
        this.apt_Short_Eng = apt_Short_Eng;
    }

    public String getApt_Name_Chn() {
        return apt_Name_Chn;
    }

    public void setApt_Name_Chn(String apt_Name_Chn) {
        this.apt_Name_Chn = apt_Name_Chn;
    }

    public String getApt_Name_Eng() {
        return apt_Name_Eng;
    }

    public void setApt_Name_Eng(String apt_Name_Eng) {
        this.apt_Name_Eng = apt_Name_Eng;
    }

    public String getApt_Level() {
        return apt_Level;
    }

    public void setApt_Level(String apt_Level) {
        this.apt_Level = apt_Level;
    }

    public String getApt_Area() {
        return apt_Area;
    }

    public void setApt_Area(String apt_Area) {
        this.apt_Area = apt_Area;
    }

    public String getJx_Dm() {
        return jx_Dm;
    }

    public void setJx_Dm(String jx_Dm) {
        this.jx_Dm = jx_Dm;
    }

    public String getApt_Rnwy_Lnth() {
        return apt_Rnwy_Lnth;
    }

    public void setApt_Rnwy_Lnth(String apt_Rnwy_Lnth) {
        this.apt_Rnwy_Lnth = apt_Rnwy_Lnth;
    }

    public String getApt_Jd() {
        return apt_Jd;
    }

    public void setApt_Jd(String apt_Jd) {
        this.apt_Jd = apt_Jd;
    }

    public String getApt_Wd() {
        return apt_Wd;
    }

    public void setApt_Wd(String apt_Wd) {
        this.apt_Wd = apt_Wd;
    }

    public String getApt_Altitude() {
        return apt_Altitude;
    }

    public void setApt_Altitude(String apt_Altitude) {
        this.apt_Altitude = apt_Altitude;
    }

    public String getApt_Distance() {
        return apt_Distance;
    }

    public void setApt_Distance(String apt_Distance) {
        this.apt_Distance = apt_Distance;
    }

    public Float getApt_Jpjg() {
        return apt_Jpjg;
    }

    public void setApt_Jpjg(Float apt_Jpjg) {
        this.apt_Jpjg = apt_Jpjg;
    }

    public String getApt_Province() {
        return apt_Province;
    }

    public void setApt_Province(String apt_Province) {
        this.apt_Province = apt_Province;
    }

    public String getApt_Tel() {
        return apt_Tel;
    }

    public void setApt_Tel(String apt_Tel) {
        this.apt_Tel = apt_Tel;
    }

    public String getApt_Tel_Atc() {
        return apt_Tel_Atc;
    }

    public void setApt_Tel_Atc(String apt_Tel_Atc) {
        this.apt_Tel_Atc = apt_Tel_Atc;
    }

    public String getApt_Tel_Acc() {
        return apt_Tel_Acc;
    }

    public void setApt_Tel_Acc(String apt_Tel_Acc) {
        this.apt_Tel_Acc = apt_Tel_Acc;
    }

    public String getApt_Fax() {
        return apt_Fax;
    }

    public void setApt_Fax(String apt_Fax) {
        this.apt_Fax = apt_Fax;
    }

    public String getApt_Addr() {
        return apt_Addr;
    }

    public void setApt_Addr(String apt_Addr) {
        this.apt_Addr = apt_Addr;
    }

    public String getApt_Zip() {
        return apt_Zip;
    }

    public void setApt_Zip(String apt_Zip) {
        this.apt_Zip = apt_Zip;
    }

    public String getApt_Email() {
        return apt_Email;
    }

    public void setApt_Email(String apt_Email) {
        this.apt_Email = apt_Email;
    }

    public String getApt_Url() {
        return apt_Url;
    }

    public void setApt_Url(String apt_Url) {
        this.apt_Url = apt_Url;
    }

    public String getApt_Direct_Flt() {
        return apt_Direct_Flt;
    }

    public void setApt_Direct_Flt(String apt_Direct_Flt) {
        this.apt_Direct_Flt = apt_Direct_Flt;
    }

    public String getApt_Dscrp() {
        return apt_Dscrp;
    }

    public void setApt_Dscrp(String apt_Dscrp) {
        this.apt_Dscrp = apt_Dscrp;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "F_airport_basic_data{" +
                "id=" + id +
                ", apt_Iata='" + apt_Iata + '\'' +
                ", apt_Icao='" + apt_Icao + '\'' +
                ", apt_Doi='" + apt_Doi + '\'' +
                ", apt_Hxdm='" + apt_Hxdm + '\'' +
                ", apt_Short_Chn='" + apt_Short_Chn + '\'' +
                ", apt_Min_Chn='" + apt_Min_Chn + '\'' +
                ", apt_Short_Eng='" + apt_Short_Eng + '\'' +
                ", apt_Name_Chn='" + apt_Name_Chn + '\'' +
                ", apt_Name_Eng='" + apt_Name_Eng + '\'' +
                ", apt_Level='" + apt_Level + '\'' +
                ", apt_Area='" + apt_Area + '\'' +
                ", jx_Dm='" + jx_Dm + '\'' +
                ", apt_Rnwy_Lnth='" + apt_Rnwy_Lnth + '\'' +
                ", apt_Jd='" + apt_Jd + '\'' +
                ", apt_Wd='" + apt_Wd + '\'' +
                ", apt_Altitude='" + apt_Altitude + '\'' +
                ", apt_Distance='" + apt_Distance + '\'' +
                ", apt_Jpjg=" + apt_Jpjg +
                ", apt_Province='" + apt_Province + '\'' +
                ", apt_Tel='" + apt_Tel + '\'' +
                ", apt_Tel_Atc='" + apt_Tel_Atc + '\'' +
                ", apt_Tel_Acc='" + apt_Tel_Acc + '\'' +
                ", apt_Fax='" + apt_Fax + '\'' +
                ", apt_Addr='" + apt_Addr + '\'' +
                ", apt_Zip='" + apt_Zip + '\'' +
                ", apt_Email='" + apt_Email + '\'' +
                ", apt_Url='" + apt_Url + '\'' +
                ", apt_Direct_Flt='" + apt_Direct_Flt + '\'' +
                ", apt_Dscrp='" + apt_Dscrp + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}