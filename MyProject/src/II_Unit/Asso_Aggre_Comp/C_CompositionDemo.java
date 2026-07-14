/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * *
 * +--------------+       composed of       +-------------+
 * | House        |------------------------>| Room        |
 * +--------------+                         +-------------+
 * | -bedroom     |                         | -type       |
 * | -kitchen     |                         | +describe() |
 * +--------------+                         +-------------+
 * | +showHouse() |
 * +--------------+
 * @package II_Unit.Asso_Aggre_Comp
 * @author Dr. S. Sampath Kumar
 * @since 03-08-2025
 * @version 1.0
 */
package II_Unit.Asso_Aggre_Comp;

class Room {
    String sType;

    Room(String sType) {
        this.sType = sType;
    }

    void describe() {
        System.out.println("Room type: " + sType);
    }
}

class House {
    // Composition: House strongly owns its Room objects
    private final Room objBedroom;
    private final Room objKitchen;

    // Composition - House has Rooms
    // Rooms are created inside the House.
    // If the House is gone, so are the Rooms.
    House() {
        // Room objects are created internally by House
        objBedroom = new Room("Bedroom");
        objKitchen = new Room("Kitchen");
    }

    void showHouse() {
        objBedroom.describe();
        objKitchen.describe();
    }
}

public class C_CompositionDemo {
    public static void main(String[] args) {
        // Only House object is directly created here
        House objHouse = new House();
        // If the House is gone, so are the Rooms.
        objHouse.showHouse();
        // The lifecycle of the Room objects is strongly tied to the House.
        // When the House becomes unreachable, and no external references to its
        // Rooms exist, the Rooms also become eligible for garbage collection.
    }

}
