package myPrac;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SubmitEx2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor=Executors.newFixedThreadPool(2);
        List<Future<Integer>>futures=new ArrayList<>();
        for(int i=1;i<=10;i++){
            int taskId=i;
                futures.add(executor.submit(()->{
                    String threadName=Thread.currentThread().getName();
                    Thread.sleep(2000);
                    System.out.println(threadName+" "+taskId);
                    return taskId;
                }));
            }
           for(Future<Integer> future:futures) {
              future.get();
           }

           executor.shutdown();
        }
    }
