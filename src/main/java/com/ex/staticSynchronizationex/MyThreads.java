package com.ex.staticSynchronizationex;

class MyThread1 extends Thread{

    BookMovieSeat b;
    int seats;

    MyThread1(BookMovieSeat b,int seats){
        this.b=b;
        this.seats=seats;
    }
    public void run(){
        b.bookSeats(seats);
    }
}

class MyThread2 extends Thread{

    BookMovieSeat b;
    int seats;

    MyThread2(BookMovieSeat b,int seats){
        this.b=b;
        this.seats=seats;
    }
    public void run(){
        b.bookSeats(seats);
    }
}

public class MyThreads {
}
