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
    String type;
    Room(String type) {
        this.type = type;
    }

    void describe() {
        System.out.println("Room type: " + type);
    }
}

class House {
    Room bedroom;
    Room kitchen;
    // Composition - House has Rooms
    // Rooms are created inside the House. 
    // If the House is gone, so are the Rooms.
    House() {
        bedroom = new Room("Bedroom");
        kitchen = new Room("Kitchen");
    }

    void showHouse() {
        bedroom.describe();
        kitchen.describe();
    }
}

public class C_CompositionDemo {
    public static void main(String[] args) {
        House h = new House();
        h.showHouse();
    }

}
