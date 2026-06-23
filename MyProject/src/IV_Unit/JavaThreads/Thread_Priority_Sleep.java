package IV_Unit.JavaThreads;

class z {
    public void hdmi() {
        System.out.println("Hello CSE");
    }
}

class AA extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class BB extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 2");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

public class Thread_Priority_Sleep {
    public static void main(String[] args) throws NumberFormatException {

        AA obj1 = new AA();
        BB obj2 = new BB();

        // obj1.show();
        // obj2.show();

        // 1 implies low priority and 10 implies high priority
        // obj2.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(obj1.getPriority());
        // System.out.println(obj2.getPriority());
        // obj2.setPriority(6);

        obj1.start();
        // try {
        // Thread.sleep(5);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        obj2.start();
    }
}
