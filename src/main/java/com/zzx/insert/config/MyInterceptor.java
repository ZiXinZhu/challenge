package com.zzx.insert.config;


import com.zzx.insert.annotate.Permission;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Component
public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(handler.getClass().isAssignableFrom(HandlerMethod.class)){
            HandlerMethod method=(HandlerMethod)handler;
            Permission permission=method.getMethodAnnotation(Permission.class);
            if((permission==null)||(permission.isPass())){
                return true;
            }else {
                response.sendRedirect("http://localhost:8088/login.html");
                return false;
            }
        }

        return true;
    }
}
