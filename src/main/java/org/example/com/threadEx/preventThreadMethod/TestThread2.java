package org.example.com.threadEx.preventThreadMethod;
class Test extends Thread{
    public void run(){
        Thread.currentThread().setName("Soumya");
        for(int i=1;i<=10;i++){
            try {
                Thread.sleep(1000);
                System.out.println(i);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println(Thread.currentThread().getName());
    }
}
public class TestThread2 {
    public static void main(String[] args) {
        Test t =new Test();
        t.start();
    }
}
