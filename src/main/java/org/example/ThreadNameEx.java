package org.example;

//This is for thread naming method example
public class ThreadNameEx {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Soumya"); //set the thread name to Soumya
        System.out.println(Thread.currentThread().getName());
        int ans=10/0;
        System.out.println(ans);
    }
}
