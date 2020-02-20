package com.example.demo03.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//@Configuration
public class MyMvcCfg extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
    // super.addViewControllers(registry);
    //浏览器发送 /atguigu 请求来到 success
        registry.addViewController("/hjy").setViewName("success");
    }
}
