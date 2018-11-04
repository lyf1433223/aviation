package cn.lyf1433223.pojo.aviation;

import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @ClassName:f_flight_record 
 * @Description: TODO(��˵����f_flight_record )
 * @author Uncle liu 
 * @date 2018-11-02 11:50:32
 */ 

@Service("record")
public class F_flight_record{
	private Integer id;
	private Integer code;
	private String do_date;
	private String air_code;
	private String flight_no;
	private String no;
	private String jix;
	private String nature;
	private F_task_basic_data task;
	private Integer attribute;
	private Integer harbor;
	private F_seat_basic_data seat;
	private F_gate_basic_data gate;
	private F_turntable_basic_data turntable;
	private Integer relation_id;
	private F_aircompanyt_basic_data airline;
	private String flight_agent;
	private String airport_start;
	private String airport_end;
	private String airport_end_spare;
	private Integer adult_num;
	private Integer child_num;
	private Integer baby_num;
	private Integer luggage_num;
	private Double cargo_weight;
	private String plan_take_time;
	private String plan_land_time;
	private String real_take_time;
	private String real_land_time;
	private String block_time;
	private String remove_time;
	private F_reason_basic_data trys;
	private String delay_remark;
	private Integer delay_time;
	private F_terminal_basic_data terminal;
	private String door_open_time;
	private String door_close_time;
	private String cargodoor_open_time;
	private String cargodoor_close_time;
	private F_statel_basic_data state;
	public F_flight_record(){
	}

