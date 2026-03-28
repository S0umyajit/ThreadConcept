package org.example.com.threadEx.preventThreadMethod;
public class TestThread {

    public static void main(String[] args) throws InterruptedException{
        for(int i=1;i<=20;i++){
            Thread.sleep(1000);
            System.out.println(i);
        }
    }
}
