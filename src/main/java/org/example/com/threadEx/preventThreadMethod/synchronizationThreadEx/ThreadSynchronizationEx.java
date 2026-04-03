package org.example.com.threadEx.preventThreadMethod.synchronizationThreadEx;

class BookTheaterSeat{
    int noOfSeat;
    int totalSeats =10;

    //synchronized keyword will make the method as synchronized method
    //now this will work fine if there is multiple thread
    //cause a lock concept is coming here
    //when one thread is using one shared method then thread will aquire lock
    //other thread has to wait until that thread release lock
   synchronized void bookSeat(int noOfSeat){
        if(totalSeats>=noOfSeat){
            System.out.println("Seats Booked Successfully "+noOfSeat);
            totalSeats-=noOfSeat;
            System.out.println("seats left: "+totalSeats);
        }
        else {
            System.out.println("Seats cannot be booked "+noOfSeat);
            System.out.println("Seats Left: "+totalSeats);
        }
    }

}
public class ThreadSynchronizationEx {
}
