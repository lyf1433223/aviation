package cn.lyf1433223.pojo.aviation;


/**
 * @ClassName:f_collection 
 * @Description: TODO(��˵����f_collection )
 * @author Uncle liu 
 * @date 2018-10-28 16:21:11
 */ 

public class F_collection{
	private Integer id;
	private String name;
	private String url;
	private String edittime;
	private Integer state;

	public F_collection(){
	}

	public F_collection(Integer id, String name, String url, String edittime, Integer state) {
		this.id = id;
		this.name = name;
		this.url = url;
		this.edittime = edittime;
		this.state = state;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getEdittime() {
		return edittime;
	}

	public void setEdittime(String edittime) {
		this.edittime = edittime;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "F_collection{" +
				"id=" + id +
				", name='" + name + '\'' +
				", url='" + url + '\'' +
				", edittime='" + edittime + '\'' +
				", state=" + state +
				'}';
	}
}

