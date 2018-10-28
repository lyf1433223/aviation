package cn.lyf1433223.pojo.aviation;

import java.util.Date;

/**
 * @ClassName:f_flight_report_day 
 * @Description: TODO(��˵����f_flight_report_day )
 * @author Uncle liu 
 * @date 2018-10-28 16:21:11
 */ 

public class F_flight_report_day{
	private Integer id;
	private Integer day;
	private Integer flights;
	private Integer normal_flights;
	private Integer passengers;
	private Integer cargo_weight;
	private Integer rtype;
	private String add_time;
	public F_flight_report_day(){
	}
	public F_flight_report_day(Integer id,Integer day,Integer flights,Integer normal_flights,Integer passengers,Integer cargo_weight,Integer rtype,String add_time){
		this.id=id;
		this.day=day;
		this.flights=flights;
		this.normal_flights=normal_flights;
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
	public void setNormal_flights(Integer normal_flights){
		this.normal_flights=normal_flights;
	}
	public Integer getNormal_flights(){
		return normal_flights;
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
		return "F_flight_report_day[id=" + id + ",day=" + day + ",flights=" + flights + ","+
		"normal_flights=" + normal_flights + ",passengers=" + passengers + ",cargo_weight=" + cargo_weight + ","+
		"rtype=" + rtype + ",add_time=" + add_time + "]";
	}
}

