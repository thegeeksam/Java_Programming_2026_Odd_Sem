package IV_Unit.JavaThreads.Runnable_Interface;

class z {
    public void hdmi() {
        System.out.println("Hello CSE");
    }
}

class A extends z implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Runnable_Throwable {
    public static void main(String[] args) throws InterruptedException {

        // A obj1 = new A();
        // B obj2 = new B();
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        Thread.sleep(2);
        t2.start();
    }

}

// Runnable obj1=new Runnable()
// {
// public void run()
// {
// for(int i=1;i<=5;i++)
// {
// System.out.println("Hello");
// try {
// Thread.sleep(10);
// }catch(InterruptedException e) {
// e.printStackTrace();
// }
// }
// }
// };

// Runnable obj1 = () -> {
// for (int i = 1; i <= 5; i++) {
// System.out.println("Hi");
// try {
// Thread.sleep(10);
// } catch (InterruptedException e) {
// e.printStackTrace();
// }
// }
// };

// Runnable obj2 = () -> {
// for (int i = 1; i <= 5; i++) {
// System.out.println("Hello");
// try {
// Thread.sleep(10);
// } catch (InterruptedException e) {
// e.printStackTrace();
// }
// }
// };
