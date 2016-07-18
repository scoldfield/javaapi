package com.cmcc.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterReturningAdviceTest {

    @AfterReturning(pointcut = "execution(* com.cmcc.service.*.afterReturning(..))", returning = "returnValue")
    public void log(Object returnValue) {
        System.out.println("目标方法返回值：" + returnValue);
        System.out.println("模拟日志记录功能...");      //修改为具体的日志处理方法
    }
}
