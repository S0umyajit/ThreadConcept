package com.example;

class YiledPrac extends Thread{

    public void run(){
        Thread.currentThread().setPriority(6);
        System.out.println("Child Thread Priority: "+Thread.currentThread().getPriority());
        for(int i=1;i<=5;i++) {
            try {
                Thread.sleep(1000);
                System.out.println("child: "+i);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class ThreadYieldAnotherPrac {
    public static void main(String[] args) {
        System.out.println("main thread priority: "+Thread.currentThread().getPriority());
        YiledPrac y=new YiledPrac();
        y.start();
        try{
            Thread.yield();
        for(int i=1;i<=5;i++) {
            System.out.println("main: "+ i);
            Thread.sleep(1000);
        }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
