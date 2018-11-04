package cn.lyf1433223.pojo.aviation;


/**
 * @ClassName:f_turntable_basic_data 
 * @Description: TODO(��˵����f_turntable_basic_data )
 * @author Uncle liu 
 * @date 2018-11-02 12:04:57
 */ 

public class F_turntable_basic_data{
	private Integer id;
	private String xl_zpbm;
	private String xl_zpsx;
	private Integer xl_zpzt;
	private String lb_bm_ss;
	private String xl_hjl;
	private String xl_tpxs;
	private String remark;
	public F_turntable_basic_data(){
	}
	public F_turntable_basic_data(Integer id,String xl_zpbm,String xl_zpsx,Integer xl_zpzt,String lb_bm_ss,String xl_hjl,String xl_tpxs,String remark){
		this.id=id;
		this.xl_zpbm=xl_zpbm;
		this.xl_zpsx=xl_zpsx;
		this.xl_zpzt=xl_zpzt;
		this.lb_bm_ss=lb_bm_ss;
		this.xl_hjl=xl_hjl;
		this.xl_tpxs=xl_tpxs;
		this.remark=remark;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}
	public void setXl_zpbm(String xl_zpbm){
		this.xl_zpbm=xl_zpbm;
	}
	public String getXl_zpbm(){
		return xl_zpbm;
	}
	public void setXl_zpsx(String xl_zpsx){
		this.xl_zpsx=xl_zpsx;
	}
	public String getXl_zpsx(){
		return xl_zpsx;
	}
	public void setXl_zpzt(Integer xl_zpzt){
		this.xl_zpzt=xl_zpzt;
	}
	public Integer getXl_zpzt(){
		return xl_zpzt;
	}
	public void setLb_bm_ss(String lb_bm_ss){
		this.lb_bm_ss=lb_bm_ss;
	}
	public String getLb_bm_ss(){
		return lb_bm_ss;
	}
	public void setXl_hjl(String xl_hjl){
		this.xl_hjl=xl_hjl;
	}
	public String getXl_hjl(){
		return xl_hjl;
	}
	public void setXl_tpxs(String xl_tpxs){
		this.xl_tpxs=xl_tpxs;
	}
	public String getXl_tpxs(){
		return xl_tpxs;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getRemark(){
		return remark;
	}
	public String toString() { 
		return "F_turntable_basic_data[id=" + id + ",xl_zpbm=" + xl_zpbm + ",xl_zpsx=" + xl_zpsx + ","+
		"xl_zpzt=" + xl_zpzt + ",lb_bm_ss=" + lb_bm_ss + ",xl_hjl=" + xl_hjl + ","+
		"xl_tpxs=" + xl_tpxs + ",remark=" + remark + "]";
	}
}

