package com.zzx.insert.rmi;

import com.zzx.insert.rmi.Irim.IService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;

@RestController
public class RMIClient {

    @GetMapping("/sends")
    public void send() {
        String url = "rmi://123.207.231.159:6666/";
        try {
            Context namingContext = new InitialContext();
            // 检索指定的对象。 即找到服务器端相对应的服务对象存根
            IService serviceLime = (IService) namingContext.lookup(url + "serviceLime");
            Class<? extends IService> serviceLimeClazz = serviceLime.getClass();
            System.out.println(serviceLime + " 是 " + serviceLimeClazz.getName() + " 的实例。 ");
            Class<?>[] interfaces = serviceLimeClazz.getInterfaces();
            for (Class inter : interfaces) {
                System.out.println("存根类实现了 " + inter.getName() + " 接口！");
            }
            System.out.println(serviceLime.service("你好！"));
        } catch (NamingException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
