package org.example.org.daemonThread;
class TestMy extends Thread{

    public void run(){
        System.out.println("Child thread Priority: "+Thread.currentThread().getPriority());
        System.out.println("Child thread");
    }
}

public class ThreadPriorityEx {
    public static void main(String[] args) {
        System.out.println("Main thread Priority Before: "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println("Main thread Priority After: "+Thread.currentThread().getPriority());
        TestMy tm=new TestMy();
        tm.start();
    }
}
