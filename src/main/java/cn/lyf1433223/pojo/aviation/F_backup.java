package cn.lyf1433223.pojo.aviation;

import java.util.Date;

/**
 * @ClassName:f_backup 
 * @Description: TODO(��˵����f_backup )
 * @author Uncle liu 
 * @date 2018-10-28 16:21:11
 */ 

public class F_backup{
	private Integer id;
	private String name;
	private String add_time;
	public F_backup(){
	}
	public F_backup(Integer id,String name,String add_time){
		this.id=id;
		this.name=name;
		this.add_time=add_time;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAdd_time(String add_time){
		this.add_time=add_time;
	}
	public String getAdd_time(){
		return add_time;
	}
	public String toString() { 
		return "F_backup[id=" + id + ",name=" + name + ",add_time=" + add_time + "]";
	}
}

