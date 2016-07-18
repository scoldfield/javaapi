package com.cmcc.main;


import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cmcc.advice.AfterReturningAdviceTest;
import com.cmcc.service.AdviceManager;

@SuppressWarnings("resource")
public class AOPTest {
    
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AdviceManager adviceManager = context.getBean(AdviceManager.class);
        
        /*
         * 测试AOP中的before
            adviceManager.beforeAdvice();
         */
        
        /*
         * 测试AOP中的afterReturning
            String returning = adviceManager.afterReturning();
         */
        
        /*
         * 测试AOP中的afterThrowing
            adviceManager.afterThrowing();
         */
        
        /*
         * 测试AOP中的After
         * After增强处理，它与AfterReturning优点类似，但也有区别：
         *  1、AfterReturning增强处理只有在目标方法正确完成后才会被织入；
         *  2、After增强处理不管目标方法如何结束（正确还是异常），它都会被织入
            adviceManager.afterAdvice();
         */
        
        /*
         * 测试AOP中的around
            String result = adviceManager.aroundAdvice("param1");
            System.out.println("返回值：" + result);
         */
        
        /*
         * 测试 AOP中的所有的方法
            String result = adviceManager.manyAdvices("aa", "bb");
            System.out.println("Test方法中调用切点方法的返回值：" + result);
         */
        
        /*
         * 新的方法"获取"并"修改"目标方法的参数
            adviceManager.accessAdvice(new Date(), "test");
         */
        
        String result = adviceManager.pointCuteAdvice("呵呵");
        System.out.println(result);
    }
}