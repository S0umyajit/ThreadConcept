package org.example.org.daemonThread;

class Test extends Thread {
    public void run() {
        // Daemon threads usually perform background tasks like GC or monitoring
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon Thread: I am running as a background service...");
        } else {
            System.out.println("User Thread: I am running as a high-priority task.");
        }
    }
}

public class DaemonThreadEx {
    public static void main(String[] args) {
        System.out.println("Main Thread: Starting...");

        Test t = new Test();
        t.setDaemon(true); // Marking this thread as a service provider (Daemon)
        t.start();

        /*
         * CRITICAL OBSERVATION:
         * If the main thread ends here, the JVM terminates instantly.
         * The Daemon thread 't' will be killed before it even gets to the
         * 'System.out.println' line in its run() method.
         */

        // ADDING WORK TO MAIN THREAD:
        // We simulate a task in the main thread so it stays "Alive" long enough
        // for the Daemon thread to actually perform its service.
        for(int i = 1; i <= 3; i++) {
            System.out.println("Main thread is busy working... " + i);
            try {
                Thread.sleep(5000); // Small delay to let the CPU switch to the Daemon thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Main Thread: Finishing. All Daemons will now be terminated by the JVM.");
    }
}