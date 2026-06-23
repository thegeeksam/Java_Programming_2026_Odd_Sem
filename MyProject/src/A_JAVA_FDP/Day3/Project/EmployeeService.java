import java.util.*;
import java.time.LocalDate;
import java.util.stream.*;

public class EmployeeService {

    private List<Employee> employees;

    public EmployeeService(List<Employee> employees) {
        // Default constructor
        this.employees = employees;
    }

    public void displayAll() {
        // Implementation to display all employees
        System.out.println("ID | Name | Department | Salary | Joining Date | Active");
        System.out.println("-------------------------------------------------------");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void showActiveEmployees() {
        // Implementation to show active employees
        for (Employee e : employees) {
            if (e.isActive()) {
                System.out.println(e);
            }
        }
    }

    public void showSortedBySalary() {
        // Implementation to show employees sorted by salary
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)) // Sort by salary
                .forEach(System.out::println); // Print each employee
    }

    public void showSortedByName() {
        employees.stream()
                .sorted(Comparator.comparing(Employee::getName)) // Sort by name
                .forEach(System.out::println); // Print each employee
        // Implementation to show employees sorted by name
    }

    public void showTotalSalary() {
        employees.stream()
                .mapToDouble(Employee::getSalary) // Map to salary
                .sum(); // Sum all salaries
        // Implementation to show total salary of all employees
    }

    public void showAverageSalary() {
        // Implementation to show average salary of all employees
        employees.stream()
                .mapToDouble(Employee::getSalary) // Map to salary
                .average() // Calculate average
                .ifPresent(System.out::println); // Print average salary

    }

    public void showHighestPaid() {
        employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary)) // Find the employee with the highest salary
                .ifPresent(System.out::println); // Print the highest paid employee
        // Implementation to show the highest paid employee
    }

    public void showEmployeesFrom(String department) {
        // Implementation to show employees from a specific department
    }

    public void showRecentJoiners(LocalDate date) {
        // Implementation to show employees who joined after a specific date
    }

    public void showWithRaisedSalary() {
        // Implementation to show employees with raised salary
    }

}
