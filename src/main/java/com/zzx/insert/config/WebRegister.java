package com.zzx.insert.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class WebRegister implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册拦截器
        InterceptorRegistration registration=registry.addInterceptor(new MyInterceptor());
//        需要拦截的路径
        registration.addPathPatterns("/**");
//        不需要拦截的路径
//      registration.excludePathPatterns("/user/*");
    }

}
