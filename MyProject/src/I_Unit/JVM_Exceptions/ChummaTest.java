package JVM_Exceptions;

public class ChummaTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1 = null;

        System.gc();

        System.out.println("Done");
    }
}


class Student {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector called");
        System.out.println("Object is garbage collected");
    }

}
