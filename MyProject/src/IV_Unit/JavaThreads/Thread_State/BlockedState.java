package IV_Unit.JavaThreads.Thread_State;

class Task implements Runnable {
    @Override
    public void run() {
        performTask();
    }

    public static synchronized void performTask() {
        while (true) {
            // Thread1 will run forever, holding the lock, and preventing thread2 from
            // executing
        }
    }
}

public class BlockedState {
    public static void main(String[] args) {

        /*
         * -->> Blocked State <<--
         * A thread goes through Blocked or Non-runnable state when it is temporarily
         * inactive and not eligible to run. It enters this state when it is waiting to
         * acquire a particular resource which can be accessed by only one thread at a
         * time.
         */
        Thread thread1 = new Thread(new Task());
        Thread thread2 = new Thread(new Task());

        // Start the first thread
        thread1.start();
        // Sleep for one second to give thread1 a chance to acquire the lock
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread1 state: " + thread1.getState());
        // Start the second thread
        thread2.start();
        // Sleep for one second to give thread2 a chance to block
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Print the state of thread2 (should be "BLOCKED" at this point)
        System.out.println("Thread2 state: " + thread2.getState());

        // Exit the program
        System.exit(0);
    }
}
