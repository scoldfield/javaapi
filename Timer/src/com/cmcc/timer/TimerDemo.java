package com.cmcc.timer;

import java.util.Timer;
import java.util.TimerTask;

//定时器Timer的用法。
//注意：Timer定时器的使用必须需要主函数main，因为它是以主函数main运行开始计时的
public class TimerDemo {
    
    public static void testTimer(int seconds) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            
            @Override
            public void run() {
                System.out.println("timerTask is run!");
            }
        }, 0, 1000*seconds);
    }

    public static void main(String[] args) {
        testTimer(2);
    }
}
