package cn.lyf1433223.pojo.aviation;

import java.util.Date;

/**
 * @ClassName:f_flight_report_year 
 * @Description: TODO(��˵����f_flight_report_year )
 * @author Uncle liu 
 * @date 2018-10-28 16:21:11
 */ 

public class F_flight_report_year{
	private Integer id;
	private Integer day;
	private Integer flights;
	private Integer passengers;
	private Integer cargo_weight;
	private Integer rtype;
	private String add_time;
	public F_flight_report_year(){
	}
	public F_flight_report_year(Integer id,Integer day,Integer flights,Integer passengers,Integer cargo_weight,Integer rtype,String add_time){
		this.id=id;
		this.day=day;
		this.flights=flights;
		this.passengers=passengers;
		this.cargo_weight=cargo_weight;
		this.rtype=rtype;
		this.add_time=add_time;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}
	public void setDay(Integer day){
		this.day=day;
	}
	public Integer getDay(){
		return day;
	}
	public void setFlights(Integer flights){
		this.flights=flights;
	}
	public Integer getFlights(){
		return flights;
	}
	public void setPassengers(Integer passengers){
		this.passengers=passengers;
	}
	public Integer getPassengers(){
		return passengers;
	}
	public void setCargo_weight(Integer cargo_weight){
		this.cargo_weight=cargo_weight;
	}
	public Integer getCargo_weight(){
		return cargo_weight;
	}
	public void setRtype(Integer rtype){
		this.rtype=rtype;
	}
	public Integer getRtype(){
		return rtype;
	}
	public void setAdd_time(String add_time){
		this.add_time=add_time;
	}
	public String getAdd_time(){
		return add_time;
	}
	public String toString() { 
		return "F_flight_report_year[id=" + id + ",day=" + day + ",flights=" + flights + ","+
		"passengers=" + passengers + ",cargo_weight=" + cargo_weight + ",rtype=" + rtype + ","+
		"add_time=" + add_time + "]";
	}
}

