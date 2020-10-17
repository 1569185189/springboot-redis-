package com.zyp.mapper;

import com.zyp.entity.PhoneAuthoCode;
import org.springframework.stereotype.Repository;

/**
 * create by
 *
 * @author zouyuanpeng
 * @date 2020/10/17 13:57
 */
@Repository
public interface PhoneAuthoCodeMapper {
    /**
     * 通过手机号码查询使用人的信息
     * @param phone 手机号
     * @return 结果
     */
    PhoneAuthoCode selectByPhone(String phone);
}
