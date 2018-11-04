package cn.lyf1433223.pojo.aviation;


/**
 * @ClassName:f_reason_basic_data 
 * @Description: TODO(��˵����f_reason_basic_data )
 * @author Uncle liu 
 * @date 2018-11-02 12:07:35
 */ 

public class F_reason_basic_data{
	private Integer id;
	private String code;
	private String zwms;
	private String ywms;
	private String remark;
	public F_reason_basic_data(){
	}
	public F_reason_basic_data(Integer id,String code,String zwms,String ywms,String remark){
		this.id=id;
		this.code=code;
		this.zwms=zwms;
		this.ywms=ywms;
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
	public void setZwms(String zwms){
		this.zwms=zwms;
	}
	public String getZwms(){
		return zwms;
	}
	public void setYwms(String ywms){
		this.ywms=ywms;
	}
	public String getYwms(){
		return ywms;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getRemark(){
		return remark;
	}
	public String toString() { 
		return "F_reason_basic_data[id=" + id + ",code=" + code + ",zwms=" + zwms + ","+
		"ywms=" + ywms + ",remark=" + remark + "]";
	}
}

