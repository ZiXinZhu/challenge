package com.zzx.insert.rmi.Irim;

import java.rmi.RemoteException;

public class IServiceImp implements IService{

    private static final long serialVersionUID = 1L;

    private String name;

    public IServiceImp(String name) throws RemoteException {
        this.name = name;
    }

    public String service(String context) throws RemoteException {
        return "server >> " + context;
    }
}
