package com.cmcc.thread;

//���̵߳�ʵ�����������߳�
public class MultiThread {

    public static void main(String[] args) {

        System.out.println("++++++++���߳̿���++++++++");

        /*
         * ����һ��
         * 
         * 0��ͨ��Thread��Ĺ��캯��Thread()����ʵ��
         * 1���Զ�����̳�Thread��
         * 2��ʵ��Thread���е�run()�������������߳�Ҫ���еĲ�������run()������ʵ��
         * 3�������̡߳�start()������start()������ִ��run()�����е����в���
         * 
         * ��Java��˵��run()����û���κ��ر�֮������main()����һ������ֻ�����߳�֪��
         * ���õķ�������(��ǩ��)����ˣ���Runnable�ϻ���Thread�ϵ���run�����ǺϷ��ġ� �����������µ��̡߳�
         * 
         * Thread thread1 = new Thread() { public void run() {
         * System.out.println("---------���߳̿���1---------");
         * 
         * for(int i = 0; i < 5; i++) { System.out.println("subThread1:" + i); }
         * } };
         * 
         * Thread thread2 = new Thread() { public void run() {
         * System.out.println("---------���߳̿���2---------");
         * 
         * for(int i = 0; i < 5; i++) { System.out.println("subThread2:" + i); }
         * } };
         * 
         */

        /*
         * ������
         * 
         * 0��ͨ��Thread��Ĺ��캯��Thread(Runnable target)����ʵ��
         * 1���Զ�����̳�Thread(Runnable target)��
         * 2��ʵ��Runnable�ӿ��е�run()�������������߳�Ҫ���еĲ�������run()������ʵ��
         * 3�������̡߳�start()������start()������ִ��run()�����е����в���
         */

        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("---------���߳̿���1---------");

                for (int i = 0; i < 5; i++) {
                    System.out.println("subThread1:" + i);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("---------���߳̿���2---------");

                for (int i = 0; i < 5; i++) {
                    System.out.println("subThread2:" + i);
                }
            }
        });
        
        thread1.start(); 
        thread2.start();
    }
}
