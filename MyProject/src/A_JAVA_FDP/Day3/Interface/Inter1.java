package A_JAVA_FDP.Day3.Interface;
// package A_JAVA_FDP.Day3;

interface First {
    public void show();
}

class second implements First {
    @Override
    public void show() {
        System.out.println("Hello from Second class!");
    }
}

public class Inter1 {
    public static void main(String[] args) {
        First obj = new second();
        obj.show();
        System.out.println("Hello from Inter class!");
    }
}
