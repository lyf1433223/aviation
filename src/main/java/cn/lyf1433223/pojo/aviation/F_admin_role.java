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
	private Integer state;
	private String add_time;
	private String Remark;

	public F_admin_role() {
	}

	public F_admin_role(Integer id, String name, String menu_id, Integer state, String add_time, String remark) {
		this.id = id;
		this.name = name;
		this.menu_id = menu_id;
		this.state = state;
		this.add_time = add_time;
		Remark = remark;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(String menu_id) {
		this.menu_id = menu_id;
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

	public String getRemark() {
		return Remark;
	}

	public void setRemark(String remark) {
		Remark = remark;
	}

	@Override
	public String toString() {
		return "F_admin_role{" +
				"id=" + id +
				", name='" + name + '\'' +
				", menu_id='" + menu_id + '\'' +
				", state=" + state +
				", add_time='" + add_time + '\'' +
				", Remark='" + Remark + '\'' +
				'}';
	}
}

