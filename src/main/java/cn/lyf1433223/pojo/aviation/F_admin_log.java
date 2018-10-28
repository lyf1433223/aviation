package cn.lyf1433223.pojo.aviation;

import java.util.Date;

/**
 * @ClassName:f_admin_log 
 * @Description: TODO(��˵����f_admin_log )
 * @author Uncle liu 
 * @date 2018-10-28 16:21:10
 */ 

public class F_admin_log{
	private Integer id;
	private String username;
	private String name;
	private Integer role_id;
	private String cotent;
	private Integer type;
	private String add_time;
	public F_admin_log(){
	}
	public F_admin_log(Integer id,String username,String name,Integer role_id,String cotent,Integer type,String add_time){
		this.id=id;
		this.username=username;
		this.name=name;
		this.role_id=role_id;
		this.cotent=cotent;
		this.type=type;
		this.add_time=add_time;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}
	public void setUsername(String username){
		this.username=username;
	}
	public String getUsername(){
		return username;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setRole_id(Integer role_id){
		this.role_id=role_id;
	}
	public Integer getRole_id(){
		return role_id;
	}
	public void setCotent(String cotent){
		this.cotent=cotent;
	}
	public String getCotent(){
		return cotent;
	}
	public void setType(Integer type){
		this.type=type;
	}
	public Integer getType(){
		return type;
	}
	public void setAdd_time(String add_time){
		this.add_time=add_time;
	}
	public String getAdd_time(){
		return add_time;
	}
	public String toString() { 
		return "F_admin_log[id=" + id + ",username=" + username + ",name=" + name + ","+
		"role_id=" + role_id + ",cotent=" + cotent + ",type=" + type + ","+
		"add_time=" + add_time + "]";
	}
}

