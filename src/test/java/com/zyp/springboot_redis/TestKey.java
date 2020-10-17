package com.zyp.springboot_redis;


import redis.clients.jedis.Jedis;

/**
 * create by
 *
 * @author zouyuanpeng
 * @date 2020/10/5 8:12
 */
public class TestKey {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        System.out.println("清空数据：" + jedis.flushDB());
        System.out.println("判断某个键是否存在：" + jedis.exists("username"));
        System.out.println("新增<'username','zyp'>的键值对：" + jedis.set("username", "zyp"));
        System.out.println("新增<'password','password'>的键值对：" + jedis.set("password", "password"));
    }
}
