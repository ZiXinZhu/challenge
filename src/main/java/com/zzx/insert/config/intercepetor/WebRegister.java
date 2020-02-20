package com.zzx.insert.config.intercepetor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by:  John Zhu
 * Date: 2018/8/31 17:15
 **/
@Component
public class WebRegister implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration= registry.addInterceptor(new LoginInterceptor());
        registration.addPathPatterns("/**");
//        registration.excludePathPatterns("/user/*");
    }
}