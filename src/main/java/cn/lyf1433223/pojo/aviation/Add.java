package cn.lyf1433223.pojo.aviation;

import java.util.List;
import java.util.Map;

public class Add {

    //通用查询
    private Map<String , String> data;

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Add{" +
                "data=" + data +
                '}';
    }
}
