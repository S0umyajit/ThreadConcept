package com.ex.staticSynchronizationex;

public class Abc {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am in: "+Thread.currentThread().getName());
                System.out.println("Child: "+Thread.currentThread().getPriority());
                System.out.println(Thread.currentThread().getName());
                throw new RuntimeException("Intentational Exception");
            }
        });
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.setName("MyThread");
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("A error happened in thread: "+t.getName()
                                                    +"and error message is: "+e.getMessage());
            }
        });
        thread.start();
        System.out.println(Thread.currentThread().getName());
    }
}
