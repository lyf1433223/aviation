package cn.lyf1433223.dao;


import cn.lyf1433223.pojo.aviation.*;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userdao")
public interface UserDao {


    /**
     * 查询是否有此用户
     */
    @Select("select id from f_admin where username=#{username} and password=#{password}")
    public Integer SelectUser(F_admin admin);

    /**
     * 用户登陆
     */
    @Select("select * from f_admin where username=#{username} and password=#{password}")
    @Results({
         @Result(id=true,property = "id",column = "id"),
         @Result(property = "dept",column = "post",
                 one = @One(select = "cn.lyf1433223.dao.UserDao.SelectDept")
         ),
         @Result(property = "adminRole",column = "role_id",
                one = @One(select = "cn.lyf1433223.dao.UserDao.SelectRole")
         )
    })
    public F_admin UserLogin(F_admin admin);
    @Select("select * from dept_info where id = #{post}")
    public Dept SelectDept(@Param("post") Integer post);
    @Select("select * from F_admin_role where id = #{role_id}")
    public F_admin_role SelectRole(@Param("role_id") Integer role_id);


    /**
     * 查询所有部门
     */
    @Select("select * from dept_info")
    public List<Dept> GetDeptAll();

    /**
     * 查询所有员工
     */
    @Select("select * from F_admin")
    @Results({
            @Result(id=true,property = "id",column = "id"),
            @Result(property = "dept",column = "post",
                    one = @One(select = "cn.lyf1433223.dao.UserDao.SelectDept")
            ),
            @Result(property = "adminRole",column = "role_id",
                    one = @One(select = "cn.lyf1433223.dao.UserDao.SelectRole")
            )
    })
    public List<F_admin> GetAdminAll();

    /**
     * 用户停用
     */
    @Update("update f_admin set state=0 where id=#{id}")
    public Integer StopUser(@Param("id") Integer id);

    /**
     * 用户停用
     */
    @Update("update f_admin set state=1 where id=#{id}")
    public Integer StartUser(@Param("id") Integer id);

    /**
     * 查询单个用户
     */
    @Select("select * from f_admin where id=#{id}")
    @Results({
            @Result(id=true,property = "id",column = "id"),
            @Result(property = "dept",column = "post",
                    one = @One(select = "cn.lyf1433223.dao.UserDao.SelectDept")
            ),
            @Result(property = "adminRole",column = "role_id",
                    one = @One(select = "cn.lyf1433223.dao.UserDao.SelectRole")
            )
    })
    public F_admin SelectOneUser(@Param("id") Integer id);


    /**
     * 修改用户
     * @param id
     * @param username
     * @param password
     * @param name
     * @param qq
     * @param tel
     * @param email
     * @param age
     * @param dept
     * @param sex
     * @param adminRole
     * @param remark
     * @return
     */
    @Update("update F_admin set username=#{username},password=#{password}," +
            "name=#{name},sex=#{sex},age=#{age},post=#{dept},qq=#{qq},tel=#{tel}," +
            "email=#{email},role_id=#{adminRole},remark=#{remark} where id = #{id}")
    public Integer Update(@Param("id") Integer id,@Param("username")String username,@Param("password") String password,
                          @Param("name") String name,@Param("qq") String qq,@Param("tel") String tel,
                          @Param("email") String email,@Param("age") Integer age,@Param("dept") Integer dept,
                          @Param("sex") Integer sex,@Param("adminRole") Integer adminRole,@Param("remark") String remark);

    /**
     * 添加一个用户
     * @param username
     * @param password
     * @param name
     * @param qq
     * @param tel
     * @param email
     * @param age
     * @param dept
     * @param sex
     * @param adminRole
     * @param remark
     * @return
     */
    @Insert("insert into F_admin(username,password,name,sex,age,post,qq,tel,email,role_id,remark) " +
            "values(#{username},#{password},#{name},#{sex},#{age},#{dept},#{qq},#{tel},#{email},#{adminRole},#{remark})")
    public Integer AddUser(@Param("username")String username,@Param("password") String password,
                           @Param("name") String name,@Param("qq") String qq,@Param("tel") String tel,
                           @Param("email") String email,@Param("age") Integer age,@Param("dept") Integer dept,
                           @Param("sex") Integer sex,@Param("adminRole") Integer adminRole,@Param("remark") String remark);


    /**
     * 删除用户
     * @param id
     * @return
     */
    @Delete("delete from F_admin where id=#{id}")
    public Integer DeleteUser(@Param("id") Integer id);

    /**
     * 根据条件查询用户
     * @param admin
     * @param post
     * @return
     */
    public List<F_admin> SelectUserLike(@Param("admin") F_admin admin,@Param("post") Integer post);

