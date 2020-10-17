package com.zyp.entity;

/**
 * create by
 *
 * @author zouyuanpeng
 * @date 2020/10/17 13:50
 */
public class PhoneAuthoCode {
    /** 用户编号 */
    private Integer pid;
    /** 用户姓名 */
    private String name;
    /** 用户手机号 */
    private String phone;
    /** 验证码 */
    private String authCode;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    @Override
    public String toString() {
        return "PhoneAuthoCode{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", authCode='" + authCode + '\'' +
                '}';
    }
}
