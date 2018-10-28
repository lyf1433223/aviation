package cn.lyf1433223.pojo.aviation;


/**
 * @ClassName:f_rec_basic_data 
 * @Description: TODO(��˵����f_rec_basic_data )
 * @author Uncle liu 
 * @date 2018-10-28 16:21:11
 */ 

public class F_rec_basic_data{
	private Integer id;
	private String code;
	private String number;
	private String seat;
	public F_rec_basic_data(){
	}
	public F_rec_basic_data(Integer id,String code,String number,String seat){
		this.id=id;
		this.code=code;
		this.number=number;
		this.seat=seat;
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
	public void setNumber(String number){
		this.number=number;
	}
	public String getNumber(){
		return number;
	}
	public void setSeat(String seat){
		this.seat=seat;
	}
	public String getSeat(){
		return seat;
	}
	public String toString() { 
		return "F_rec_basic_data[id=" + id + ",code=" + code + ",number=" + number + ","+
		"seat=" + seat + "]";
	}
}

