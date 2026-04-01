package org.example.com.threadEx.preventThreadMethod.synchronizationThreadEx;

class BookTheaterSeat{
    int totalSeats =10;

    void bookSeat(int seats){
        if(totalSeats>=seats){
            System.out.println("Seats Booked Successfully "+seats);
            totalSeats-=seats;
            System.out.println("seats left: "+totalSeats);
        }
        else {
            System.out.println("Seats cannot be booked "+seats);
            System.out.println("Seats Left: "+totalSeats);
        }
    }

}
public class ThreadSynchronizationEx {
}
