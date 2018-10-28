package cn.lyf1433223.pojo.aviation;


/**
 * @ClassName:f_reason_basic_data 
 * @Description: TODO(��˵����f_reason_basic_data )
 * @author Uncle liu 
 * @date 2018-10-28 16:21:11
 */ 

public class F_reason_basic_data{
	private Integer id;
	private String code;
	private String name;
	private String en_name;
	public F_reason_basic_data(){
	}
	public F_reason_basic_data(Integer id,String code,String name,String en_name){
		this.id=id;
		this.code=code;
		this.name=name;
		this.en_name=en_name;
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
	public void setEn_name(String en_name){
		this.en_name=en_name;
	}
	public String getEn_name(){
		return en_name;
	}
	public String toString() { 
		return "F_reason_basic_data[id=" + id + ",code=" + code + ",name=" + name + ","+
		"en_name=" + en_name + "]";
	}
}

