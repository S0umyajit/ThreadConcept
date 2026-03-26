package org.example;

//Using Thread class we are trying to create Thread
//Perform single task from single thread
public class TestThread extends Thread {
    public void run(){
        System.out.println("Thread start");
    }
    public static void main(String[] args) {
        TestThread t=new TestThread();
        t.start();
    }

}
