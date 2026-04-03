package com.ex.staticSynchronizationex;

public class BookMyMovie {

    public static void main(String[] args) {

        BookMovieSeat b1=new BookMovieSeat();

        MyThread1 t1=new MyThread1(b1,10);
        t1.start();
        MyThread1 t2=new MyThread1(b1,6);
        t2.start();
        BookMovieSeat b2=new BookMovieSeat();
        MyThread2 t3=new MyThread2(b2,9);
        t3.start();
        MyThread2 t4=new MyThread2(b2,3);
        t4.start();
    }
}
