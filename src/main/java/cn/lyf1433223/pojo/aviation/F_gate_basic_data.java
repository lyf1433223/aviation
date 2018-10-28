package cn.lyf1433223.pojo.aviation;


/**
 * @ClassName:f_gate_basic_data 
 * @Description: TODO(��˵����f_gate_basic_data )
 * @author Uncle liu 
 * @date 2018-10-28 16:21:11
 */ 

public class F_gate_basic_data{
	private Integer id;
	private String code;
	private String attribute;
	private Integer type;
	private String channel;
	private String name;
	private String seat;
	private Integer states;
	public F_gate_basic_data(){
	}
	public F_gate_basic_data(Integer id,String code,String attribute,Integer type,String channel,String name,String seat,Integer states){
		this.id=id;
		this.code=code;
		this.attribute=attribute;
		this.type=type;
		this.channel=channel;
		this.name=name;
		this.seat=seat;
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
	public void setAttribute(String attribute){
		this.attribute=attribute;
	}
	public String getAttribute(){
		return attribute;
	}
	public void setType(Integer type){
		this.type=type;
	}
	public Integer getType(){
		return type;
	}
	public void setChannel(String channel){
		this.channel=channel;
	}
	public String getChannel(){
		return channel;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setSeat(String seat){
		this.seat=seat;
	}
	public String getSeat(){
		return seat;
	}
	public void setStates(Integer states){
		this.states=states;
	}
	public Integer getStates(){
		return states;
	}
	public String toString() { 
		return "F_gate_basic_data[id=" + id + ",code=" + code + ",attribute=" + attribute + ","+
		"type=" + type + ",channel=" + channel + ",name=" + name + ","+
		"seat=" + seat + ",states=" + states + "]";
	}
}

