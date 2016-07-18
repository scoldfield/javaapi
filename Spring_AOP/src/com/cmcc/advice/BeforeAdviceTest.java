package com.cmcc.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BeforeAdviceTest {
    //匹配com.abc.service下的类中以before开始的方法
    @Before("execution(* com.cmcc.service.*.before*(..))")
    public void permissionCheck() {
        System.out.println("模拟权限检查");
    }
}