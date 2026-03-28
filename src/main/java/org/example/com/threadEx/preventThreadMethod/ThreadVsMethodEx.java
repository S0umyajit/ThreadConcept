package org.example.com.threadEx.preventThreadMethod;

class Abc extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try {
                Thread.sleep(1000);
                System.out.println(i+" "+Thread.currentThread().getName());
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class ThreadVsMethodEx {
    public static void main(String[] args) {

        //if we use run method, then it is not a thread, it is method then and it will run separately
        /* Output
        1 main
        2 main
        3 main
        4 main
        5 main
        1 main
        2 main
        3 main
        4 main
        5 main
        */

        //if we use start, then it becomes thread, multi thread will run togetherly
        /*
        1 Thread-1
1 Thread-0
2 Thread-0
2 Thread-1
3 Thread-1
3 Thread-0
4 Thread-1
4 Thread-0
5 Thread-1
5 Thread-0
         */
        Abc a=new Abc();
//        a.run();
        a.start();
        Abc b=new Abc();
//        b.run();
        b.start();
    }
}
