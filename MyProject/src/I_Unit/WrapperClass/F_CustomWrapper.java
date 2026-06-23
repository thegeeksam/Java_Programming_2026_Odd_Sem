/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * It demonstrates the creation of a custom wrapper class in Java.
 * * This custom wrapper class encapsulates an integer value representing speed.
 * * The class provides methods to get and set the speed value.
 * 
 * @package I_Unit
 * @author Dr. S. Sampath Kumar
 * @since 03-08-2025
 * @version 1.0
 */

package I_Unit.WrapperClass;

class SpeedWrapperClass {
    private int speed;

    SpeedWrapperClass() {
    }

    SpeedWrapperClass(int speed) {
        this.speed = speed;
    }

    public int getVehicleSpeed() {
        return speed;
    }

    public void setVehicleSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SpeedWrapperClass{speed=" + speed + "}";
    }
}

// Testing the custom wrapper class
public class F_CustomWrapper {
    public static void main(String[] args) {
        SpeedWrapperClass speedValue = new SpeedWrapperClass(100);
        System.out.println(speedValue);
    }
}
