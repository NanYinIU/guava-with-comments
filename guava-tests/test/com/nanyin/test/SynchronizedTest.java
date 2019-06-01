package com.nanyin.test;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.Buffer;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class SynchronizedTest {

    //synchronized的三种用法
    //1.修饰实例方法 需要拥有实例对象的锁
    public synchronized void hello(){
        System.out.println("hello");
    }
    //2.修饰静态方法 需要拥有类对象的锁
    public synchronized static void staticHello(){
       System.out.println("staticHello");
    }

    public void blockHello(){
        //3.修饰代码块 需要拥有【this】的锁
        synchronized(this){
            System.out.println("code block hello");
        }
    }

    @Test
    public void integerTest(){
//        Integer i = new Integer(129);
//        Integer i2 = new Integer(129);
//        Assert.assertTrue(i == i2);

//        Integer x = new Integer(12024);
//        Integer x1 = new Integer(12);
//        Assert.assertTrue(x == 12024);

        String s = "h";
        String s1 = new String("h");
        Assert.assertTrue(s==s1);
//        ThreadPoolExecutor threadPoolExecutor
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor();
        ExecutorService service = Executors.newFixedThreadPool(10);

    }

    @Test
    public void threadPoolTest(){
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 30; i++) {
           Runnable task = () ->{
               String name = Thread.currentThread().getName();
               System.out.println(name);
           };
            executorService.submit(task);

        }

    }

    @Test
    public void ioTest(){


    }
   @Test
    public void ioTest2(){
        new Thread(() -> {
            try {
                Socket socket = new Socket("127.0.0.1", 8000);
                while (true) {
                    try {
                        socket.getOutputStream().write((new Date() + ": hello world").getBytes());
                        socket.getOutputStream().flush();
                        Thread.sleep(2000);
                    } catch (Exception e) {
                    }
                }
            } catch (IOException e) {
            }
        }).start();
       try{
          Socket  socket = new Socket("127.0.0.1",8000);
           byte[] data = new byte[1024];
           InputStream inputStream = socket.getInputStream();
           while (true){
               int len ;
               while ((len = inputStream.read())!=-1){
                   System.out.println(new String(data,0,len));
               }
           }
       }catch (Exception e){
           e.printStackTrace();
       }
    }

}