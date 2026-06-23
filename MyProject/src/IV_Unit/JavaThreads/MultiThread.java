package IV_Unit.JavaThreads;

/*
 * Threads:-
 * Multiple threads run at same time in a code.
 * This is known as Multithreading.
 * - A thread is a smallest unit to work with. (individual task)
 * - They can run parallel.
 * - Multiple threads can share resources.
 */

/*
 * - New State  
 * - Runnable State  -> start() method
 * - Running State   -> run() method will move a thread to running state
 * - Waiting State	 -> sleep(),  wait() method
 * - Dead State      ->
 * Through notify(), you will go to waiting state to runnable state.
 * From Running, Runnable state to dead state through stop() method.
 */

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread 1 is running");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread 2 is running");
        }
    }
}

public class MultiThread {
    public static void main(String[] args) throws NumberFormatException {
        A obj1 = new A();
        B obj2 = new B();

        // Start threads
        obj1.start();
        obj2.start();
    }
}
