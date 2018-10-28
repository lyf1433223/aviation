package cn.lyf1433223.pojo.aviation;


/**
 * @ClassName:f_runway_basic_data 
 * @Description: TODO(��˵����f_runway_basic_data )
 * @author Uncle liu 
 * @date 2018-10-28 16:21:11
 */ 

public class F_runway_basic_data{
	private Integer id;
	private String code;
	private String number;
	private Double length;
	private String direction;
	private String attribute;
	public F_runway_basic_data(){
	}
	public F_runway_basic_data(Integer id,String code,String number,Double length,String direction,String attribute){
		this.id=id;
		this.code=code;
		this.number=number;
		this.length=length;
		this.direction=direction;
		this.attribute=attribute;
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
	public void setNumber(String number){
		this.number=number;
	}
	public String getNumber(){
		return number;
	}
	public void setLength(Double length){
		this.length=length;
	}
	public Double getLength(){
		return length;
	}
	public void setDirection(String direction){
		this.direction=direction;
	}
	public String getDirection(){
		return direction;
	}
	public void setAttribute(String attribute){
		this.attribute=attribute;
	}
	public String getAttribute(){
		return attribute;
	}
	public String toString() { 
		return "F_runway_basic_data[id=" + id + ",code=" + code + ",number=" + number + ","+
		"length=" + length + ",direction=" + direction + ",attribute=" + attribute + "]";
	}
}

