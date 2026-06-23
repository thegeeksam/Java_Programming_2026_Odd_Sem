package A_JAVA_FDP.Day2;

import java.util.ArrayList;
import java.util.List;

public class PlacementList {
    private int rollNo;
    private String name;

    // Constructor
    public PlacementList(int rollNo, String Name) {

    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return rollNo + name;
    }

    public static void main(String[] args) {
        List<String> placedStudents = new ArrayList<>()

        placedStudents.add("xyz");
        placedStudents.add("abc");
        //adding students name & rollNumber
        placedStudents.add(new placedStudents(101,"Sam"));


    }

}
