package org.example.com.threadEx.preventThreadMethod.threadInterruptEx;
class Abc extends Thread{
    public void run(){
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName()+" - "+i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

public class ThreadInterruptEx {
    public static void main(String[] args) {
        Abc a=new Abc();
        a.start();
        a.interrupt();
    }
}
