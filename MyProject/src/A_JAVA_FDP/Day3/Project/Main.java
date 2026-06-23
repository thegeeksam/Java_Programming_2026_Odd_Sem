import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDatabase.getAllEmployees();

        EmployeeService service = new EmployeeService(employees);

        System.out.println(" All Employees:");
        service.displayAll();

        System.out.println(" Active Employees:");
        service.showActiveEmployees();

        System.out.println(" Sorted by Salary:");
        service.showSortedBySalary();

        System.out.println(" Sorted by Name:");
        service.showSortedByName();

        System.out.println(" Total Salary:");
        service.showTotalSalary();

        System.out.println(" Average Salary:");
        service.showAverageSalary();

        System.out.println(" Highest Paid Employee:");
        service.showHighestPaid();

        System.out.println(" Employees in IT:");
        service.showEmployeesFrom("IT");

        System.out.println(" Joined after Jan 1, 2021:");
        service.showRecentJoiners(LocalDate.of(2021, 1, 1));

        System.out.println(" Raised Salary Preview:");
        service.showWithRaisedSalary();
    }
}
