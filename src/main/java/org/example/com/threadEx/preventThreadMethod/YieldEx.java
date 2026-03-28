package org.example.com.threadEx.preventThreadMethod;
class Test3 extends Thread{

    public void run(){
        for(int i=1;i<=5;i++){
            Thread.yield();
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}
//yield() will stop current running thread and other thread will get priortiy to execute
public class YieldEx {

    public static void main(String[] args) {

        Test3 t=new Test3();
        t.start();

        for (int i=1;i<=5;i++){
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}
