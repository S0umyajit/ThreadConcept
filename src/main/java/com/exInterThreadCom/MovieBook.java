package com.exInterThreadCom;

public class MovieBook {
    public static void main(String[] args) throws InterruptedException {
        TotalEarnings t1=new TotalEarnings();
        t1.start();
//        t1.join();
        synchronized (t1) {
            t1.wait();
        }
        System.out.println("total: "+t1.total);
    }
}
