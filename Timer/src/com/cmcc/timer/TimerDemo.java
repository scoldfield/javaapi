package com.cmcc.timer;

import java.util.Timer;
import java.util.TimerTask;

//��ʱ��Timer���÷���
//ע�⣺Timer��ʱ����ʹ�ñ�����Ҫ������main����Ϊ������������main���п�ʼ��ʱ��
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
