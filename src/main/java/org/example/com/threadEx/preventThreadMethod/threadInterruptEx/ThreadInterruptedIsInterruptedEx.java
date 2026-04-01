package org.example.com.threadEx.preventThreadMethod.threadInterruptEx;

class Abcd extends Thread{
    public void run(){
//        System.out.println(Thread.interrupted());
        Thread.currentThread().interrupt(); //true
        System.out.println(Thread.interrupted()); //false, as thread was already interrupted value will change from true to false
        System.out.println(Thread.currentThread().isInterrupted());
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class ThreadInterruptedIsInterruptedEx {
    public static void main(String[] args) {
        Abcd a=new Abcd();
        a.start();
//        a.interrupt();
    }
}
