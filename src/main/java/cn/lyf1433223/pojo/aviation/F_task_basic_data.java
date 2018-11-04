package cn.lyf1433223.pojo.aviation;


/**
 * @ClassName:f_task_basic_data 
 * @Description: TODO(��˵����f_task_basic_data )
 * @author Uncle liu 
 * @date 2018-10-28 16:21:11
 */ 

public class F_task_basic_data{
	private Integer id;
	private String code;
	private String synopsis;
	private String name;
	private String en_name;
	private String task_code;
	private Integer rank;
	public F_task_basic_data(){
	}
	public F_task_basic_data(Integer id,String code,String synopsis,String name,String en_name,String task_code,Integer rank){
		this.id=id;
		this.code=code;
		this.synopsis=synopsis;
		this.name=name;
		this.en_name=en_name;
		this.task_code=task_code;
		this.rank=rank;
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
	public void setSynopsis(String synopsis){
		this.synopsis=synopsis;
	}
	public String getSynopsis(){
		return synopsis;
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
	public void setTask_code(String task_code){
		this.task_code=task_code;
	}
	public String getTask_code(){
		return task_code;
	}
	public void setRank(Integer rank){
		this.rank=rank;
	}
	public Integer getRank(){
		return rank;
	}
	public String toString() { 
		return "F_task_basic_data[id=" + id + ",code=" + code + ",synopsis=" + synopsis + ","+
		"name=" + name + ",en_name=" + en_name + ",task_code=" + task_code + ","+
		"rank=" + rank + "]";
	}
}

