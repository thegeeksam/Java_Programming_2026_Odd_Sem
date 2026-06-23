package A_BootCamp.Day3;

class Chumma {
    String name = "Default Name"; // Instance variabled

    Chumma(String name) {
        this.name = name;  // 'this.name' refers to the instance variable
    }

    void display() {
        System.out.println("Name: " + this.name);
    }

    public static void main(String[] args) {
        Chumma s = new Chumma("Hello");
        s.display();
    }
}