    /**
     * 查询所有的用户组
     * @return
     */
    @Select("select * from f_admin_role")
    public List<F_admin_role> GetAllRole();


    /**
     * 用户组停用以及启用
     */
    @Update("update f_admin_role set state=0 where id=#{id}")
    public Integer StopRole(@Param("id") Integer id);
    @Update("update f_admin set state=0 where role_id=#{id}")
    public Integer StopUsers(@Param("id") Integer id);

    @Update("update f_admin_role set state=1 where id=#{id}")
    public Integer StartRole(@Param("id") Integer id);
    @Update("update f_admin set state=1 where role_id=#{id}")
    public Integer StartUsers(@Param("id") Integer id);

    /**
     * 添加用户组
     * @param role
     * @return
     */
    @Insert("insert into F_admin_role(name,remark) values(#{name},#{remark})")
    @SelectKey(keyProperty = "id",before = false,
            statement = "select LAST_INSERT_ID()",
            keyColumn = "id",resultType = Integer.class)
    public Integer AddRole(F_admin_role role);


    /**
     * 根据用户组id查询所有的用户
     * @param role_id
     * @return
     */
    @Select("select * from F_admin where role_id=#{role_id }")
    @Results({
            @Result(id=true,property = "id",column = "id"),
            @Result(property = "dept",column = "post",
                    one = @One(select = "cn.lyf1433223.dao.UserDao.SelectDept")
            ),
            @Result(property = "adminRole",column = "role_id",
                    one = @One(select = "cn.lyf1433223.dao.UserDao.SelectRole")
            )
    })
    public List<F_admin> selectAdmin(@Param("role_id") Integer role_id);

    /**
     * 根据条件以及用户组id查询用户
     * @param admin
     * @param post
     * @return
     */
    public List<F_admin> SelectUserandRoleLike(@Param("admin") F_admin admin,@Param("post") Integer post,@Param("role_id") Integer role_id);




    /**
     * 查询航班信息
     * @return
     */
    @Select("select * from F_flight_record")
    @Results({@Result(id = true, property = "id", column = "id"),
            @Result(property = "task", column = "task",
                    one = @One(select = "cn.lyf1433223.dao.UserDao.SelectTask")),
            @Result(property = "seat",column = "seatid",
                    one = @One(select = "cn.lyf1433223.dao.UserDao.SelectSeat")),
            @Result(property = "gate",column = "gateid",
                    one = @One(select = "cn.lyf1433223.dao.UserDao.SelectGate")),
            @Result(property = "turntable",column = "turntableid",
                    one = @One(select = "cn.lyf1433223.dao.UserDao.SelectTurntable")),
            @Result(property = "airline",column = "airline_id",
                    one = @One(select = "cn.lyf1433223.dao.UserDao.SelectAircraft")),
            @Result(property = "trys",column = "TryId",
                    one = @One(select = "cn.lyf1433223.dao.UserDao.SelectReason")),
            @Result(property = "terminal",column = "terminalId",
                    one = @One(select = "cn.lyf1433223.dao.UserDao.SelectTerminal")),
            @Result(property = "state",column = "state",
                    one = @One(select = "cn.lyf1433223.dao.UserDao.SelectState"))
    })
    public List<F_flight_record> SelectAll();

    @Select("select * from F_task_basic_data where id=#{task}")
    public F_task_basic_data SelectTask(@Param("task") Integer task);
    @Select("select * from F_seat_basic_data where id=#{seatid}")
    public F_seat_basic_data SelectSeat(@Param("seatid") Integer seatid);
    @Select("select * from F_gate_basic_data where id =#{gateid}")
    public F_gate_basic_data SelectGate(@Param("gateid") Integer gateid);
    @Select("select * from F_turntable_basic_data where id=#{turntableid}")
    public F_turntable_basic_data SelectTurntable(@Param("turntableid") Integer turntableid);
    @Select("select * from F_aircompanyt_basic_data where id =#{airline_id}")
    public F_aircompanyt_basic_data SelectAircraft(@Param("airline_id") Integer airline_id);
    @Select("select * from F_reason_basic_data where id =#{TryId}")
    public F_reason_basic_data SelectReason(@Param("TryId") Integer TryId);
    @Select("select * from F_terminal_basic_data where id =#{terminalId}")
    public F_terminal_basic_data SelectTerminal(@Param("terminalId") Integer terminalId);
    @Select("select * from F_statel_basic_data where id =#{state}")
    public F_statel_basic_data SelectState(@Param("state") Integer state);


