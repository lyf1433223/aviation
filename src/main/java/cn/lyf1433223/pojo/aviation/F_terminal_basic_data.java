package cn.lyf1433223.pojo.aviation;


/**
 * @ClassName:f_terminal_basic_data 
 * @Description: TODO(��˵����f_terminal_basic_data )
 * @author Uncle liu 
 * @date 2018-11-02 11:51:35
 */ 

public class F_terminal_basic_data{
	private Integer id;
	private String code;
	private String name;
	private String attribute;
	private Integer state;
	private String company;
	private String remark;
	public F_terminal_basic_data(){
	}
	public F_terminal_basic_data(Integer id,String code,String name,String attribute,Integer state,String company,String remark){
		this.id=id;
		this.code=code;
		this.name=name;
		this.attribute=attribute;
		this.state=state;
		this.company=company;
		this.remark=remark;
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
	public void setState(Integer state){
		this.state=state;
	}
	public Integer getState(){
		return state;
	}
	public void setCompany(String company){
		this.company=company;
	}
	public String getCompany(){
		return company;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getRemark(){
		return remark;
	}
	public String toString() { 
		return "F_terminal_basic_data[id=" + id + ",code=" + code + ",name=" + name + ","+
		"attribute=" + attribute + ",state=" + state + ",company=" + company + ","+
		"remark=" + remark + "]";
	}
}

