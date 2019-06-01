package com.nanyin.test;

import java.util.concurrent.Callable;

public class MyThread extends Thread {
    int time;
    @Override
    public void run() {
        time++;
        System.out.println(this.getName()+":num="+time);
    }

    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
        thread.setName("thread-1");
        MyThread.MyThread2 thread2 = new MyThread().new MyThread2();
        thread2.run();
        try {
            MyThread.MyThread3 thread3 = new MyThread().new MyThread3();
            System.out.println(thread3.call());
        } catch (Exception el) {
            el.printStackTrace();
        }


    }
    class MyThread2 implements Runnable{
        //第二种创建线程的方式
        @Override
        public void run() {

        }
    }

    class MyThread3 implements Callable<Integer>{
        //第三种创建线程的方式，与2不同的是这种方式创建的线程是有返回值的
        @Override
        public Integer call() throws Exception {
            return 1;
        }
    }
}