    /**
     * 查询所有航班状态
     */
    @Select("select * from F_statel_basic_data")
    public List<F_statel_basic_data> getStateAll();
    /**
     * 查询所有航空公司
     */
    @Select("select * from f_aircompanyt_basic_data")
    public List<F_aircompanyt_basic_data> getAllAircompanyt();
    /**
     *查询所有异常状态
     */
    @Select("select * from f_reason_basic_data")
    public List<F_reason_basic_data> getAllReason();
    /**
     * 查询所有任务性质
     */
    @Select("select * from f_task_basic_data")
    public List<F_task_basic_data> getAllTask();


    @Update("update f_flight_record set do_date=DATE(#{record.do_date}),air_code=#{record.air_code},flight_no=#{record.flight_no}," +
            "no=#{record.no},jix=#{record.jix},nature=#{record.nature},attribute=#{record.attribute},harbor=#{record.harbor}," +
            "relation_id=#{record.relation_id},adult_num=#{record.adult_num},child_num=#{record.child_num},baby_num=#{record.baby_num}" +
            ",plan_take_time=DATE(#{record.plan_take_time}),real_take_time=DATE(#{record.real_take_time}),luggage_num=#{record.luggage_num}," +
            "cargo_weight=#{record.cargo_weight},remove_time=DATE(#{record.remove_time}),plan_land_time=DATE(#{record.plan_land_time})," +
            "real_land_time=DATE(#{record.real_land_time}),state=#{state},tryid=#{trys},task=#{task}," +
            "block_time=DATE(#{record.block_time}),airport_start=#{record.airport_start},airport_end_spare=#{record.airport_end_spare}," +
            "flight_agent=#{record.flight_agent} where id=#{record.id}")
    public Integer UpdateRecord(@Param("record") F_flight_record record,@Param("gate") String gate,
                                @Param("turntable") String turntable,@Param("airline") String airline,
                                @Param("terminal") String terminal,@Param("state") Integer state,
                                @Param("task") Integer task,@Param("trys") Integer trys);

//    @Update("update f_seat_basic_data set ")
//    public Integer Updateseat(@Param("seat") String seat);

    @Select("<script>" +
            "select * from f_flight_record where 1=1\n" +
            "          <if test=\"flight_no!=''\">\n" +
            "            and flight_no=#{flight_no}\n" +
            "          </if>\n" +
            "          <if test=\"no!=''\">\n" +
            "              and no=#{no}\n" +
            "          </if>\n" +
            "          <if test=\"plan_take_time!=''\">\n" +
            "              and plan_take_time like '%${plan_take_time}%'\n" +
            "          </if>\n" +
            "          <if test=\"attribute==1\">\n" +
            "              and attribute=${attribute}\n" +
            "          </if>\n" +
            "          <if test=\"harbor!=-1\">\n" +
            "              and harbor=${harbor}\n" +
            "          </if>\n" +
            "          <if test=\"airline!=0\">\n" +
            "              and airline=${airline}\n" +
            "          </if>\n" +
            "          <if test=\"nature!='所有'\">\n" +
            "              and nature=#{nature}\n" +
            "          </if>" +
            "          <if test=\"state!=0\">" +
            "          and state=#{state}" +
            "          </if>" +
            "</script>")
    @Results({@Result(id = true, property = "id", column = "id"),
            @Result(property = "task", column = "task",
                    one = @One(select = "cn.lyf1433223.dao.UserDao.SelectTask")),
            @Result(property = "seat",column = "seatid",
                    one = @One(select = "cn.lyf1433223.dao.UserDao.SelectSeat")),
            @Result(property = "gate",column = "gateid",
                    one = @One(select = "cn.lyf1433223.dao.UserDao.SelectGate")),
            @Result(property = "turntable",column = "turntableid",
                    one = @One(select = "cn.lyf1433223.dao.UserDao.SelectTurntable")),
            @Result(property = "airline",column = "airline_id",
                    one = @One(select = "cn.lyf1433223.dao.UserDao.SelectAircraft")),
            @Result(property = "trys",column = "TryId",
                    one = @One(select = "cn.lyf1433223.dao.UserDao.SelectReason")),
            @Result(property = "terminal",column = "terminalId",
                    one = @One(select = "cn.lyf1433223.dao.UserDao.SelectTerminal")),
            @Result(property = "state",column = "state",
                    one = @One(select = "cn.lyf1433223.dao.UserDao.SelectState"))
    })
    public List<F_flight_record> selectRecordLike(@Param("flight_no") String flight_no,@Param("no") String no,@Param("plan_take_time") String plan_take_time,@Param("attribute") Integer attribute
            ,@Param("harbor") Integer harbor,@Param("airline")Integer airline,@Param("nature")String nature,@Param("state")Integer state);


}
