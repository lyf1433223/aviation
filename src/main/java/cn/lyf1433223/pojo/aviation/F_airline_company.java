package cn.lyf1433223.pojo.aviation;

import java.util.Date;

/**
 * @ClassName:f_airline_company 
 * @Description: TODO(��˵����f_airline_company )
 * @author Uncle liu 
 * @date 2018-10-28 16:21:11
 */ 

public class F_airline_company{
	private Integer id;
	private String airline_company;
	private String add_time;
	public F_airline_company(){
	}
	public F_airline_company(Integer id,String airline_company,String add_time){
		this.id=id;
		this.airline_company=airline_company;
		this.add_time=add_time;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}
	public void setAirline_company(String airline_company){
		this.airline_company=airline_company;
	}
	public String getAirline_company(){
		return airline_company;
	}
	public void setAdd_time(String add_time){
		this.add_time=add_time;
	}
	public String getAdd_time(){
		return add_time;
	}
	public String toString() { 
		return "F_airline_company[id=" + id + ",airline_company=" + airline_company + ",add_time=" + add_time + "]";
	}
}

