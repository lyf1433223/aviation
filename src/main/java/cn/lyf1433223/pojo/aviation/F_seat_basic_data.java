package cn.lyf1433223.pojo.aviation;

import java.io.Serializable;

public class F_seat_basic_data implements Serializable{
    private Integer id;

    private String bay_no;

    private String bay_sx;

    private String bay_tksx;

    private String bay_jwc;

    private String bay_jwk;

    private String bay_lx;

    private String bay_zjwbm;

    private String bay_yjwbm;

    private String bay_zt;

    private String bay_yxj;

    private String remark;

    public F_seat_basic_data() {
    }

    public F_seat_basic_data(Integer id) {
        this.id = id;
    }

    public F_seat_basic_data(Integer id, String bay_no, String bay_sx, String bay_tksx, String bay_jwc, String bay_jwk, String bay_lx, String bay_zjwbm, String bay_yjwbm, String bay_zt, String bay_yxj, String remark) {
        this.id = id;
        this.bay_no = bay_no;
        this.bay_sx = bay_sx;
        this.bay_tksx = bay_tksx;
        this.bay_jwc = bay_jwc;
        this.bay_jwk = bay_jwk;
        this.bay_lx = bay_lx;
        this.bay_zjwbm = bay_zjwbm;
        this.bay_yjwbm = bay_yjwbm;
        this.bay_zt = bay_zt;
        this.bay_yxj = bay_yxj;
        this.remark = remark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBay_no() {
        return bay_no;
    }

    public void setBay_no(String bay_no) {
        this.bay_no = bay_no;
    }

    public String getBay_sx() {
        return bay_sx;
    }

    public void setBay_sx(String bay_sx) {
        this.bay_sx = bay_sx;
    }

    public String getBay_tksx() {
        return bay_tksx;
    }

    public void setBay_tksx(String bay_tksx) {
        this.bay_tksx = bay_tksx;
    }

    public String getBay_jwc() {
        return bay_jwc;
    }

    public void setBay_jwc(String bay_jwc) {
        this.bay_jwc = bay_jwc;
    }

    public String getBay_jwk() {
        return bay_jwk;
    }

    public void setBay_jwk(String bay_jwk) {
        this.bay_jwk = bay_jwk;
    }

    public String getBay_lx() {
        return bay_lx;
    }

    public void setBay_lx(String bay_lx) {
        this.bay_lx = bay_lx;
    }

    public String getBay_zjwbm() {
        return bay_zjwbm;
    }

    public void setBay_zjwbm(String bay_zjwbm) {
        this.bay_zjwbm = bay_zjwbm;
    }

    public String getBay_yjwbm() {
        return bay_yjwbm;
    }

    public void setBay_yjwbm(String bay_yjwbm) {
        this.bay_yjwbm = bay_yjwbm;
    }

    public String getBay_zt() {
        return bay_zt;
    }

    public void setBay_zt(String bay_zt) {
        this.bay_zt = bay_zt;
    }

    public String getBay_yxj() {
        return bay_yxj;
    }

    public void setBay_yxj(String bay_yxj) {
        this.bay_yxj = bay_yxj;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "F_seat_basic_data{" +
                "id=" + id +
                ", bay_no='" + bay_no + '\'' +
                ", bay_sx='" + bay_sx + '\'' +
                ", bay_tksx='" + bay_tksx + '\'' +
                ", bay_jwc='" + bay_jwc + '\'' +
                ", bay_jwk='" + bay_jwk + '\'' +
                ", bay_lx='" + bay_lx + '\'' +
                ", bay_zjwbm='" + bay_zjwbm + '\'' +
                ", bay_yjwbm='" + bay_yjwbm + '\'' +
                ", bay_zt='" + bay_zt + '\'' +
                ", bay_yxj='" + bay_yxj + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}