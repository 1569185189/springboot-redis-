package com.zyp.springboot_redis;

import com.zyp.utils.RedisUtil;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootRedisApplicationTests {
    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    void contextLoads() {
        redisUtil.set("user","zyp");
        String user = (String) redisUtil.get("user");
        System.out.println("测试Redis连接："+user);
    }
    @Test
    void test(){
        redisTemplate.opsForValue().set("test","作品");
        redisTemplate.opsForValue().get("test");
    }
}
