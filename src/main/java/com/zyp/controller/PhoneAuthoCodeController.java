package com.zyp.controller;

import com.zyp.entity.PhoneAuthoCode;
import com.zyp.service.PhoneAuthoCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * create by
 *
 * @author zouyuanpeng
 * @date 2020/10/17 14:08
 */
@Controller
@RequestMapping("/person")
public class PhoneAuthoCodeController {
    @Autowired
    private PhoneAuthoCodeService phoneAuthoCodeService;

    @GetMapping("/phone")
    public String phone(){
        return "phone";
    }

    @PostMapping("/selectByPhone")
    @ResponseBody
    public PhoneAuthoCode selectByPhonePost(String phone){
        PhoneAuthoCode person = phoneAuthoCodeService.selectByPhone(phone);
        return person;
    }

    @GetMapping("/selectByPhone")
    @ResponseBody
    public PhoneAuthoCode selectByPhoneGet(String phone){
        PhoneAuthoCode person = phoneAuthoCodeService.selectByPhone(phone);
        return person;
    }
    @GetMapping("/checkAuthCode")
    @ResponseBody
    public String checkAuthCode(String phone,String authCode){
        boolean checkAuthCode = phoneAuthoCodeService.checkAuthCode(phone, authCode);
        if (checkAuthCode){
            return "验证码正确";
        }
        return "验证码错误或手机号有误";
    }
}
