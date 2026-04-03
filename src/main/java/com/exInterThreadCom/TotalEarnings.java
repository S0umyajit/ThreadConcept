package com.exInterThreadCom;

public class TotalEarnings extends Thread{

    int total=0;

    public void run(){
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                total += 100;
            }
            this.notify();
        }

    }
}
