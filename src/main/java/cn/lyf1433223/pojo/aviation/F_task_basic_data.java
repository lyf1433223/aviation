package cn.lyf1433223.pojo.aviation;

import java.io.Serializable;

public class F_task_basic_data implements Serializable{
    private Integer id;

    private String task_code;

    private String task_zh_short;

    private String task_sort;

    private String task_zh;

    private String task_en;

    private String remark;

    public F_task_basic_data() {
    }

    public F_task_basic_data(Integer id) {
        this.id = id;
    }


    public F_task_basic_data(Integer id, String task_code, String task_zh_short, String task_sort, String task_zh, String task_en, String remark) {
        this.id = id;
        this.task_code = task_code;
        this.task_zh_short = task_zh_short;
        this.task_sort = task_sort;
        this.task_zh = task_zh;
        this.task_en = task_en;
        this.remark = remark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTask_code() {
        return task_code;
    }

    public void setTask_code(String task_code) {
        this.task_code = task_code;
    }

    public String getTask_zh_short() {
        return task_zh_short;
    }

    public void setTask_zh_short(String task_zh_short) {
        this.task_zh_short = task_zh_short;
    }

    public String getTask_sort() {
        return task_sort;
    }

    public void setTask_sort(String task_sort) {
        this.task_sort = task_sort;
    }

    public String getTask_zh() {
        return task_zh;
    }

    public void setTask_zh(String task_zh) {
        this.task_zh = task_zh;
    }

    public String getTask_en() {
        return task_en;
    }

    public void setTask_en(String task_en) {
        this.task_en = task_en;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "F_task_basic_data{" +
                "id=" + id +
                ", task_code='" + task_code + '\'' +
                ", task_zh_short='" + task_zh_short + '\'' +
                ", task_sort='" + task_sort + '\'' +
                ", task_zh='" + task_zh + '\'' +
                ", task_en='" + task_en + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}