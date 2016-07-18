package com.cmcc.service;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class AdviceManager {
    //这个方法将被BeforeAdviceTest类的permissionCheck匹配到
    public void beforeAdvice() {
        System.out.println("方法: beforeAdviceTest");
    }
    
    //将被AfterReturningAdviceTest的log方法匹配
    public String afterReturning() {
        System.out.println("方法：afterReturning");
        return "afterReturning方法";
    }
    
    //将被AfterThrowingAdviceTest的handleException方法匹配
    public void afterThrowing() {
        System.out.println("方法： afterThrowing");
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("算数异常已被处理");
        }
        
        String s = null;
        System.out.println(s.substring(0, 3));
    }
    
    //将被AfterAdvice的releaseResource方法匹配
    public void afterAdvice() {
        System.out.println("方法：afterAdvice");
    }
    
    //将被AroundAdvice的process方法匹配
    public String aroundAdvice(String param1) {
        System.out.println("方法：aroundAdvice");
        return param1;
    }
    
    //将被AdviceTest的各种方法匹配
    public String manyAdvices(String param1, String param2) {
        System.out.println("方法：manyAdvices");
        return param1 + " 、" + param2;
    }
    
    //将被AccessArgAdviceTest的access方法匹配
    public String accessAdvice(Date d, String n) {
        System.out.println("方法：accessAdvice");
        return "aa";
    }
    
    //PointCut切入点的使用
    public String pointCuteAdvice(String message) {
        System.out.println("被增强方法执行...");
        System.out.println("被增强方法中的形参message = " + message);
        return "被增强方法中的返回值";
    }
}
