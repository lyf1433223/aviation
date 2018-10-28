package cn.lyf1433223.pojo.aviation;

import java.util.Date;

/**
 * @ClassName:f_admin_role 
 * @Description: TODO(��˵����f_admin_role )
 * @author Uncle liu 
 * @date 2018-10-28 16:21:11
 */ 

public class F_admin_role{
	private Integer id;
	private String name;
	private String menu_id;
	private String add_time;
	public F_admin_role(){
	}
	public F_admin_role(Integer id,String name,String menu_id,String add_time){
		this.id=id;
		this.name=name;
		this.menu_id=menu_id;
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
	public void setMenu_id(String menu_id){
		this.menu_id=menu_id;
	}
	public String getMenu_id(){
		return menu_id;
	}
	public void setAdd_time(String add_time){
		this.add_time=add_time;
	}
	public String getAdd_time(){
		return add_time;
	}
	public String toString() { 
		return "F_admin_role[id=" + id + ",name=" + name + ",menu_id=" + menu_id + ","+
		"add_time=" + add_time + "]";
	}
}

