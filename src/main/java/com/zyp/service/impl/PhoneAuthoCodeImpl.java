package com.zyp.service.impl;

import com.zyp.entity.PhoneAuthoCode;
import com.zyp.mapper.PhoneAuthoCodeMapper;
import com.zyp.service.PhoneAuthoCodeService;
import com.zyp.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * create by
 *
 * @author zouyuanpeng
 * @date 2020/10/17 14:03
 */
@Service
public class PhoneAuthoCodeImpl implements PhoneAuthoCodeService {
    @Autowired
    private PhoneAuthoCodeMapper personMapper;
    @Autowired
    private RedisUtil redisUtil;
    @Override
    public PhoneAuthoCode selectByPhone(String phone) {
        PhoneAuthoCode person = personMapper.selectByPhone(phone);
        Random random = new Random();
        //生成验证码
        String authCode = String.valueOf(random.nextInt(9000)+1000);
        //将生成的验证码放入redis中，并设置30秒的过期时间
        //key为authCode+手机号
        redisUtil.set("authCode"+phone,authCode);
        redisUtil.expire("authCode"+phone,10);
        //设置验证码、返回给前端
        person.setAuthCode(authCode);
        return person;
    }

    @Override
    public boolean checkAuthCode(String phone, String authCode) {
        //与redsi中的手机号验证码进行对比
        String authCodeFromRedis = (String) redisUtil.get("authCode"+phone);
        if(authCode!=null&&authCode.equals(authCodeFromRedis)){
            return true;
        }
        return false;
    }
}
