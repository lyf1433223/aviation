package cn.lyf1433223.pojo.aviation;

import java.util.Date;

/**
 * @ClassName:f_air_route 
 * @Description: TODO(��˵����f_air_route )
 * @author Uncle liu 
 * @date 2018-10-28 16:21:11
 */ 

public class F_air_route{
	private Integer id;
	private String airport_start;
	private String airport_end;
	private String airport_end_spare;
	private Double mileage;
	private String add_time;
	public F_air_route(){
	}
	public F_air_route(Integer id,String airport_start,String airport_end,String airport_end_spare,Double mileage,String add_time){
		this.id=id;
		this.airport_start=airport_start;
		this.airport_end=airport_end;
		this.airport_end_spare=airport_end_spare;
		this.mileage=mileage;
		this.add_time=add_time;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}
	public void setAirport_start(String airport_start){
		this.airport_start=airport_start;
	}
	public String getAirport_start(){
		return airport_start;
	}
	public void setAirport_end(String airport_end){
		this.airport_end=airport_end;
	}
	public String getAirport_end(){
		return airport_end;
	}
	public void setAirport_end_spare(String airport_end_spare){
		this.airport_end_spare=airport_end_spare;
	}
	public String getAirport_end_spare(){
		return airport_end_spare;
	}
	public void setMileage(Double mileage){
		this.mileage=mileage;
	}
	public Double getMileage(){
		return mileage;
	}
	public void setAdd_time(String add_time){
		this.add_time=add_time;
	}
	public String getAdd_time(){
		return add_time;
	}
	public String toString() { 
		return "F_air_route[id=" + id + ",airport_start=" + airport_start + ",airport_end=" + airport_end + ","+
		"airport_end_spare=" + airport_end_spare + ",mileage=" + mileage + ",add_time=" + add_time + "]";
	}
}

