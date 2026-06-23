package IV_Unit.JavaThreads;

public class ThreadStates {
    public static void main(String[] args) {
        // Create a new thread
        Thread thread = new Thread(() -> {
        });

        /*
         * -->> 1. NEW State <<--
         * A thread is in the NEW state if it has been created but has
         * the start() method hasn’t been invoked yet.
         * This is the initial state of the thread.
         * At this state, the thread is not considered alive as its
         * execution has not started yet.
         */
        System.out.println("Thread state: " + thread.getState());

        /*
         * -->> 2. RUNNABLE State <<--
         * Thread goes through RUNNABLE state after the invocation of the start()
         * method. At this state, a thread is considered alive because it is either
         * running or ready for execution, but waiting for resource allocation.
         */

        // Start the thread
        thread.start(); // This will transition thread to the "RUNNABLE" state
        System.out.println("Thread state: " + thread.getState());

        /*
         * -->> 3. Blocked State <<--
         * A thread goes through Blocked or Non-runnable state when it is temporarily
         * inactive and not eligible to run. It enters this state when it is waiting to
         * acquire a particular resource which can be accessed by only one thread at a
         * time.
         */

        // Wait for a while
        /*
         * -->> RUNNING State <<--
         * A thread is in RUNNING state if the thread scheduler has selected it.
         * At this state, the thread is considered alive because its instructions
         * are being executed.
         */
        try {

            // Wait for the thread to die
            thread.join(); // This will transition it to the "TERMINATED" state
            System.out.println("Thread state: " + thread.getState());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
