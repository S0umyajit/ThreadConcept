package org.example.com.threadEx.preventThreadMethod.synchronizedBlock;

public class BookMovieSeat {

    int total_seats=12;
    int seats;
     public void bookSeat(int seats){
        System.out.println("hi: "+Thread.currentThread().getName());
        System.out.println("hi: "+Thread.currentThread().getName());
        System.out.println("hi: "+Thread.currentThread().getName());
        System.out.println("hi: "+Thread.currentThread().getName());
        System.out.println("hi: "+Thread.currentThread().getName());
        System.out.println("hi: "+Thread.currentThread().getName());
        //Synchronized block example
        synchronized (this) //passing object reference
        {
            if (total_seats >= seats) {
                total_seats -= seats;
                System.out.println("Seats booked successfully: " + seats);
            } else {
                System.out.println("You can't book seats");
            }
        }
        System.out.println("Seats Left: "+total_seats);
        System.out.println("hi2: "+Thread.currentThread().getName());
        System.out.println("hi2: "+Thread.currentThread().getName());
        System.out.println("hi2: "+Thread.currentThread().getName());
        System.out.println("hi2: "+Thread.currentThread().getName());
    }
}
