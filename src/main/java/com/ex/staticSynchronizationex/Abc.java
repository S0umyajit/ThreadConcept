package com.ex.staticSynchronizationex;

public class Abc {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am in: "+Thread.currentThread().getName());
                System.out.println("Child: "+Thread.currentThread().getPriority());
            }
        });
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        System.out.println(Thread.currentThread().getName());
    }
}
