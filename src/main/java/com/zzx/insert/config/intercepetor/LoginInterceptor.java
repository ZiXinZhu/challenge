package com.zzx.insert.config.intercepetor;


import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
public class LoginInterceptor extends BaseInterceptor {


    @Override
    public boolean runHandler(HttpServletRequest request, HttpServletResponse response) {
        //.....判断是否登陆,判断是否有权限等逻辑代码
        String token = request.getParameter("token");
        //TODO 业务逻辑
        int res = (int) (Math.random() * 2);
        if (res == 1) {
            return true;
        }
        return false;
        //LoggerUtil.DebugLogger.info("LoginInterceptor拿到了值呢："+token);
//		Long userId = (StringUtils.isNotEmpty(token))?CommonUtil.getSuperUserId(token):-1L;
//		if(-1 == userId){
//			return true;
//		}
//		return false;
    }

}
