package com.zzx.insert.rmi;

import com.zzx.insert.rmi.Irim.IService;
import com.zzx.insert.rmi.Irim.IServiceImp;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;

public class RMIService {
    public static void main(String[] args) {
        try {
            // 实例化实现了IService接口的远程服务ServiceImpl对象
            IService serviceLime = new IServiceImp("serviceLime");
            // Context接口表示一个命名上下文，它由一组名称到对象的绑定组成。 它包含检查和更新这些绑定的一些方法。
            // InitialContext类是执行命名操作的初始上下文。 该初始上下文实现 Context 接口并提供解析名称的起始点
            // 初始化命名空间
            Context namingContext = new InitialContext();
            // 将名称绑定到对象,即向命名空间注册已经实例化的远程服务对象
            namingContext.rebind("rmi://192.168.1.5:6666/serviceLime", serviceLime);
            System.out.println("服务器向命名表注册了1个远程服务对象！ -- " + serviceLime.getClass().getSimpleName());
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NamingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
