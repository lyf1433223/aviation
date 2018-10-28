package cn.lyf1433223.pojo.aviation;


/**
 * @ClassName:f_airport_basic_data 
 * @Description: TODO(��˵����f_airport_basic_data )
 * @author Uncle liu 
 * @date 2018-10-28 16:21:11
 */ 

public class F_airport_basic_data{
	private Integer id;
	private String code;
	private String name;
	private String route_abb;
	private String en_abb;
	private String attribute;
	private String three_code;
	private String four_code;
	private String city;
	private String level;
	private String address;
	private String tel;
	private String province;
	public F_airport_basic_data(){
	}
	public F_airport_basic_data(Integer id,String code,String name,String route_abb,String en_abb,String attribute,String three_code,String four_code,String city,String level,String address,String tel,String province){
		this.id=id;
		this.code=code;
		this.name=name;
		this.route_abb=route_abb;
		this.en_abb=en_abb;
		this.attribute=attribute;
		this.three_code=three_code;
		this.four_code=four_code;
		this.city=city;
		this.level=level;
		this.address=address;
		this.tel=tel;
		this.province=province;
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
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setRoute_abb(String route_abb){
		this.route_abb=route_abb;
	}
	public String getRoute_abb(){
		return route_abb;
	}
	public void setEn_abb(String en_abb){
		this.en_abb=en_abb;
	}
	public String getEn_abb(){
		return en_abb;
	}
	public void setAttribute(String attribute){
		this.attribute=attribute;
	}
	public String getAttribute(){
		return attribute;
	}
	public void setThree_code(String three_code){
		this.three_code=three_code;
	}
	public String getThree_code(){
		return three_code;
	}
	public void setFour_code(String four_code){
		this.four_code=four_code;
	}
	public String getFour_code(){
		return four_code;
	}
	public void setCity(String city){
		this.city=city;
	}
	public String getCity(){
		return city;
	}
	public void setLevel(String level){
		this.level=level;
	}
	public String getLevel(){
		return level;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getAddress(){
		return address;
	}
	public void setTel(String tel){
		this.tel=tel;
	}
	public String getTel(){
		return tel;
	}
	public void setProvince(String province){
		this.province=province;
	}
	public String getProvince(){
		return province;
	}
	public String toString() { 
		return "F_airport_basic_data[id=" + id + ",code=" + code + ",name=" + name + ","+
		"route_abb=" + route_abb + ",en_abb=" + en_abb + ",attribute=" + attribute + ","+
		"three_code=" + three_code + ",four_code=" + four_code + ",city=" + city + ","+
		"level=" + level + ",address=" + address + ",tel=" + tel + ","+
		"province=" + province + "]";
	}
}

