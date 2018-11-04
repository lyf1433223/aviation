package cn.lyf1433223.pojo.aviation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @ClassName:f_admin 
 * @Description: TODO(��˵����f_admin )
 * @author Uncle liu 
 * @date 2018-10-28 16:21:10
 */ 

@Service("admin")
public class F_admin{
	private Integer id;
	private String code;
	private String username;
	private String password;
	private String name;
	private Integer sex;
	private Integer age;
	private Dept dept;
	private String qq;
	private String tel;
	private String email;
	private String other;
	private F_admin_role adminRole;
	private Integer state;
	private String add_time;
	private String login_time;
	private String remark;
	public F_admin(){
	}

	public F_admin(Integer id, String code, String username, String password, String name, Integer sex, Integer age, String qq, String tel, String email, String other, Integer state, String add_time, String login_time, String remark) {
		this.id = id;
		this.code = code;
		this.username = username;
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.qq = qq;
		this.tel = tel;
		this.email = email;
		this.other = other;
		this.state = state;
		this.add_time = add_time;
		this.login_time = login_time;
		this.remark = remark;
	}

	public F_admin(Integer id, String code, String username, String password, String name, Integer sex, Integer age, Dept dept, String qq, String tel, String email, String other, F_admin_role adminRole, Integer state, String add_time, String login_time, String remark) {
		this.id = id;
		this.code = code;
		this.username = username;
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.dept = dept;
		this.qq = qq;
		this.tel = tel;
		this.email = email;
		this.other = other;
		this.adminRole = adminRole;
		this.state = state;
		this.add_time = add_time;
		this.login_time = login_time;
		this.remark = remark;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public F_admin_role getAdminRole() {
		return adminRole;
	}

	public void setAdminRole(F_admin_role adminRole) {
		this.adminRole = adminRole;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getAdd_time() {
		return add_time;
	}

	public void setAdd_time(String add_time) {
		this.add_time = add_time;
	}

	public String getLogin_time() {
		return login_time;
	}

	public void setLogin_time(String login_time) {
		this.login_time = login_time;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "F_admin{" +
				"id=" + id +
				", code='" + code + '\'' +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", name='" + name + '\'' +
				", sex=" + sex +
				", age=" + age +
				", dept=" + dept +
				", qq='" + qq + '\'' +
				", tel='" + tel + '\'' +
				", email='" + email + '\'' +
				", other='" + other + '\'' +
				", adminRole=" + adminRole +
				", state=" + state +
				", add_time='" + add_time + '\'' +
				", login_time='" + login_time + '\'' +
				", remark='" + remark + '\'' +
				'}';
	}
}

