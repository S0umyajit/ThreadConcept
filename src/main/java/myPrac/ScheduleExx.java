package myPrac;

import java.sql.Time;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleExx {

    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService scheduledExecutorService= Executors.newScheduledThreadPool(2);


        scheduledExecutorService.scheduleAtFixedRate(()->{
            System.out.println(Thread.currentThread().getName()+" Hello");
        },5,2, TimeUnit.SECONDS);

        Thread.sleep(15000);
        System.out.println("shutting down: ");
        scheduledExecutorService.shutdownNow();
    }
}
