/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This Java snippet illustrates:
 * * - Fetching current date and time
 * * - Formatting date-time output
 * * - Using immutable, thread-safe classes from java.time
 * * - (Commented) Handling time zones with ZonedDateTime
 * *
 * * The Date class is outdated and not recommended for new code.
 * * Issues with Date class:
 * * - year starts from 1900
 * * - deprecated
 * * - not thread safe
 * * - mutable
 * * - Does not support time zones
 * * - java.util.Date represents both date and time (fetch from system clock)
 * * - java.sql.Date represents only date (no time component)
 * * - java.sql.Time represents only time (no date component)
 * * - java.sql.Timestamp represents both date and time with nanosecond precision
 * *
 * @package III_Unit.Date_Time;
 * @author Dr. S. Sampath Kumar
 * @since 10-09-2025
 * @version 2.0
 */

package III_Unit.Date_Time;

import java.util.Date;
// import java.util.Spliterator;
// import java.net.SocketImpl;
// import java.net.SocketPermission;
import java.time.*;
// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.LocalTime;
// import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeEx {
    public static void main(String[] args) {
        /*
        //  Legacy Date class
        Date date = new Date(2025,9,10);
        // will get misleading output, because it adds 1900 to the year
        System.out.println("Today's Date is: " + date);
        */
        
        // fetch current date using the LocalDate class
        // Immutable and thread-safe
        // LocalDate implemented as 'final'
        LocalDate dateObj = LocalDate.now();
        System.out.println("Today's Date is: " + dateObj);

        // LocalDate dateObj1 = LocalDate.of(2025, 9, 10);
        // System.out.println("Specific Date is: " + dateObj1);

        // fetch current time using the LocalTime class
        LocalTime timeObj = LocalTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Time is: " + timeObj);

        // fetch current time in GMT using the LocalTime class
        LocalTime timeObj1 = LocalTime.now(ZoneId.of("GMT"));
        System.out.println("Current GMT Time is: " + timeObj1);
        
        // fetch current date and time using the LocalDateTime class
        LocalDateTime dateTimeObj = LocalDateTime.now();
        System.out.println("Output without formatting: " + dateTimeObj);
        // above line output is not in user friendly format
        // hence we need to format it
        // using the DateTimeFormatter class
        // DateTimeFormatter is immutable and thread-safe
        
        // Formatting the date time object using 'custom format'
        DateTimeFormatter myFormatObj = 
            DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        
        // Apply the format to the date time object and 
        // convert it to string
        String formattedDate = dateTimeObj.format(myFormatObj);
        System.out.println("Output After formatting: " + formattedDate);
        
        // Storing the date time field
        // along with the zone using the ZonedDateTime class
        ZonedDateTime zone = ZonedDateTime.now();
        System.out.println(zone);

        // Apply the format to the date time object and
        // convert it to string
        DateTimeFormatter formatter = 
            DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a E z");
        String formattedDateWithZone = zone.format(formatter);
        System.out.println("Output with Zone: " + formattedDateWithZone);
    }
}