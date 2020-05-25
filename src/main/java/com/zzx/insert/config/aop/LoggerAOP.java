package com.zzx.insert.config.aop;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;


@Slf4j
@Aspect
@Component
public class LoggerAOP {

    @Pointcut("execution(public * com.zzx.insert.controller.InsertController.*())")
    public void verify() {
    }

    @Before("verify()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        JSONObject jsonObject = new JSONObject();
        // 获取请求的url
        jsonObject.put("url", request.getRequestURL());
        // 获取请求的方式
        jsonObject.put("method", request.getMethod());
        // 获取请求的ip地址
        jsonObject.put("ip", request.getRemoteAddr());
        // 获取类名
        jsonObject.put("className", joinPoint.getSignature().getDeclaringTypeName());
        // 获取类方法
        jsonObject.put("classMethod", joinPoint.getSignature().getName());
        // 请求参数
        jsonObject.put("args", joinPoint.getArgs());
        log.info("request: {}", jsonObject);
    }

    @Around("verify()")
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) {
        try {
            Object obj = proceedingJoinPoint.proceed();
            log.info("方法环绕结果 : {}" + obj);
            return obj;
        } catch (Throwable e) {
            log.info("Throwable ...");
            return null;
        }
    }

    @After("verify()")
    public void doAfter() {
        log.info("doAfter!");
    }

    /**
     * 获取响应返回值
     *
     * @param obj
     */
    @AfterReturning(returning = "obj", pointcut = "verify()")
    public void doAfterReturning(Object obj) {
        log.info("response: {}", obj.toString());
    }

    /**
     * 获取异常
     */
    @AfterThrowing(pointcut = "verify()")
    public void doAfterThrowing() {
        log.error("doAfterThrowing: {}", " 异常情况！！！！");
    }


}
