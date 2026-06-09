package myPrac;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SubmitEx {
    public static void main(String[] args) {

        ExecutorService executor= Executors.newFixedThreadPool(2);

        Future<Integer> f1 = executor.submit(() -> {
            Thread.sleep(3000);
            return 10;
        });

        try {
            System.out.println(f1.get());
        }catch(Exception e){
            e.getMessage();
        }
        executor.shutdown();

        System.out.println("hello");

    }
}
