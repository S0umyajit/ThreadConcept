package org.example.com.threadEx.preventThreadMethod.synchronizationThreadEx;

public class MovieBookApp extends Thread {

    // We make 'b' static so that it belongs to the class rather than a specific instance.
// This ensures that all 'MovieBookApp' threads share the EXACT SAME 'BookTheaterSeat' object.
// Because they share one object, they share the same Monitor Lock, which allows the
// 'synchronized' keyword to actually prevent multiple threads from booking the same seats simultaneously.
    static BookTheaterSeat b;
    int seats;
//        MovieBookApp(int seats){
//            this.seats=seats;
//        }

//        public void run(){
//            b.bookSeat(seats);

    public void run() {
        b.bookSeat(seats);
    }

    //        }
    public static void main(String[] args) {
        b=new BookTheaterSeat();
        MovieBookApp user1 = new MovieBookApp();
        user1.start();
        user1.seats = 9;
        MovieBookApp user2 = new MovieBookApp();
        user2.start();
        user2.seats = 5;

    }
}
