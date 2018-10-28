package cn.lyf1433223.pojo.aviation;


/**
 * @ClassName:f_aircraft_basic_data 
 * @Description: TODO(��˵����f_aircraft_basic_data )
 * @author Uncle liu 
 * @date 2018-10-28 16:21:11
 */ 

public class F_aircraft_basic_data{
	private Integer id;
	private String code;
	private String no;
	private String model;
	private String company;
	private String attribute;
	private String two_code;
	private Double wingspan;
	private Double length;
	private Double height;
	private Integer max_seat;
	private Double cargo;
	private Double takeoff_weight;
	private Double max_range;
	private Double max_fuel;
	private String runway;
	private String aircraft_type;
	public F_aircraft_basic_data(){
	}
	public F_aircraft_basic_data(Integer id,String code,String no,String model,String company,String attribute,String two_code,Double wingspan,Double length,Double height,Integer max_seat,Double cargo,Double takeoff_weight,Double max_range,Double max_fuel,String runway,String aircraft_type){
		this.id=id;
		this.code=code;
		this.no=no;
		this.model=model;
		this.company=company;
		this.attribute=attribute;
		this.two_code=two_code;
		this.wingspan=wingspan;
		this.length=length;
		this.height=height;
		this.max_seat=max_seat;
		this.cargo=cargo;
		this.takeoff_weight=takeoff_weight;
		this.max_range=max_range;
		this.max_fuel=max_fuel;
		this.runway=runway;
		this.aircraft_type=aircraft_type;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}
	public void setCode(String code){
		this.code=code;
	}
	public String getCode(){
		return code;
	}
	public void setNo(String no){
		this.no=no;
	}
	public String getNo(){
		return no;
	}
	public void setModel(String model){
		this.model=model;
	}
	public String getModel(){
		return model;
	}
	public void setCompany(String company){
		this.company=company;
	}
	public String getCompany(){
		return company;
	}
	public void setAttribute(String attribute){
		this.attribute=attribute;
	}
	public String getAttribute(){
		return attribute;
	}
	public void setTwo_code(String two_code){
		this.two_code=two_code;
	}
	public String getTwo_code(){
		return two_code;
	}
	public void setWingspan(Double wingspan){
		this.wingspan=wingspan;
	}
	public Double getWingspan(){
		return wingspan;
	}
	public void setLength(Double length){
		this.length=length;
	}
	public Double getLength(){
		return length;
	}
	public void setHeight(Double height){
		this.height=height;
	}
	public Double getHeight(){
		return height;
	}
	public void setMax_seat(Integer max_seat){
		this.max_seat=max_seat;
	}
	public Integer getMax_seat(){
		return max_seat;
	}
	public void setCargo(Double cargo){
		this.cargo=cargo;
	}
	public Double getCargo(){
		return cargo;
	}
	public void setTakeoff_weight(Double takeoff_weight){
		this.takeoff_weight=takeoff_weight;
	}
	public Double getTakeoff_weight(){
		return takeoff_weight;
	}
	public void setMax_range(Double max_range){
		this.max_range=max_range;
	}
	public Double getMax_range(){
		return max_range;
	}
	public void setMax_fuel(Double max_fuel){
		this.max_fuel=max_fuel;
	}
	public Double getMax_fuel(){
		return max_fuel;
	}
	public void setRunway(String runway){
		this.runway=runway;
	}
	public String getRunway(){
		return runway;
	}
	public void setAircraft_type(String aircraft_type){
		this.aircraft_type=aircraft_type;
	}
	public String getAircraft_type(){
		return aircraft_type;
	}
	public String toString() { 
		return "F_aircraft_basic_data[id=" + id + ",code=" + code + ",no=" + no + ","+
		"model=" + model + ",company=" + company + ",attribute=" + attribute + ","+
		"two_code=" + two_code + ",wingspan=" + wingspan + ",length=" + length + ","+
		"height=" + height + ",max_seat=" + max_seat + ",cargo=" + cargo + ","+
		"takeoff_weight=" + takeoff_weight + ",max_range=" + max_range + ",max_fuel=" + max_fuel + ","+
		"runway=" + runway + ",aircraft_type=" + aircraft_type + "]";
	}
}

