package cn.lyf1433223.dao;

import cn.lyf1433223.pojo.aviation.F_collection;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IConnectionDao {

    //查询所有接口
    @Select("SELECT * FROM f_collection")
    public List<F_collection> getAllCollection();

    //停用API
    @Update("update f_collection set state = 0 where id=#{id}")
    public int stopCollection(Integer id);

    //启用API
    @Update("update f_collection set state = 1 where id=#{id}")
    public int startCollection(Integer id);


    //启用API
    @Delete("delete from f_collection where id=#{id}")
    public int delCollection(Integer id);



}
