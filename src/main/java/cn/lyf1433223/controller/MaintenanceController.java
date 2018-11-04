package cn.lyf1433223.controller;

import cn.lyf1433223.dao.IMaintenanceDao;
import cn.lyf1433223.pojo.aviation.*;
import com.alibaba.fastjson.JSON;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
public class MaintenanceController {


    @Resource
    private IMaintenanceDao iMaintenanceDao;

    @RequestMapping("/aircompanyt_basic_data")
    @ResponseBody
    public void getAllaircompanyt_basic_data(PrintWriter out){
        List<F_aircompanyt_basic_data> list = iMaintenanceDao.getAllaircompanyt_basic_data();
        String json = JSON.toJSONString(list);
        out.write(json);
    }

    @RequestMapping("/aircraft_basic_data")
    @ResponseBody
    public void getAllaircraft_basic_data(PrintWriter out){
        List<F_aircraft_basic_data> list = iMaintenanceDao.getAllaircraft_basic_data();
        String json = JSON.toJSONString(list);
        out.write(json);
    }

    @RequestMapping("/airport_basic_data")
    @ResponseBody
    public void getAllairport_basic_data(PrintWriter out){
        List<F_airport_basic_data> list = iMaintenanceDao.getAllairport_basic_data();
        String json = JSON.toJSONString(list);
        out.write(json);
    }

    @RequestMapping("/channel_basic_data")
    @ResponseBody
    public void getAllchannel_basic_data(PrintWriter out){
        List<F_channel_basic_data> list = iMaintenanceDao.getAllchannel_basic_data();
        String json = JSON.toJSONString(list);
        out.write(json);
    }

    @RequestMapping("/checkin_basic_data")
    @ResponseBody
    public void getAllcheckin_basic_data(PrintWriter out){
        List<F_checkin_basic_data> list = iMaintenanceDao.getAllcheckin_basic_data();
        String json = JSON.toJSONString(list);
        out.write(json);
    }

    @RequestMapping("/gate_basic_data")
    @ResponseBody
    public void getAllgate_basic_data(PrintWriter out){
        List<F_gate_basic_data> list = iMaintenanceDao.getAllgate_basic_data();
        String json = JSON.toJSONString(list);
        out.write(json);
    }

    @RequestMapping("/passenger")
    @ResponseBody
    public void getAllpassenger(PrintWriter out){
        List<F_passenger> list = iMaintenanceDao.getAllpassenger();
        String json = JSON.toJSONString(list);
        out.write(json);
    }

    @RequestMapping("/passenger_info")
    @ResponseBody
    public void getAllpassenger_info(PrintWriter out){
        List<F_passenger_info> list = iMaintenanceDao.getAllpassenger_info();
        String json = JSON.toJSONString(list);
        out.write(json);
    }

    @RequestMapping("/reason_basic_data")
    @ResponseBody
    public void getAllreason_basic_data(PrintWriter out){
        List<F_reason_basic_data> list = iMaintenanceDao.getAllreason_basic_data();
        String json = JSON.toJSONString(list);
        out.write(json);
    }

    @RequestMapping("/rec_basic_data")
    @ResponseBody
    public void getAllrec_basic_data(PrintWriter out){
        List<F_rec_basic_data> list = iMaintenanceDao.getAllrec_basic_data();
        String json = JSON.toJSONString(list);
        out.write(json);
    }

    @RequestMapping("/runway_basic_data")
    @ResponseBody
    public void getAllrunway_basic_data(PrintWriter out){
        List<F_runway_basic_data> list = iMaintenanceDao.getAllrunway_basic_data();
        String json = JSON.toJSONString(list);
        out.write(json);
    }

    @RequestMapping("/seat_basic_data")
    @ResponseBody
    public void getAllseat_basic_data(PrintWriter out){
        List<F_seat_basic_data> list = iMaintenanceDao.getAllseat_basic_data();
        String json = JSON.toJSONString(list);
        out.write(json);
    }

    @RequestMapping("/task_basic_data")
    @ResponseBody
    public void getAlltask_basic_data(PrintWriter out){
        List<F_task_basic_data> list = iMaintenanceDao.getAlltask_basic_data();
        String json = JSON.toJSONString(list);
        out.write(json);
    }

    @RequestMapping("/terminal_basic_data")
    @ResponseBody
    public void getAllterminal_basic_data(PrintWriter out){
        List<F_terminal_basic_data> list = iMaintenanceDao.getAllterminal_basic_data();
        String json = JSON.toJSONString(list);
        out.write(json);
    }

    @RequestMapping("/turntable_basic_data")
    @ResponseBody
    public void getAllturntable_basic_data(PrintWriter out){
        List<F_turntable_basic_data> list = iMaintenanceDao.getAllturntable_basic_data();
        String json = JSON.toJSONString(list);
        out.write(json);
    }


    @RequestMapping("/del")
    @ResponseBody
    public void Del(PrintWriter out,String table , Integer id){
        int i = iMaintenanceDao.Del(table, id);
        out.write(i+"");
    }



    @RequestMapping("/add")
    @ResponseBody
    public void Add(PrintWriter out , String table , Add list){

//        Map<String, String> data = list.getData();
//        for (Map.Entry e: data.entrySet()){
//            System.err.println(e.getKey());
//            System.err.println(e.getValue());
//        }

//        System.out.println(table);
        int i = iMaintenanceDao.Add(table, list);
        System.out.println(i);
        if(i > 0){
            out.write(i+"");
        }
    }


//    @RequestMapping("/select")
//    @ResponseBody
//    public void Select(PrintWriter out , String table){
//
//        System.out.println(table);
//        List<Select> list = iMaintenanceDao.Select(table);
//        System.out.println(list);
//        String json = JSON.toJSONString(list);
//        out.write(json);
//    }



}