	public F_flight_record(Integer id, Integer code, String do_date, String air_code, String flight_no, String no, String jix, String nature, F_task_basic_data task, Integer attribute, Integer harbor, F_seat_basic_data seat, F_gate_basic_data gate, F_turntable_basic_data turntable, Integer relation_id, F_aircompanyt_basic_data airline, String flight_agent, String airport_start, String airport_end, String airport_end_spare, Integer adult_num, Integer child_num, Integer baby_num, Integer luggage_num, Double cargo_weight, String plan_take_time, String plan_land_time, String real_take_time, String real_land_time, String block_time, String remove_time, F_reason_basic_data trys, String delay_remark, Integer delay_time, F_terminal_basic_data terminal, String door_open_time, String door_close_time, String cargodoor_open_time, String cargodoor_close_time, F_statel_basic_data state) {
		this.id = id;
		this.code = code;
		this.do_date = do_date;
		this.air_code = air_code;
		this.flight_no = flight_no;
		this.no = no;
		this.jix = jix;
		this.nature = nature;
		this.task = task;
		this.attribute = attribute;
		this.harbor = harbor;
		this.seat = seat;
		this.gate = gate;
		this.turntable = turntable;
		this.relation_id = relation_id;
		this.airline = airline;
		this.flight_agent = flight_agent;
		this.airport_start = airport_start;
		this.airport_end = airport_end;
		this.airport_end_spare = airport_end_spare;
		this.adult_num = adult_num;
		this.child_num = child_num;
		this.baby_num = baby_num;
		this.luggage_num = luggage_num;
		this.cargo_weight = cargo_weight;
		this.plan_take_time = plan_take_time;
		this.plan_land_time = plan_land_time;
		this.real_take_time = real_take_time;
		this.real_land_time = real_land_time;
		this.block_time = block_time;
		this.remove_time = remove_time;
		this.trys = trys;
		this.delay_remark = delay_remark;
		this.delay_time = delay_time;
		this.terminal = terminal;
		this.door_open_time = door_open_time;
		this.door_close_time = door_close_time;
		this.cargodoor_open_time = cargodoor_open_time;
		this.cargodoor_close_time = cargodoor_close_time;
		this.state = state;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getDo_date() {
		return do_date;
	}

	public void setDo_date(String do_date) {
		this.do_date = do_date;
	}

	public String getAir_code() {
		return air_code;
	}

	public void setAir_code(String air_code) {
		this.air_code = air_code;
	}

	public String getFlight_no() {
		return flight_no;
	}

	public void setFlight_no(String flight_no) {
		this.flight_no = flight_no;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getJix() {
		return jix;
	}

	public void setJix(String jix) {
		this.jix = jix;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public F_task_basic_data getTask() {
		return task;
	}

	public void setTask(F_task_basic_data task) {
		this.task = task;
	}

	public Integer getAttribute() {
		return attribute;
	}

	public void setAttribute(Integer attribute) {
		this.attribute = attribute;
	}

	public Integer getHarbor() {
		return harbor;
	}

	public void setHarbor(Integer harbor) {
		this.harbor = harbor;
	}

	public F_seat_basic_data getSeat() {
		return seat;
	}

	public void setSeat(F_seat_basic_data seat) {
		this.seat = seat;
	}

	public F_gate_basic_data getGate() {
		return gate;
	}

	public void setGate(F_gate_basic_data gate) {
		this.gate = gate;
	}

	public F_turntable_basic_data getTurntable() {
		return turntable;
	}

	public void setTurntable(F_turntable_basic_data turntable) {
		this.turntable = turntable;
	}

	public Integer getRelation_id() {
		return relation_id;
	}

	public void setRelation_id(Integer relation_id) {
		this.relation_id = relation_id;
	}

	public F_aircompanyt_basic_data getAirline() {
		return airline;
	}

	public void setAirline(F_aircompanyt_basic_data airline) {
		this.airline = airline;
	}

	public String getFlight_agent() {
		return flight_agent;
	}

	public void setFlight_agent(String flight_agent) {
		this.flight_agent = flight_agent;
	}

	public String getAirport_start() {
		return airport_start;
	}

	public void setAirport_start(String airport_start) {
		this.airport_start = airport_start;
	}

	public String getAirport_end() {
		return airport_end;
	}

	public void setAirport_end(String airport_end) {
		this.airport_end = airport_end;
	}

	public String getAirport_end_spare() {
		return airport_end_spare;
	}

	public void setAirport_end_spare(String airport_end_spare) {
		this.airport_end_spare = airport_end_spare;
	}

	public Integer getAdult_num() {
		return adult_num;
	}

	public void setAdult_num(Integer adult_num) {
		this.adult_num = adult_num;
	}

	public Integer getChild_num() {
		return child_num;
	}

	public void setChild_num(Integer child_num) {
		this.child_num = child_num;
	}

	public Integer getBaby_num() {
		return baby_num;
	}

	public void setBaby_num(Integer baby_num) {
		this.baby_num = baby_num;
	}

	public Integer getLuggage_num() {
		return luggage_num;
	}

	public void setLuggage_num(Integer luggage_num) {
		this.luggage_num = luggage_num;
	}

	public Double getCargo_weight() {
		return cargo_weight;
	}

	public void setCargo_weight(Double cargo_weight) {
		this.cargo_weight = cargo_weight;
	}

	public String getPlan_take_time() {
		return plan_take_time;
	}

	public void setPlan_take_time(String plan_take_time) {
		this.plan_take_time = plan_take_time;
	}

	public String getPlan_land_time() {
		return plan_land_time;
	}

	public void setPlan_land_time(String plan_land_time) {
		this.plan_land_time = plan_land_time;
	}

	public String getReal_take_time() {
		return real_take_time;
	}

	public void setReal_take_time(String real_take_time) {
		this.real_take_time = real_take_time;
	}

	public String getReal_land_time() {
		return real_land_time;
	}

	public void setReal_land_time(String real_land_time) {
		this.real_land_time = real_land_time;
	}

	public String getBlock_time() {
		return block_time;
	}

	public void setBlock_time(String block_time) {
		this.block_time = block_time;
	}

	public String getRemove_time() {
		return remove_time;
	}

	public void setRemove_time(String remove_time) {
		this.remove_time = remove_time;
	}

	public F_reason_basic_data getTrys() {
		return trys;
	}

	public void setTrys(F_reason_basic_data trys) {
		this.trys = trys;
	}

	public String getDelay_remark() {
		return delay_remark;
	}

	public void setDelay_remark(String delay_remark) {
		this.delay_remark = delay_remark;
	}

	public Integer getDelay_time() {
		return delay_time;
	}

	public void setDelay_time(Integer delay_time) {
		this.delay_time = delay_time;
	}

	public F_terminal_basic_data getTerminal() {
		return terminal;
	}

	public void setTerminal(F_terminal_basic_data terminal) {
		this.terminal = terminal;
	}

	public String getDoor_open_time() {
		return door_open_time;
	}

	public void setDoor_open_time(String door_open_time) {
		this.door_open_time = door_open_time;
	}

	public String getDoor_close_time() {
		return door_close_time;
	}

	public void setDoor_close_time(String door_close_time) {
		this.door_close_time = door_close_time;
	}

	public String getCargodoor_open_time() {
		return cargodoor_open_time;
	}

	public void setCargodoor_open_time(String cargodoor_open_time) {
		this.cargodoor_open_time = cargodoor_open_time;
	}

	public String getCargodoor_close_time() {
		return cargodoor_close_time;
	}

	public void setCargodoor_close_time(String cargodoor_close_time) {
		this.cargodoor_close_time = cargodoor_close_time;
	}

	public F_statel_basic_data getState() {
		return state;
	}

	public void setState(F_statel_basic_data state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "F_flight_record{" +
				"id=" + id +
				", code=" + code +
				", do_date='" + do_date + '\'' +
				", air_code='" + air_code + '\'' +
				", flight_no='" + flight_no + '\'' +
				", no='" + no + '\'' +
				", jix='" + jix + '\'' +
				", nature='" + nature + '\'' +
				", task=" + task +
				", attribute=" + attribute +
				", harbor=" + harbor +
				", seat=" + seat +
				", gate=" + gate +
				", turntable=" + turntable +
				", relation_id=" + relation_id +
				", airline=" + airline +
				", flight_agent='" + flight_agent + '\'' +
				", airport_start='" + airport_start + '\'' +
				", airport_end='" + airport_end + '\'' +
				", airport_end_spare='" + airport_end_spare + '\'' +
				", adult_num=" + adult_num +
				", child_num=" + child_num +
				", baby_num=" + baby_num +
				", luggage_num=" + luggage_num +
				", cargo_weight=" + cargo_weight +
				", plan_take_time='" + plan_take_time + '\'' +
				", plan_land_time='" + plan_land_time + '\'' +
				", real_take_time='" + real_take_time + '\'' +
				", real_land_time='" + real_land_time + '\'' +
				", block_time='" + block_time + '\'' +
				", remove_time='" + remove_time + '\'' +
				", trys=" + trys +
				", delay_remark='" + delay_remark + '\'' +
				", delay_time=" + delay_time +
				", terminal=" + terminal +
				", door_open_time='" + door_open_time + '\'' +
				", door_close_time='" + door_close_time + '\'' +
				", cargodoor_open_time='" + cargodoor_open_time + '\'' +
				", cargodoor_close_time='" + cargodoor_close_time + '\'' +
				", state=" + state +
				'}';
	}
}

