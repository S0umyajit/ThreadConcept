package org.example;

public class ThreadUsingRunnabeInterface implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello From Thread");
    }

    public static void main(String[] args) {
        ThreadUsingRunnabeInterface th=new ThreadUsingRunnabeInterface();
        Thread tr=new Thread(th);
        tr.start();
    }
}
