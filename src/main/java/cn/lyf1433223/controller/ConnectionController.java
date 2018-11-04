package cn.lyf1433223.controller;

import cn.lyf1433223.dao.IConnectionDao;
import cn.lyf1433223.pojo.aviation.F_collection;
import cn.lyf1433223.redis.RedisCache;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

@Controller
public class ConnectionController {

    @Resource
    public RedisCache redisCache;

    @Resource
    public IConnectionDao iCollectionDao;

    @RequestMapping("/getAllConnection")
    @ResponseBody
    public void getAllConnection() throws IOException {
        List<F_collection> connection = iCollectionDao.getAllCollection();
        String userjson =JSON.toJSONString(connection);

//        System.out.println("呵呵");
//        String userjson = "";
//        List<F_collection> connection = null;
//        String key = "cn.lyf1433223.dao.IConnectionDao.getAllConnection";
//        String data = redisCache.getDataFromRedis(key);
//        System.out.println(data);
//        if(data == null){
//            System.out.println("存入缓存");
//            connection = iCollectionDao.getAllCollection();
//            userjson = JSON.toJSONString(connection);
//            redisCache.setDataToRedis(key, userjson);
//        }else{
//            System.out.println("从缓存中拿");
//            connection = JSON.parseArray(data , F_collection.class);
//            userjson = JSON.toJSONString(connection);
//        }
        ServletRequestAttributes ServletRequestAttributes =
                (ServletRequestAttributes)RequestContextHolder.currentRequestAttributes();
        HttpServletResponse response = ServletRequestAttributes.getResponse();
        PrintWriter out = response.getWriter();
        out.write(userjson);
    }

    @RequestMapping("/stopCollection")
    @ResponseBody
    public void stopCollection(Integer id) throws Exception {
        int i = iCollectionDao.stopCollection(id);
        if(i>0){
            ServletRequestAttributes ServletRequestAttributes =
                    (ServletRequestAttributes)RequestContextHolder.currentRequestAttributes();
            HttpServletResponse response = ServletRequestAttributes.getResponse();
            PrintWriter out = response.getWriter();
            out.write(i+"");
        }
    }

    @RequestMapping("/startCollection")
    @ResponseBody
    public void startCollection(Integer id) throws Exception {
        int i = iCollectionDao.startCollection(id);
        if(i>0){
            ServletRequestAttributes ServletRequestAttributes =
                    (ServletRequestAttributes)RequestContextHolder.currentRequestAttributes();
            HttpServletResponse response = ServletRequestAttributes.getResponse();
            PrintWriter out = response.getWriter();
            out.write(i+"");
        }
    }

    @RequestMapping("/delCollection")
    @ResponseBody
    public void delCollection(Integer id) throws Exception {
        int i = iCollectionDao.delCollection(id);
        System.out.println(i);
        if(i>0){
            ServletRequestAttributes ServletRequestAttributes =
                    (ServletRequestAttributes)RequestContextHolder.currentRequestAttributes();
            HttpServletResponse response = ServletRequestAttributes.getResponse();
            PrintWriter out = response.getWriter();
            out.write(i+"");
        }
    }

}
