package com.zyp.service;

import com.zyp.entity.PhoneAuthoCode;

/**
 * create by
 *
 * @author zouyuanpeng
 * @date 2020/10/17 14:02
 */
public interface PhoneAuthoCodeService {
    /**
     * 通过手机号码查询使用人的信息
     * @param phone 手机号
     * @return 结果
     */
    PhoneAuthoCode selectByPhone(String phone);

    /**
     * 验证码是否正确
     * @param phone 手机号
     * @param authCode 验证码
     * @return 结果
     */
    boolean checkAuthCode(String phone,String authCode);
}
