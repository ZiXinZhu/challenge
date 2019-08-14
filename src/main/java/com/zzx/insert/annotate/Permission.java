package com.zzx.insert.annotate;


import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented()
public @interface Permission {
    boolean isPass() default false;
}
