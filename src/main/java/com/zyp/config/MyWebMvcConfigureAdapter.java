package com.zyp.config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * create by
 *
 * @author zouyuanpeng
 * @date 2020/10/17 14:32
 */
public class MyWebMvcConfigureAdapter extends WebMvcConfigurationSupport {
    /**
     * 配置静态访问资源不拦截
     * @param registry
     */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        super.addResourceHandlers(registry);
    }
}
