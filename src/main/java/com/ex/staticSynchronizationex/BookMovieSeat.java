package com.ex.staticSynchronizationex;

public class BookMovieSeat {

    static int totalNoOfSeats=20;

   public static synchronized void bookSeats(int seats){
        if(totalNoOfSeats>=seats){
            totalNoOfSeats-=seats;
            System.out.println(seats+" seats booked successfully");
            System.out.println(totalNoOfSeats+" seats left");
        }
        else {
            System.out.println(totalNoOfSeats+ " seats left");
            System.out.println(seats+" seats can not be booked");
        }
    }
}
