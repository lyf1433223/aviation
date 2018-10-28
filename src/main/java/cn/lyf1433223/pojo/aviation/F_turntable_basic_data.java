package cn.lyf1433223.pojo.aviation;


/**
 * @ClassName:f_turntable_basic_data 
 * @Description: TODO(��˵����f_turntable_basic_data )
 * @author Uncle liu 
 * @date 2018-10-28 16:21:11
 */ 

public class F_turntable_basic_data{
	private Integer id;
	private String code;
	private Integer states;
	private String attribute;
	private String company;
	private String number;
	private String terminal;
	public F_turntable_basic_data(){
	}
	public F_turntable_basic_data(Integer id,String code,Integer states,String attribute,String company,String number,String terminal){
		this.id=id;
		this.code=code;
		this.states=states;
		this.attribute=attribute;
		this.company=company;
		this.number=number;
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
	public void setStates(Integer states){
		this.states=states;
	}
	public Integer getStates(){
		return states;
	}
	public void setAttribute(String attribute){
		this.attribute=attribute;
	}
	public String getAttribute(){
		return attribute;
	}
	public void setCompany(String company){
		this.company=company;
	}
	public String getCompany(){
		return company;
	}
	public void setNumber(String number){
		this.number=number;
	}
	public String getNumber(){
		return number;
	}
	public void setTerminal(String terminal){
		this.terminal=terminal;
	}
	public String getTerminal(){
		return terminal;
	}
	public String toString() { 
		return "F_turntable_basic_data[id=" + id + ",code=" + code + ",states=" + states + ","+
		"attribute=" + attribute + ",company=" + company + ",number=" + number + ","+
		"terminal=" + terminal + "]";
	}
}

