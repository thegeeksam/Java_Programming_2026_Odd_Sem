import java.time.LocalDate;
import java.util.*;
public class EmployeeDatabase {

    public static List<Employee> getAllEmployees() {
        return Arrays.asList(
            new Employee(1, "Alicee", "HR", 50000, LocalDate.of(2020, 1, 15), true),
            new Employee(2, "Bob", "IT", 75000, LocalDate.of(2021, 5, 10), true),
            new Employee(3, "Charlie", "Finance", 40000, LocalDate.of(2019, 3, 20), false),
            new Employee(4, "David", "IT", 85000, LocalDate.of(2022, 2, 5), true),
            new Employee(5, "Eva", "HR", 60000, LocalDate.of(2023, 7, 1), true)
        );
    }
}
