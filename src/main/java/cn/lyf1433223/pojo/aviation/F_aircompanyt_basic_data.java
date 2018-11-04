package cn.lyf1433223.pojo.aviation;

import java.util.Date;

/**
 * @ClassName:f_aircompanyt_basic_data 
 * @Description: TODO(��˵����f_aircompanyt_basic_data )
 * @author Uncle liu 
 * @date 2018-11-02 12:04:41
 */ 

public class F_aircompanyt_basic_data{
	private Integer id;
	private String aln_iata;
	private String aln_icao;
	private String aln_iod;
	private String aln_agent;
	private String aln_terminal;
	private String aln_short_chn;
	private String aln_short_eng;
	private String aln_name_chn;
	private String aln_name_eng;
	private String aln_tel;
	private String aln_dispatcher;
	private String aln_office;
	private String aln_zcjg;
	private String aln_url;
	private String aln_logo;
	private String aln_dscrp;
	private String aln_firsttime;
	private String aln_parent_com;
	private String remark1;
	public F_aircompanyt_basic_data(){
	}
	public F_aircompanyt_basic_data(Integer id,String aln_iata,String aln_icao,String aln_iod,String aln_agent,String aln_terminal,String aln_short_chn,String aln_short_eng,String aln_name_chn,String aln_name_eng,String aln_tel,String aln_dispatcher,String aln_office,String aln_zcjg,String aln_url,String aln_logo,String aln_dscrp,String aln_firsttime,String aln_parent_com,String remark1){
		this.id=id;
		this.aln_iata=aln_iata;
		this.aln_icao=aln_icao;
		this.aln_iod=aln_iod;
		this.aln_agent=aln_agent;
		this.aln_terminal=aln_terminal;
		this.aln_short_chn=aln_short_chn;
		this.aln_short_eng=aln_short_eng;
		this.aln_name_chn=aln_name_chn;
		this.aln_name_eng=aln_name_eng;
		this.aln_tel=aln_tel;
		this.aln_dispatcher=aln_dispatcher;
		this.aln_office=aln_office;
		this.aln_zcjg=aln_zcjg;
		this.aln_url=aln_url;
		this.aln_logo=aln_logo;
		this.aln_dscrp=aln_dscrp;
		this.aln_firsttime=aln_firsttime;
		this.aln_parent_com=aln_parent_com;
		this.remark1=remark1;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}
	public void setAln_iata(String aln_iata){
		this.aln_iata=aln_iata;
	}
	public String getAln_iata(){
		return aln_iata;
	}
	public void setAln_icao(String aln_icao){
		this.aln_icao=aln_icao;
	}
	public String getAln_icao(){
		return aln_icao;
	}
	public void setAln_iod(String aln_iod){
		this.aln_iod=aln_iod;
	}
	public String getAln_iod(){
		return aln_iod;
	}
	public void setAln_agent(String aln_agent){
		this.aln_agent=aln_agent;
	}
	public String getAln_agent(){
		return aln_agent;
	}
	public void setAln_terminal(String aln_terminal){
		this.aln_terminal=aln_terminal;
	}
	public String getAln_terminal(){
		return aln_terminal;
	}
	public void setAln_short_chn(String aln_short_chn){
		this.aln_short_chn=aln_short_chn;
	}
	public String getAln_short_chn(){
		return aln_short_chn;
	}
	public void setAln_short_eng(String aln_short_eng){
		this.aln_short_eng=aln_short_eng;
	}
	public String getAln_short_eng(){
		return aln_short_eng;
	}
	public void setAln_name_chn(String aln_name_chn){
		this.aln_name_chn=aln_name_chn;
	}
	public String getAln_name_chn(){
		return aln_name_chn;
	}
	public void setAln_name_eng(String aln_name_eng){
		this.aln_name_eng=aln_name_eng;
	}
	public String getAln_name_eng(){
		return aln_name_eng;
	}
	public void setAln_tel(String aln_tel){
		this.aln_tel=aln_tel;
	}
	public String getAln_tel(){
		return aln_tel;
	}
	public void setAln_dispatcher(String aln_dispatcher){
		this.aln_dispatcher=aln_dispatcher;
	}
	public String getAln_dispatcher(){
		return aln_dispatcher;
	}
	public void setAln_office(String aln_office){
		this.aln_office=aln_office;
	}
	public String getAln_office(){
		return aln_office;
	}
	public void setAln_zcjg(String aln_zcjg){
		this.aln_zcjg=aln_zcjg;
	}
	public String getAln_zcjg(){
		return aln_zcjg;
	}
	public void setAln_url(String aln_url){
		this.aln_url=aln_url;
	}
	public String getAln_url(){
		return aln_url;
	}
	public void setAln_logo(String aln_logo){
		this.aln_logo=aln_logo;
	}
	public String getAln_logo(){
		return aln_logo;
	}
	public void setAln_dscrp(String aln_dscrp){
		this.aln_dscrp=aln_dscrp;
	}
	public String getAln_dscrp(){
		return aln_dscrp;
	}
	public void setAln_firsttime(String aln_firsttime){
		this.aln_firsttime=aln_firsttime;
	}
	public String getAln_firsttime(){
		return aln_firsttime;
	}
	public void setAln_parent_com(String aln_parent_com){
		this.aln_parent_com=aln_parent_com;
	}
	public String getAln_parent_com(){
		return aln_parent_com;
	}
	public void setRemark1(String remark1){
		this.remark1=remark1;
	}
	public String getRemark1(){
		return remark1;
	}
	public String toString() { 
		return "F_aircompanyt_basic_data[id=" + id + ",aln_iata=" + aln_iata + ",aln_icao=" + aln_icao + ","+
		"aln_iod=" + aln_iod + ",aln_agent=" + aln_agent + ",aln_terminal=" + aln_terminal + ","+
		"aln_short_chn=" + aln_short_chn + ",aln_short_eng=" + aln_short_eng + ",aln_name_chn=" + aln_name_chn + ","+
		"aln_name_eng=" + aln_name_eng + ",aln_tel=" + aln_tel + ",aln_dispatcher=" + aln_dispatcher + ","+
		"aln_office=" + aln_office + ",aln_zcjg=" + aln_zcjg + ",aln_url=" + aln_url + ","+
		"aln_logo=" + aln_logo + ",aln_dscrp=" + aln_dscrp + ",aln_firsttime=" + aln_firsttime + ","+
		"aln_parent_com=" + aln_parent_com + ",remark1=" + remark1 + "]";
	}
}

