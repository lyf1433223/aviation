package cn.lyf1433223.redis;

import org.springframework.stereotype.Repository;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;

@Repository("redisCache")
public class RedisCache {

    //可用注解
    //引用jedis池（里面装有jedis对象）
    @Resource
    private JedisPool jedisPool;

    //公开set/get方法
    public JedisPool getJedisPool() {
        return jedisPool;
    }
    public void setJedisPool(JedisPool jedisPool) {
        this.jedisPool = jedisPool;
    }

    //设置数据到redis
    public void setDataToRedis(String key, String value){
        //先获得池中的jedis对象
        Jedis jedis = jedisPool.getResource();
        //再进行jedis操作
        jedis.set(key, value);
    }

    //获取redis中的数据
    public String getDataFromRedis(String key){
        Jedis jedis = jedisPool.getResource();
        return jedis.get(key);
    }
}
