package cn.lyf1433223.util;


import org.springframework.stereotype.Repository;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;

@Repository("jedisutil")
public class JedisUtil {

    @Resource
    private JedisPool jedisPool;


    public Jedis GetJedis(){
        return jedisPool.getResource();
    }
    
}
