package com.cmcc.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AroundAdviceTest {
    
    @Around(value = "execution(* com.cmcc.service.*.around*(..))")
    public Object process(ProceedingJoinPoint point) throws Throwable {
        System.out.println("模拟执行目标方法前的增强处理：事物开始...");
        //修改目标方法的参数
        String[] params = new String[] {"newParam1"};
        //执行目标方法，并保存目标方法执行后的返回值
        Object returnValue = point.proceed(params);
        System.out.println("模拟执行目标方法后的增强处理：事物结束...");
        //返回修改后的返回值
        return "方法实际返回值：" + returnValue + ", 这是返回值的后缀";
    }
}
