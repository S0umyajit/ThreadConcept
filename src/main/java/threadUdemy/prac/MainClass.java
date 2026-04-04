package threadUdemy.prac;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainClass {
    private static final int MAX_PASSWORD=9999;
    public static void main(String[] args) {

        Random random=new Random();
        Vault vault=new Vault(random.nextInt(MAX_PASSWORD));
        System.out.println("RealPassword: "+vault.password);
        List<Thread> threads=new ArrayList<>();
        threads.add(new AsencendingHackerThread(vault));
        threads.add(new DecendingHackerThread(vault));
        threads.add(new PoliceThread());

        for(Thread thread:threads){
            thread.start();
        }

    }
    private static class Vault{
        private int password;
        private Vault(int password){
            this.password=password;
        }
        public boolean isCorrectPassword(int guess){
            try {
                Thread.sleep(5);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            return this.password==guess;
        }
    }
    private static abstract class HackerThread extends Thread{
        protected Vault vault;
        public HackerThread(Vault vault){
            this.vault=vault;
            this.setName(this.getClass().getSimpleName());
            this.setPriority(Thread.MAX_PRIORITY);
        }
        public void start(){
            System.out.println("Starting: "+this.getName());
            super.start();
        }
    }
    private static class AsencendingHackerThread extends HackerThread{

       public AsencendingHackerThread(Vault vault) {
            super(vault);
        }
        public void run(){
            for(int guess=0;guess<MAX_PASSWORD;guess++){
                System.out.println("password: "+guess);
                if(vault.isCorrectPassword(guess)){
                    System.out.println(this.getName()+" guessed the password: "+guess);
                    System.exit(0);
                }
            }
        }
    }

    private static class DecendingHackerThread extends HackerThread{

       public DecendingHackerThread(Vault vault) {
            super(vault);
        }
        public void run(){
            for(int guess=MAX_PASSWORD;guess>=0;guess--){
                System.out.println(this.getName()+" password: "+guess);
                if(vault.isCorrectPassword(guess)){
                    System.out.println(this.getName()+" guessed the password: "+guess);
                    System.exit(0);
                }
            }
        }
    }
    private static class PoliceThread extends Thread{
        public void run(){
            for(int i=10;i>=0;i--){
                try {
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(i);
            }
            System.out.println("Game over for you");
            System.exit(0);
        }
    }
}
