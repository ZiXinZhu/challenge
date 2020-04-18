package com.zzx.insert.parent;

import org.springframework.stereotype.Component;

@Component
public abstract class AbstractCore implements Split, Load, Execute{


    @Override
    public String execute() {
        return executer();
    }

    @Override
    public String load() {
        return "公共参数";
    }

    @Override
    public String split() {
        return spliter();
    }

    abstract String spliter();

    abstract String executer();

    public String enter(String code){
        if("execute".equals(code)){
            return execute();
        }else if("split".equals(code)){
            return split();
        }else {
            return load();
        }
    }
}
