package cn.lyf1433223.controller;


import cn.lyf1433223.dao.UserDao;
import cn.lyf1433223.pojo.aviation.*;
import cn.lyf1433223.util.JedisUtil;
import com.google.gson.Gson;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@Scope("prototype")
public class LoginContorller {


    private static final ServletRequestAttributes requestAttributes =
            (ServletRequestAttributes)RequestContextHolder.currentRequestAttributes();
    private static final HttpServletRequest request = requestAttributes.getRequest();
    private static final HttpSession session = request.getSession();
    private static final HttpServletResponse response = requestAttributes.getResponse();


    
    @Resource
    private UserDao userdao;
    private static final Logger logger = LogManager.getLogger();
    private static final Gson gson = new Gson();

    @Resource
    private JedisUtil jedisUtil;

    @Resource
    private F_flight_record record;

    @Resource
    private F_admin admin;


    /**
     * 启动加载
     */
    public void start(){
        List<Dept> depts = userdao.GetDeptAll();
        List<F_admin> admins = userdao.GetAdminAll();
        List<F_admin_role> roleList = userdao.GetAllRole();
        List<F_aircompanyt_basic_data> allAircompanyt = userdao.getAllAircompanyt();
        List<F_reason_basic_data> allReason = userdao.getAllReason();
        List<F_task_basic_data> allTask = userdao.getAllTask();
        List<F_statel_basic_data> stateAll = userdao.getStateAll();

        session.setAttribute("stateAll",stateAll);
        session.setAttribute("allTask",allTask);
        session.setAttribute("allReasons",allReason);
        session.setAttribute("allAircompanyts",allAircompanyt);
        session.setAttribute("depts",depts);
        session.setAttribute("Admins",admins);
        session.setAttribute("roles",roleList);
    }

    /**
     * 首页加载
     */
    @RequestMapping(value = "selectAll",method = RequestMethod.POST)
    public void select(PrintWriter out){
        List<F_flight_record> f_flight_records = userdao.SelectAll();
        String toJson = gson.toJson(f_flight_records);
        out.write(toJson);
    }


    /**
     * 查询是否有此用户
     */
    @RequestMapping(value = "login",method = RequestMethod.POST)
    @ResponseBody
    public void SelectLogin(Model model,F_admin admin) throws Exception{
        PrintWriter out = response.getWriter();
        Integer integer = userdao.SelectUser(admin);
        out.write(integer+"");
    }

    /**
     * 用户登陆
     */
    @RequestMapping(value = "userLogin",method = RequestMethod.POST)
    public String UserLogin(Model model,F_admin admin){
        Jedis jedis = jedisUtil.GetJedis();
        F_admin f_admin = userdao.UserLogin(admin);
        session.setAttribute("Admin",f_admin);
        start();
        return "redirect:index.jsp";
    }

    /**
     * 用户启用以及停用
     */
    @RequestMapping(value = "StartAndStop",method = RequestMethod.POST)
    @ResponseBody
    public void StartAndStop(Model model,F_admin admin) throws Exception{
        PrintWriter out = response.getWriter();
        logger.debug(admin);
        if(admin.getState()==1){
            userdao.StopUser(admin.getId());
        }else{
            userdao.StartUser(admin.getId());
        }
        List<F_admin> list = userdao.GetAdminAll();
        session.setAttribute("Admins",list);
        F_admin admins = userdao.SelectOneUser(admin.getId());
        String json = gson.toJson(admins);
        out.write(json);
    }

    /**
     * 查询用户
     */
    @RequestMapping(value = "selectOne",method = RequestMethod.POST)
    @ResponseBody
    public void SelectOneUser(Model model,Integer id) throws Exception{
        PrintWriter out = response.getWriter();
        F_admin admins = userdao.SelectOneUser(id);
        String json = gson.toJson(admins);
        out.write(json);
    }

    /**
     * 修改用户
     */
    @RequestMapping(value = "editUser",method = RequestMethod.POST)
    @ResponseBody
    public void EditUser(Integer id,String username,String password,
                         String name,String qq,String tel,String email,Integer age,
                        Integer dept,Integer sex,Integer adminRole,String remark) throws  Exception{
        PrintWriter out = response.getWriter();
        Integer update = userdao.Update(id,username,password,name,qq,tel,email,age,dept,sex,adminRole,remark);
        F_admin admin = userdao.SelectOneUser(id);
        String toJson = gson.toJson(admin);
        List<F_admin> list = userdao.GetAdminAll();
        F_admin admin1 = (F_admin) session.getAttribute("Admin");
        if(admin1.getId()==id){
            session.setAttribute("Admin",admin);
        }
        session.setAttribute("Admins",list);
        out.write(toJson);
    }

