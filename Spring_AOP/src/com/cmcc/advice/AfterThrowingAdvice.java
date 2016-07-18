package com.cmcc.advice;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterThrowingAdvice {

    @AfterThrowing(pointcut = "execution(* com.cmcc.service.*.afterThrowing(..))", throwing = "ex")
    public void handleException(Throwable ex) {
        System.out.println("目标方法抛出异常：" + ex);
        System.out.println("模拟异常处理...");
    }
}
