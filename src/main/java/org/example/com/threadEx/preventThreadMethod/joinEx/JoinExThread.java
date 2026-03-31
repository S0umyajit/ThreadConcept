package org.example.com.threadEx.preventThreadMethod.joinEx;
//Here I am providing the difference between sleep vs join
/*Output if we use sleep()
child thread: 1
Main Thread 1
child thread: 2
Main Thread 2
child thread: 3
Main Thread 3
child thread: 4
Main Thread 4
Main Thread 5
child thread: 5
 */
class ThreadTest extends Thread{
    public void run(){
        try{
        for(int i=1;i<=5;i++) {
            Thread.sleep(1000);
            System.out.println("child thread: " + i);
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
public class JoinExThread {
    public static void main(String[] args) throws InterruptedException {
        ThreadTest t=new ThreadTest();

        t.start();
        t.join(); // join() should be placed inside the Thread which is waitting
                        // using the reference of the Thread for which other one is waiting
        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000);
                System.out.println("Main Thread "+i);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
