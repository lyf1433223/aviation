package cn.lyf1433223.pojo.aviation;


/**
 * @ClassName:f_channel_basic_data 
 * @Description: TODO(��˵����f_channel_basic_data )
 * @author Uncle liu 
 * @date 2018-10-28 16:21:11
 */ 

public class F_channel_basic_data{
	private Integer id;
	private String code;
	private String number;
	private String attribute;
	private String region;
	private Integer states;
	private String terminal;
	public F_channel_basic_data(){
	}
	public F_channel_basic_data(Integer id,String code,String number,String attribute,String region,Integer states,String terminal){
		this.id=id;
		this.code=code;
		this.number=number;
		this.attribute=attribute;
		this.region=region;
		this.states=states;
		this.terminal=terminal;
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
	public void setAttribute(String attribute){
		this.attribute=attribute;
	}
	public String getAttribute(){
		return attribute;
	}
	public void setRegion(String region){
		this.region=region;
	}
	public String getRegion(){
		return region;
	}
	public void setStates(Integer states){
		this.states=states;
	}
	public Integer getStates(){
		return states;
	}
	public void setTerminal(String terminal){
		this.terminal=terminal;
	}
	public String getTerminal(){
		return terminal;
	}
	public String toString() { 
		return "F_channel_basic_data[id=" + id + ",code=" + code + ",number=" + number + ","+
		"attribute=" + attribute + ",region=" + region + ",states=" + states + ","+
		"terminal=" + terminal + "]";
	}
}

