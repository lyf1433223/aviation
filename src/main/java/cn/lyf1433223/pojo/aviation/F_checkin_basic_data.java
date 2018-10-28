package cn.lyf1433223.pojo.aviation;


/**
 * @ClassName:f_checkin_basic_data 
 * @Description: TODO(��˵����f_checkin_basic_data )
 * @author Uncle liu 
 * @date 2018-10-28 16:21:11
 */ 

public class F_checkin_basic_data{
	private Integer id;
	private String code;
	private String name;
	private String number;
	private String company;
	private String region;
	private String terminal;
	private String attribute;
	private Integer states;
	private String type;
	public F_checkin_basic_data(){
	}
	public F_checkin_basic_data(Integer id,String code,String name,String number,String company,String region,String terminal,String attribute,Integer states,String type){
		this.id=id;
		this.code=code;
		this.name=name;
		this.number=number;
		this.company=company;
		this.region=region;
		this.terminal=terminal;
		this.attribute=attribute;
		this.states=states;
		this.type=type;
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
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setNumber(String number){
		this.number=number;
	}
	public String getNumber(){
		return number;
	}
	public void setCompany(String company){
		this.company=company;
	}
	public String getCompany(){
		return company;
	}
	public void setRegion(String region){
		this.region=region;
	}
	public String getRegion(){
		return region;
	}
	public void setTerminal(String terminal){
		this.terminal=terminal;
	}
	public String getTerminal(){
		return terminal;
	}
	public void setAttribute(String attribute){
		this.attribute=attribute;
	}
	public String getAttribute(){
		return attribute;
	}
	public void setStates(Integer states){
		this.states=states;
	}
	public Integer getStates(){
		return states;
	}
	public void setType(String type){
		this.type=type;
	}
	public String getType(){
		return type;
	}
	public String toString() { 
		return "F_checkin_basic_data[id=" + id + ",code=" + code + ",name=" + name + ","+
		"number=" + number + ",company=" + company + ",region=" + region + ","+
		"terminal=" + terminal + ",attribute=" + attribute + ",states=" + states + ","+
		"type=" + type + "]";
	}
}

