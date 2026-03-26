package org.example;
//Multi Thread executing multiple task
class Task1 extends Thread{
    public void run(){
        System.out.println("Video play");
    }
}

class Task2 extends Thread{
    public void run(){
        System.out.println("Music Play");
    }
}
class Task3 extends Thread{
    public void run(){
        System.out.println("Timer");
    }
}
class Task4 extends Thread{
    public void run(){
        System.out.println("Progress Bar");
    }
}
public class MultiTaskMultiThread {

    public static void main(String[] args) {

        Task1 t1=new Task1();
        t1.start();

        Task2 t2=new Task2();
        t2.start();

        Task3 t3=new Task3();
        t3.start();

        Task4 t4=new Task4();
        t4.start();
    }

}
