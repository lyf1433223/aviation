package cn.lyf1433223.pojo.aviation;


/**
 * @ClassName:f_aircompanyt_basic_data 
 * @Description: TODO(��˵����f_aircompanyt_basic_data )
 * @author Uncle liu 
 * @date 2018-10-28 16:21:11
 */ 

public class F_aircompanyt_basic_data{
	private Integer id;
	private String code;
	private String en_abb;
	private String name;
	private String branch_name;
	private String two_code;
	private String three_code;
	private String attribute;
	private String tel;
	private String linkman;
	private String linkman_post;
	private Integer first_time;
	private String email;
	public F_aircompanyt_basic_data(){
	}
	public F_aircompanyt_basic_data(Integer id,String code,String en_abb,String name,String branch_name,String two_code,String three_code,String attribute,String tel,String linkman,String linkman_post,Integer first_time,String email){
		this.id=id;
		this.code=code;
		this.en_abb=en_abb;
		this.name=name;
		this.branch_name=branch_name;
		this.two_code=two_code;
		this.three_code=three_code;
		this.attribute=attribute;
		this.tel=tel;
		this.linkman=linkman;
		this.linkman_post=linkman_post;
		this.first_time=first_time;
		this.email=email;
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
	public void setEn_abb(String en_abb){
		this.en_abb=en_abb;
	}
	public String getEn_abb(){
		return en_abb;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setBranch_name(String branch_name){
		this.branch_name=branch_name;
	}
	public String getBranch_name(){
		return branch_name;
	}
	public void setTwo_code(String two_code){
		this.two_code=two_code;
	}
	public String getTwo_code(){
		return two_code;
	}
	public void setThree_code(String three_code){
		this.three_code=three_code;
	}
	public String getThree_code(){
		return three_code;
	}
	public void setAttribute(String attribute){
		this.attribute=attribute;
	}
	public String getAttribute(){
		return attribute;
	}
	public void setTel(String tel){
		this.tel=tel;
	}
	public String getTel(){
		return tel;
	}
	public void setLinkman(String linkman){
		this.linkman=linkman;
	}
	public String getLinkman(){
		return linkman;
	}
	public void setLinkman_post(String linkman_post){
		this.linkman_post=linkman_post;
	}
	public String getLinkman_post(){
		return linkman_post;
	}
	public void setFirst_time(Integer first_time){
		this.first_time=first_time;
	}
	public Integer getFirst_time(){
		return first_time;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return email;
	}
	public String toString() { 
		return "F_aircompanyt_basic_data[id=" + id + ",code=" + code + ",en_abb=" + en_abb + ","+
		"name=" + name + ",branch_name=" + branch_name + ",two_code=" + two_code + ","+
		"three_code=" + three_code + ",attribute=" + attribute + ",tel=" + tel + ","+
		"linkman=" + linkman + ",linkman_post=" + linkman_post + ",first_time=" + first_time + ","+
		"email=" + email + "]";
	}
}

