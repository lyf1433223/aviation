package cn.lyf1433223.pojo.aviation;

import java.util.Date;

/**
 * @ClassName:f_passenger 
 * @Description: TODO(��˵����f_passenger )
 * @author Uncle liu 
 * @date 2018-10-28 16:21:11
 */ 

public class F_passenger{
	private String id;
	private String code;
	private Integer relation_id;
	private String flight_no;
	private String name;
	private String id_number;
	private String tel;
	private Integer sex;
	private String email;
	private Integer is_vip;
	private String seat;
	private String cabin;
	private String voyage;
	private String check_time;
	private String check_counter;
	private String security_time;
	private String security_channel;
	private String boarding_time;
	private String peer;
	private String recent_takeoff_flight;
	private Integer recent_takeoff_time;
	private String destination;
	public F_passenger(){
	}
	public F_passenger(String id,String code,Integer relation_id,String flight_no,String name,String id_number,String tel,Integer sex,String email,Integer is_vip,String seat,String cabin,String voyage,String check_time,String check_counter,String security_time,String security_channel,String boarding_time,String peer,String recent_takeoff_flight,Integer recent_takeoff_time,String destination){
		this.id=id;
		this.code=code;
		this.relation_id=relation_id;
		this.flight_no=flight_no;
		this.name=name;
		this.id_number=id_number;
		this.tel=tel;
		this.sex=sex;
		this.email=email;
		this.is_vip=is_vip;
		this.seat=seat;
		this.cabin=cabin;
		this.voyage=voyage;
		this.check_time=check_time;
		this.check_counter=check_counter;
		this.security_time=security_time;
		this.security_channel=security_channel;
		this.boarding_time=boarding_time;
		this.peer=peer;
		this.recent_takeoff_flight=recent_takeoff_flight;
		this.recent_takeoff_time=recent_takeoff_time;
		this.destination=destination;
	}
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}
	public void setCode(String code){
		this.code=code;
	}
	public String getCode(){
		return code;
	}
	public void setRelation_id(Integer relation_id){
		this.relation_id=relation_id;
	}
	public Integer getRelation_id(){
		return relation_id;
	}
	public void setFlight_no(String flight_no){
		this.flight_no=flight_no;
	}
	public String getFlight_no(){
		return flight_no;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setId_number(String id_number){
		this.id_number=id_number;
	}
	public String getId_number(){
		return id_number;
	}
	public void setTel(String tel){
		this.tel=tel;
	}
	public String getTel(){
		return tel;
	}
	public void setSex(Integer sex){
		this.sex=sex;
	}
	public Integer getSex(){
		return sex;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return email;
	}
	public void setIs_vip(Integer is_vip){
		this.is_vip=is_vip;
	}
	public Integer getIs_vip(){
		return is_vip;
	}
	public void setSeat(String seat){
		this.seat=seat;
	}
	public String getSeat(){
		return seat;
	}
	public void setCabin(String cabin){
		this.cabin=cabin;
	}
	public String getCabin(){
		return cabin;
	}
	public void setVoyage(String voyage){
		this.voyage=voyage;
	}
	public String getVoyage(){
		return voyage;
	}
	public void setCheck_time(String check_time){
		this.check_time=check_time;
	}
	public String getCheck_time(){
		return check_time;
	}
	public void setCheck_counter(String check_counter){
		this.check_counter=check_counter;
	}
	public String getCheck_counter(){
		return check_counter;
	}
	public void setSecurity_time(String security_time){
		this.security_time=security_time;
	}
	public String getSecurity_time(){
		return security_time;
	}
	public void setSecurity_channel(String security_channel){
		this.security_channel=security_channel;
	}
	public String getSecurity_channel(){
		return security_channel;
	}
	public void setBoarding_time(String boarding_time){
		this.boarding_time=boarding_time;
	}
	public String getBoarding_time(){
		return boarding_time;
	}
	public void setPeer(String peer){
		this.peer=peer;
	}
	public String getPeer(){
		return peer;
	}
	public void setRecent_takeoff_flight(String recent_takeoff_flight){
		this.recent_takeoff_flight=recent_takeoff_flight;
	}
	public String getRecent_takeoff_flight(){
		return recent_takeoff_flight;
	}
	public void setRecent_takeoff_time(Integer recent_takeoff_time){
		this.recent_takeoff_time=recent_takeoff_time;
	}
	public Integer getRecent_takeoff_time(){
		return recent_takeoff_time;
	}
	public void setDestination(String destination){
		this.destination=destination;
	}
	public String getDestination(){
		return destination;
	}
	public String toString() { 
		return "F_passenger[id=" + id + ",code=" + code + ",relation_id=" + relation_id + ","+
		"flight_no=" + flight_no + ",name=" + name + ",id_number=" + id_number + ","+
		"tel=" + tel + ",sex=" + sex + ",email=" + email + ","+
		"is_vip=" + is_vip + ",seat=" + seat + ",cabin=" + cabin + ","+
		"voyage=" + voyage + ",check_time=" + check_time + ",check_counter=" + check_counter + ","+
		"security_time=" + security_time + ",security_channel=" + security_channel + ",boarding_time=" + boarding_time + ","+
		"peer=" + peer + ",recent_takeoff_flight=" + recent_takeoff_flight + ",recent_takeoff_time=" + recent_takeoff_time + ","+
		"destination=" + destination + "]";
	}
}

