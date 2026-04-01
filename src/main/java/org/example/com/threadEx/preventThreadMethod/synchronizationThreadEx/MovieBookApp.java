package org.example.com.threadEx.preventThreadMethod.synchronizationThreadEx;

public class MovieBookApp extends Thread{
        int seats;
        MovieBookApp(int seats){
            this.seats=seats;
        }
        static BookTheaterSeat b;
        public void run(){
            b.bookSeat(seats);
        }
    public static void main(String[] args) {
            b=new BookTheaterSeat();
            MovieBookApp user1=new MovieBookApp(7);
//            user1.seats=9;
            user1.start();
            MovieBookApp user2=new MovieBookApp(6);
//            user2.seats=5;
            user2.start();

    }
}
