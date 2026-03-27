package org.example;
class MyTest extends Thread{
    public void run(){
        //Setting Thread Name
        Thread.currentThread().setName("MyTestThread");
        System.out.println(Thread.currentThread().getName());
        System.out.println("Hello");
    }
}

//This is for thread naming method example
public class ThreadNameEx {
    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName());
//        Thread.currentThread().setName("Soumya"); //set the thread name to Soumya
//        System.out.println(Thread.currentThread().getName());
//        int ans=10/0;
//        System.out.println(ans);
        MyTest mt=new MyTest();
        mt.setName("Mytttt");
        mt.start();
        System.out.println(mt.getName());
//        System.out.println(Thread.currentThread().getName());
    }
}
