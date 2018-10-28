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
	public F_collection(){
	}
	public F_collection(Integer id,String name,String url){
		this.id=id;
		this.name=name;
		this.url=url;
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
	public void setUrl(String url){
		this.url=url;
	}
	public String getUrl(){
		return url;
	}
	public String toString() { 
		return "F_collection[id=" + id + ",name=" + name + ",url=" + url + "]";
	}
}

