package cn.lyf1433223.pojo.aviation;

import java.util.Date;

/**
 * @ClassName:f_admin 
 * @Description: TODO(��˵����f_admin )
 * @author Uncle liu 
 * @date 2018-10-28 16:21:10
 */ 

public class F_admin{
	private Integer id;
	private String code;
	private String username;
	private String password;
	private String name;
	private Integer sex;
	private Integer age;
	private String post;
	private String qq;
	private String tel;
	private String email;
	private String other;
	private Integer role_id;
	private Integer state;
	private String add_time;
	private String login_time;
	private String remark;
	public F_admin(){
	}
	public F_admin(Integer id,String code,String username,String password,String name,Integer sex,Integer age,String post,String qq,String tel,String email,String other,Integer role_id,Integer state,String add_time,String login_time,String remark){
		this.id=id;
		this.code=code;
		this.username=username;
		this.password=password;
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.post=post;
		this.qq=qq;
		this.tel=tel;
		this.email=email;
		this.other=other;
		this.role_id=role_id;
		this.state=state;
		this.add_time=add_time;
		this.login_time=login_time;
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
	public void setUsername(String username){
		this.username=username;
	}
	public String getUsername(){
		return username;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return password;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setSex(Integer sex){
		this.sex=sex;
	}
	public Integer getSex(){
		return sex;
	}
	public void setAge(Integer age){
		this.age=age;
	}
	public Integer getAge(){
		return age;
	}
	public void setPost(String post){
		this.post=post;
	}
	public String getPost(){
		return post;
	}
	public void setQq(String qq){
		this.qq=qq;
	}
	public String getQq(){
		return qq;
	}
	public void setTel(String tel){
		this.tel=tel;
	}
	public String getTel(){
		return tel;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return email;
	}
	public void setOther(String other){
		this.other=other;
	}
	public String getOther(){
		return other;
	}
	public void setRole_id(Integer role_id){
		this.role_id=role_id;
	}
	public Integer getRole_id(){
		return role_id;
	}
	public void setState(Integer state){
		this.state=state;
	}
	public Integer getState(){
		return state;
	}
	public void setAdd_time(String add_time){
		this.add_time=add_time;
	}
	public String getAdd_time(){
		return add_time;
	}
	public void setLogin_time(String login_time){
		this.login_time=login_time;
	}
	public String getLogin_time(){
		return login_time;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getRemark(){
		return remark;
	}
	public String toString() { 
		return "F_admin[id=" + id + ",code=" + code + ",username=" + username + ","+
		"password=" + password + ",name=" + name + ",sex=" + sex + ","+
		"age=" + age + ",post=" + post + ",qq=" + qq + ","+
		"tel=" + tel + ",email=" + email + ",other=" + other + ","+
		"role_id=" + role_id + ",state=" + state + ",add_time=" + add_time + ","+
		"login_time=" + login_time + ",remark=" + remark + "]";
	}
}

