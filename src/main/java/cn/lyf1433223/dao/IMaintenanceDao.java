package cn.lyf1433223.dao;

import cn.lyf1433223.pojo.aviation.*;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


public interface IMaintenanceDao {

    public int Del(@Param("table") String table , @Param("id") Integer id);

    public int Add(@Param("table") String table , @Param("list") Add list);

    public List<Select> Select(@Param("table") String table);

    //航空公司基础数据
    @Select("SELECT * FROM f_aircompanyt_basic_data")
    public List<F_aircompanyt_basic_data> getAllaircompanyt_basic_data();

    //飞机信息基础数据
    @Select("SELECT * FROM f_aircraft_basic_data")
    public List<F_aircraft_basic_data> getAllaircraft_basic_data();

    //机场基础数据
    @Select("SELECT * FROM f_airport_basic_data")
    public List<F_airport_basic_data> getAllairport_basic_data();

    //安检通道数据
    @Select("SELECT * FROM f_channel_basic_data")
    public List<F_channel_basic_data> getAllchannel_basic_data();

    //值机柜台基础数据
    @Select("SELECT * FROM f_checkin_basic_data")
    public List<F_checkin_basic_data> getAllcheckin_basic_data();

    //登机口基础数据
    @Select("SELECT * FROM f_gate_basic_data")
    public List<F_gate_basic_data> getAllgate_basic_data();

    //旅客信息表
    @Select("SELECT * FROM f_passenger")
    public List<F_passenger> getAllpassenger();

    //旅客航班流水信息表
    @Select("SELECT * FROM f_passenger_info")
    public List<F_passenger_info> getAllpassenger_info();


    //异常原因基础数据
    @Select("SELECT * FROM f_reason_basic_data")
    public List<F_reason_basic_data> getAllreason_basic_data();


    //廊桥基础数据
    @Select("SELECT * FROM f_rec_basic_data")
    public List<F_rec_basic_data> getAllrec_basic_data();

    //跑道基础数据
    @Select("SELECT * FROM f_runway_basic_data")
    public List<F_runway_basic_data> getAllrunway_basic_data();

    //机位基础数据
    @Select("SELECT * FROM f_seat_basic_data")
    public List<F_seat_basic_data> getAllseat_basic_data();

    //航班任务基础数据
    @Select("SELECT * FROM f_task_basic_data")
    public List<F_task_basic_data> getAlltask_basic_data();

    //航站楼基础数据
    @Select("SELECT * FROM f_terminal_basic_data")
    public List<F_terminal_basic_data> getAllterminal_basic_data();

    //行李转盘基础数据
    @Select("SELECT * FROM f_turntable_basic_data  ")
    public List<F_turntable_basic_data> getAllturntable_basic_data();

}
