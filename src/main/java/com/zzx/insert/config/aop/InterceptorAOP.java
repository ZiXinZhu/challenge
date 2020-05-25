package com.zzx.insert.config.aop;


import com.zzx.insert.annotate.Permission;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class InterceptorAOP {

    @Pointcut("@annotation(com.zzx.insert.annotate.Permission)")
    public void annotationPointcut() {
    }

    @Before("annotationPointcut()")
    public void beforePointcut(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Permission annotation = method.getAnnotation(Permission.class);
        boolean value = annotation.isPass();
        System.out.println("准备" + value);
    }

    @After("annotationPointcut()")
    public void afterPointcut(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Permission annotation = method.getAnnotation(Permission.class);
        boolean value = annotation.isPass();
        System.out.println("结束" + value);
    }

}