    /**
     * 添加用户
     */
    @RequestMapping(value = "AddUser",method = RequestMethod.POST)
    @ResponseBody
    public void AddUser(String username,String password,
                        String name,String qq,String tel,String email,Integer age,
                        Integer dept,Integer sex,Integer adminRole,String remark) throws Exception{
        PrintWriter out = response.getWriter();
        Integer add = userdao.AddUser(username, password, name, qq, tel, email, age, dept, sex, adminRole, remark);
        admin.setUsername(username);
        admin.setPassword(password);
        F_admin f_admin = userdao.UserLogin(admin);
        String json = gson.toJson(f_admin);
        List<F_admin> list = userdao.GetAdminAll();
        session.setAttribute("Admins",list);
        out.write(json);
    }

    /**
     * 删除用户
     * @param id
     */
    @RequestMapping(value = "deleteUser",method = RequestMethod.POST)
    @ResponseBody
    public void DeleteUser(Integer id){
        Integer integer = userdao.DeleteUser(id);
        List<F_admin> list = userdao.GetAdminAll();
        session.setAttribute("Admins",list);
    }

    /**
     * 根据条件查询用户
     * @param admin
     * @param post
     * @throws Exception
     */
    @RequestMapping(value = "selectUserLike",method = RequestMethod.POST)
    @ResponseBody
    public void selectUserLike(F_admin admin,Integer post) throws Exception{
        PrintWriter out = response.getWriter();
        List<F_admin> admins = userdao.SelectUserLike(admin,post);
        String json = gson.toJson(admins);
        out.write(json);
    }

    /**
     * 用户启用以及停用
     */
    @RequestMapping(value = "UsersStartAndStop",method = RequestMethod.POST)
    @ResponseBody
    public void UsersStartAndStop(Model model,F_admin_role role) throws Exception{
        PrintWriter out = response.getWriter();
        if(role.getState()==1){
            userdao.StopRole(role.getId());
            userdao.StopUsers(role.getId());
        }else{
            userdao.StartRole(role.getId());
            userdao.StartUsers(role.getId());
        }
        F_admin_role f_admin_role = userdao.SelectRole(role.getId());
        String s = gson.toJson(f_admin_role);

        List<F_admin_role> roleList = userdao.GetAllRole();
        session.setAttribute("roles",roleList);

        List<F_admin> list = userdao.GetAdminAll();
        session.setAttribute("Admins",list);
        out.write(s);
    }

    /**
     * 添加用户组
     * @param role
     * @throws Exception
     */
    @RequestMapping(value = "AddRole",method = RequestMethod.POST)
    @ResponseBody
    public void AddRole(F_admin_role role) throws Exception{
        PrintWriter out = response.getWriter();
        Integer addrole = userdao.AddRole(role);
        F_admin_role adminrole = userdao.SelectRole(role.getId());

        List<F_admin_role> roleList = userdao.GetAllRole();
        session.setAttribute("roles",roleList);

        String json = gson.toJson(adminrole);
        out.write(json);
    }

    @RequestMapping(value = "SelectAdmin",method = RequestMethod.GET)
    public String SelectAdmin(Model model,@RequestParam("role_id") Integer role_id){
        List<F_admin> f_admins = userdao.selectAdmin(role_id);
        model.addAttribute("Roleadmins",f_admins);
        return "user-group-list.jsp";
    }


    /**
     * 根据条件以及用户组id查询用户
     * @param admin
     * @param post
     * @throws Exception
     */
    @RequestMapping(value = "SelectUserandRoleLike",method = RequestMethod.POST)
    @ResponseBody
    public void selectUserLike(F_admin admin,Integer post,Integer role_id) throws Exception{
        PrintWriter out = response.getWriter();
        List<F_admin> admins = userdao.SelectUserandRoleLike(admin,post,role_id);
        String json = gson.toJson(admins);
        out.write(json);
    }


    @RequestMapping(value = "EditRecord",method = RequestMethod.POST)
    @ResponseBody
    public void updateRecord(PrintWriter out,F_flight_record record,String seatObj,String gateObj,
                             String turntableObjm,String airlineObj,String terminalObj,
                             Integer stateObj,Integer taskObj,Integer trysObj){
        Integer integer = userdao.UpdateRecord(record,gateObj, turntableObjm, airlineObj, terminalObj, stateObj, taskObj, trysObj);
        List<F_flight_record> f_flight_records = userdao.SelectAll();
        String toJson = gson.toJson(f_flight_records);
        out.write(toJson);
    }

    @RequestMapping(value = "SelectRecordLike",method = RequestMethod.POST)
    @ResponseBody
    public void SelectRecordLike(PrintWriter out,String flight_no,String no,String plan_take_time,Integer attribute
                                ,Integer harbor,Integer airline,String nature,Integer state){
        List<F_flight_record> f_flight_records = userdao.selectRecordLike(flight_no, no, plan_take_time, attribute, harbor, airline, nature, state);
        String toJson = gson.toJson(f_flight_records);
        out.write(toJson);
    }

}
