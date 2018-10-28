package cn.lyf1433223.pojo.aviation;

import java.util.Date;

/**
 * @ClassName:f_flight_stream 
 * @Description: TODO(��˵����f_flight_stream )
 * @author Uncle liu 
 * @date 2018-10-28 16:21:11
 */ 

public class F_flight_stream{
	private Integer id;
	private String flight_no;
	private Integer airline_id;
	private String airline_company;
	private String plan_take_time;
	private String plan_land_time;
	private String real_take_time;
	private String real_land_time;
	private String block_time;
	private String remove_time;
	private String park;
	private String bridges_time;
	private String remove_bridges_time;
	private String delay_remark;
	private Integer delay_time;
	private String abnormal_remark;
	private String terminal;
	private String gate;
	private String luggage_turntable;
	private String door_open_time;
	private String door_close_time;
	private String cargodoor_open_time;
	private String cargodoor_close_time;
	public F_flight_stream(){
	}
	public F_flight_stream(Integer id,String flight_no,Integer airline_id,String airline_company,String plan_take_time,String plan_land_time,String real_take_time,String real_land_time,String block_time,String remove_time,String park,String bridges_time,String remove_bridges_time,String delay_remark,Integer delay_time,String abnormal_remark,String terminal,String gate,String luggage_turntable,String door_open_time,String door_close_time,String cargodoor_open_time,String cargodoor_close_time){
		this.id=id;
		this.flight_no=flight_no;
		this.airline_id=airline_id;
		this.airline_company=airline_company;
		this.plan_take_time=plan_take_time;
		this.plan_land_time=plan_land_time;
		this.real_take_time=real_take_time;
		this.real_land_time=real_land_time;
		this.block_time=block_time;
		this.remove_time=remove_time;
		this.park=park;
		this.bridges_time=bridges_time;
		this.remove_bridges_time=remove_bridges_time;
		this.delay_remark=delay_remark;
		this.delay_time=delay_time;
		this.abnormal_remark=abnormal_remark;
		this.terminal=terminal;
		this.gate=gate;
		this.luggage_turntable=luggage_turntable;
		this.door_open_time=door_open_time;
		this.door_close_time=door_close_time;
		this.cargodoor_open_time=cargodoor_open_time;
		this.cargodoor_close_time=cargodoor_close_time;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}
	public void setFlight_no(String flight_no){
		this.flight_no=flight_no;
	}
	public String getFlight_no(){
		return flight_no;
	}
	public void setAirline_id(Integer airline_id){
		this.airline_id=airline_id;
	}
	public Integer getAirline_id(){
		return airline_id;
	}
	public void setAirline_company(String airline_company){
		this.airline_company=airline_company;
	}
	public String getAirline_company(){
		return airline_company;
	}
	public void setPlan_take_time(String plan_take_time){
		this.plan_take_time=plan_take_time;
	}
	public String getPlan_take_time(){
		return plan_take_time;
	}
	public void setPlan_land_time(String plan_land_time){
		this.plan_land_time=plan_land_time;
	}
	public String getPlan_land_time(){
		return plan_land_time;
	}
	public void setReal_take_time(String real_take_time){
		this.real_take_time=real_take_time;
	}
	public String getReal_take_time(){
		return real_take_time;
	}
	public void setReal_land_time(String real_land_time){
		this.real_land_time=real_land_time;
	}
	public String getReal_land_time(){
		return real_land_time;
	}
	public void setBlock_time(String block_time){
		this.block_time=block_time;
	}
	public String getBlock_time(){
		return block_time;
	}
	public void setRemove_time(String remove_time){
		this.remove_time=remove_time;
	}
	public String getRemove_time(){
		return remove_time;
	}
	public void setPark(String park){
		this.park=park;
	}
	public String getPark(){
		return park;
	}
	public void setBridges_time(String bridges_time){
		this.bridges_time=bridges_time;
	}
	public String getBridges_time(){
		return bridges_time;
	}
	public void setRemove_bridges_time(String remove_bridges_time){
		this.remove_bridges_time=remove_bridges_time;
	}
	public String getRemove_bridges_time(){
		return remove_bridges_time;
	}
	public void setDelay_remark(String delay_remark){
		this.delay_remark=delay_remark;
	}
	public String getDelay_remark(){
		return delay_remark;
	}
	public void setDelay_time(Integer delay_time){
		this.delay_time=delay_time;
	}
	public Integer getDelay_time(){
		return delay_time;
	}
	public void setAbnormal_remark(String abnormal_remark){
		this.abnormal_remark=abnormal_remark;
	}
	public String getAbnormal_remark(){
		return abnormal_remark;
	}
	public void setTerminal(String terminal){
		this.terminal=terminal;
	}
	public String getTerminal(){
		return terminal;
	}
	public void setGate(String gate){
		this.gate=gate;
	}
	public String getGate(){
		return gate;
	}
	public void setLuggage_turntable(String luggage_turntable){
		this.luggage_turntable=luggage_turntable;
	}
	public String getLuggage_turntable(){
		return luggage_turntable;
	}
	public void setDoor_open_time(String door_open_time){
		this.door_open_time=door_open_time;
	}
	public String getDoor_open_time(){
		return door_open_time;
	}
	public void setDoor_close_time(String door_close_time){
		this.door_close_time=door_close_time;
	}
	public String getDoor_close_time(){
		return door_close_time;
	}
	public void setCargodoor_open_time(String cargodoor_open_time){
		this.cargodoor_open_time=cargodoor_open_time;
	}
	public String getCargodoor_open_time(){
		return cargodoor_open_time;
	}
	public void setCargodoor_close_time(String cargodoor_close_time){
		this.cargodoor_close_time=cargodoor_close_time;
	}
	public String getCargodoor_close_time(){
		return cargodoor_close_time;
	}
	public String toString() { 
		return "F_flight_stream[id=" + id + ",flight_no=" + flight_no + ",airline_id=" + airline_id + ","+
		"airline_company=" + airline_company + ",plan_take_time=" + plan_take_time + ",plan_land_time=" + plan_land_time + ","+
		"real_take_time=" + real_take_time + ",real_land_time=" + real_land_time + ",block_time=" + block_time + ","+
		"remove_time=" + remove_time + ",park=" + park + ",bridges_time=" + bridges_time + ","+
		"remove_bridges_time=" + remove_bridges_time + ",delay_remark=" + delay_remark + ",delay_time=" + delay_time + ","+
		"abnormal_remark=" + abnormal_remark + ",terminal=" + terminal + ",gate=" + gate + ","+
		"luggage_turntable=" + luggage_turntable + ",door_open_time=" + door_open_time + ",door_close_time=" + door_close_time + ","+
		"cargodoor_open_time=" + cargodoor_open_time + ",cargodoor_close_time=" + cargodoor_close_time + "]";
	}
}

