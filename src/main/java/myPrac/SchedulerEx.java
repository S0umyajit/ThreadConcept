package myPrac;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulerEx {
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService scheduler=Executors.newScheduledThreadPool(2);
        scheduler.schedule(()->{
            System.out.println(Thread.currentThread().getName()+" Hello");
        },2,TimeUnit.SECONDS);

        Thread.sleep(5000);
        System.out.println("Shutting down");
        scheduler.shutdownNow();
    }
}
