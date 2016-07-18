package com.cmcc.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointCutAdviceTest {

    @Pointcut("execution(* com.cmcc.service.*.pointCute*(..))")
    public void myPointCut() {}
    
    @AfterReturning(pointcut = "myPointCut() && args(message)", returning = "returnValue")
    public void log(String message, Object returnValue) {
        message = message + "嘿嘿";
        returnValue = returnValue + "哈哈";
        System.out.println("增强方法执行");
        System.out.println("增强方法中的message = " + message + ", returnValue = " + returnValue);
    }
}
