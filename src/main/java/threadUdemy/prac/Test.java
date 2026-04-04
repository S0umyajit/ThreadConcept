package threadUdemy.prac;
import java.util.List;
import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        // 1. Define some tasks (Runnables)
        Runnable task1 = () -> System.out.println("Task 1 is running in " + Thread.currentThread().getName());
        Runnable task2 = () -> System.out.println("Task 2 is running in " + Thread.currentThread().getName());
        Runnable task3 = () -> {
            for(int i = 0; i < 3; i++) {
                System.out.println("Task 3 iteration " + i);
            }
        };
        Runnable task4=new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };

        // 2. Put them into a List
        List<Runnable> taskList = new ArrayList<>();
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        taskList.add(task4);

        // 3. Initialize MultiExecutor with the list
        MultiExecutor m = new MultiExecutor(taskList);

        // 4. Run them all!
        m.executeAll();
    }
}

class MultiExecutor {

    private final List<Runnable> tasks;

    // Add any necessary member variables here

    /*
     * @param tasks to executed concurrently
     */
   MultiExecutor(List<Runnable> tasks) {
        this.tasks=tasks;
    }

    /**
     * Starts and executes all the tasks concurrently
     */
    public void executeAll() {
        // complete your code here
        List<Thread>threads=new ArrayList<>(tasks.size());

        for(Runnable task:tasks){
            Thread thread=new Thread(task);
            threads.add(thread);
        }
        for(Thread thread:threads){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            thread.start();
        }
    }
}
