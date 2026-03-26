package org.example;

public class ThreadUsingRunnabeInterface implements Runnable{
    int val;
    ThreadUsingRunnabeInterface(int val){
        this.val=val;
    }

    @Override
    public void run() {
        System.out.println("Hello From Thread "+val);
    }

    public static void main(String[] args) {
        ThreadUsingRunnabeInterface th=new ThreadUsingRunnabeInterface(12);
        Thread tr=new Thread(th);
        tr.start();
    }
}
