package cn.lyf1433223.pojo.aviation;


/**
 * @ClassName:f_seat_basic_data 
 * @Description: TODO(��˵����f_seat_basic_data )
 * @author Uncle liu 
 * @date 2018-10-28 16:21:11
 */ 

public class F_seat_basic_data{
	private Integer id;
	private String code;
	private String number;
	private String model;
	private String attribute;
	private Integer lengt;
	private Integer breadth;
	private Integer type;
	private Integer states;
	public F_seat_basic_data(){
	}
	public F_seat_basic_data(Integer id,String code,String number,String model,String attribute,Integer lengt,Integer breadth,Integer type,Integer states){
		this.id=id;
		this.code=code;
		this.number=number;
		this.model=model;
		this.attribute=attribute;
		this.lengt=lengt;
		this.breadth=breadth;
		this.type=type;
		this.states=states;
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
	public void setModel(String model){
		this.model=model;
	}
	public String getModel(){
		return model;
	}
	public void setAttribute(String attribute){
		this.attribute=attribute;
	}
	public String getAttribute(){
		return attribute;
	}
	public void setLengt(Integer lengt){
		this.lengt=lengt;
	}
	public Integer getLengt(){
		return lengt;
	}
	public void setBreadth(Integer breadth){
		this.breadth=breadth;
	}
	public Integer getBreadth(){
		return breadth;
	}
	public void setType(Integer type){
		this.type=type;
	}
	public Integer getType(){
		return type;
	}
	public void setStates(Integer states){
		this.states=states;
	}
	public Integer getStates(){
		return states;
	}
	public String toString() { 
		return "F_seat_basic_data[id=" + id + ",code=" + code + ",number=" + number + ","+
		"model=" + model + ",attribute=" + attribute + ",lengt=" + lengt + ","+
		"breadth=" + breadth + ",type=" + type + ",states=" + states + "]";
	}
}

