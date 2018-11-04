package cn.lyf1433223.pojo.aviation;


/**
 * @ClassName:f_gate_basic_data 
 * @Description: TODO(��˵����f_gate_basic_data )
 * @author Uncle liu 
 * @date 2018-11-02 12:06:06
 */ 

public class F_gate_basic_data{
	private Integer id;
	private String code;
	private String name;
	private String attribute;
	private String type;
	private String state;
	private String bay;
	private String terminal;
	private String tpxs;
	private String remark;
	public F_gate_basic_data(){
	}
	public F_gate_basic_data(Integer id,String code,String name,String attribute,String type,String state,String bay,String terminal,String tpxs,String remark){
		this.id=id;
		this.code=code;
		this.name=name;
		this.attribute=attribute;
		this.type=type;
		this.state=state;
		this.bay=bay;
		this.terminal=terminal;
		this.tpxs=tpxs;
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
	public void setType(String type){
		this.type=type;
	}
	public String getType(){
		return type;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return state;
	}
	public void setBay(String bay){
		this.bay=bay;
	}
	public String getBay(){
		return bay;
	}
	public void setTerminal(String terminal){
		this.terminal=terminal;
	}
	public String getTerminal(){
		return terminal;
	}
	public void setTpxs(String tpxs){
		this.tpxs=tpxs;
	}
	public String getTpxs(){
		return tpxs;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getRemark(){
		return remark;
	}
	public String toString() { 
		return "F_gate_basic_data[id=" + id + ",code=" + code + ",name=" + name + ","+
		"attribute=" + attribute + ",type=" + type + ",state=" + state + ","+
		"bay=" + bay + ",terminal=" + terminal + ",tpxs=" + tpxs + ","+
		"remark=" + remark + "]";
	}
}

