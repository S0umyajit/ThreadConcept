package myPrac;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameTest {
    public static void main(String[] args) {

        ExecutorService executor= Executors.newFixedThreadPool(2);

        for(int i=1;i<=5;i++) {
            int taskId = i;
            executor.execute(() -> {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("task: " + taskId + " is performed by " + Thread.currentThread().getName());
            });
        }
            executor.shutdown();
    }
}
