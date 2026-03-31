package org.example.com.threadEx.preventThreadMethod.joinEx;
//Here child thread wait for main thread to be executed we will use join() method
class Test01 extends Thread{
    Thread mainThread;
    Test01(Thread mainThread){
        this.mainThread=mainThread;
    }
    public void run(){
        try {
            mainThread.join();
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000);
                System.out.println("Child Thread: "+ i);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
public class JoinExChildWaitForMain {
    public static void main(String[] args) {
        Thread mainThread=Thread.currentThread();
//        System.out.println(mainThread);
        Test01 t=new Test01(mainThread);
            t.start();
        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000);
                System.out.println("Main Thread: "+ i);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

}
