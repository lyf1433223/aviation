package cn.lyf1433223.pojo.aviation;


/**
 * @ClassName:f_terminal_basic_data 
 * @Description: TODO(��˵����f_terminal_basic_data )
 * @author Uncle liu 
 * @date 2018-10-28 16:21:11
 */ 

public class F_terminal_basic_data{
	private Integer id;
	private String code;
	private String name;
	private String attribute;
	private String company;
	private Integer states;
	public F_terminal_basic_data(){
	}
	public F_terminal_basic_data(Integer id,String code,String name,String attribute,String company,Integer states){
		this.id=id;
		this.code=code;
		this.name=name;
		this.attribute=attribute;
		this.company=company;
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
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
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
	public void setStates(Integer states){
		this.states=states;
	}
	public Integer getStates(){
		return states;
	}
	public String toString() { 
		return "F_terminal_basic_data[id=" + id + ",code=" + code + ",name=" + name + ","+
		"attribute=" + attribute + ",company=" + company + ",states=" + states + "]";
	}
}

