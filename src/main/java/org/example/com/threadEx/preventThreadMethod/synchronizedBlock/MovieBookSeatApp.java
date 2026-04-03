package org.example.com.threadEx.preventThreadMethod.synchronizedBlock;

public class MovieBookSeatApp extends Thread{
    static BookMovieSeat b;
    int seats;
    public void run(){
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
       b=new BookMovieSeat();
        MovieBookSeatApp user1=new MovieBookSeatApp();
       user1.seats=6;
       user1.start();
        MovieBookSeatApp user2=new MovieBookSeatApp();
       user2.seats=9;
       user2.start();
    }
}
