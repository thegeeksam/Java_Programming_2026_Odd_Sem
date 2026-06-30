/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * It demonstrates the creation of a custom wrapper class in Java.
 * *
 * * The custom wrapper class, named Temperature, encapsulates an 
 * * integer value representing temperature in Celsius.
 * * The class provides methods to get the temperature in Celsius, 
 * * convert it to Fahrenheit, and determine if the temperature is 
 * * considered hot (greater than 40°C). 
 * * The main method creates an instance of the Temperature class and 
 * * displays the temperature in both Celsius and Fahrenheit, 
 * * as well as whether it is hot or not.
 * *
 * * This example illustrates how to create a custom wrapper class that 
 * * provides additional functionality beyond just encapsulating a 
 * * primitive value, making it more useful and versatile in various applications.
 * *
 * * The custom wrapper class can be used
 * * in scenarios where you want to add behavior or properties to a primitive type,
 * *
 * * @package i_unit.wrapperclass
 * @author Dr. S. Sampath Kumar
 * @since 22-06-2026
 * @version 1.0
 */

package I_Unit.WrapperClass;

class Temperature {
    private int iTemperature;

    // constructor to initialize the temperature value
    public Temperature(int iTemperature) {
        this.iTemperature = iTemperature;
    }

    public int getTemperature() {
        return iTemperature;
    }

    public double getFahrenheit() {
        return (iTemperature * 9.0 / 5) + 32;
    }

    public boolean isHot() {
        return iTemperature > 40;
    }
}

public class G_CustomWrapper_ECE {
    public static void main(String[] args) {
        Temperature objTemp = new Temperature(35);

        System.out.println("Temperature : " + objTemp.getTemperature() + "°C");
        System.out.println("Fahrenheit  : " + objTemp.getFahrenheit() + "°F");
        System.out.println("Is Hot?     : " + objTemp.isHot());
    }
}
