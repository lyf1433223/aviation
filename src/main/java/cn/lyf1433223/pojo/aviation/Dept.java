package cn.lyf1433223.pojo.aviation;

public class Dept {
    private Integer id;
    private String dept_Seria;
    private String dept_name;
    private String dept_Remark;

    public Dept() {
    }

    public Dept(Integer id, String dept_Seria, String dept_name, String dept_Remark) {
        this.id = id;
        this.dept_Seria = dept_Seria;
        this.dept_name = dept_name;
        this.dept_Remark = dept_Remark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDept_Seria() {
        return dept_Seria;
    }

    public void setDept_Seria(String dept_Seria) {
        this.dept_Seria = dept_Seria;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getDept_Remark() {
        return dept_Remark;
    }

    public void setDept_Remark(String dept_Remark) {
        this.dept_Remark = dept_Remark;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", dept_Seria='" + dept_Seria + '\'' +
                ", dept_name='" + dept_name + '\'' +
                ", dept_Remark='" + dept_Remark + '\'' +
                '}';
    }
}
