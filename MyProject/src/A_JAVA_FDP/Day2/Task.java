import java.util.*;
import java.util.stream.Collectors; // For grouping and filtering with streams

// 1. Employee Class
class Employee {
    private int id;
    private String name, department;
    private double salary;

    // Constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters for all attributes
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // equals() and hashCode() are crucial for preventing duplicate IDs
    // When using a HashMap where Employee ID is the key, or if using a HashSet of
    // Employee objects,
    // these methods ensure that objects with the same ID are considered the same.
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Employee employee = (Employee) o;
        return id == employee.id; // Equality based solely on Employee ID
    }

    @Override
    public int hashCode() {
        return Objects.hash(id); // Hash based solely on Employee ID
    }

    // toString() for easy printing of Employee objects
    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Department: %s, Salary: ₹%.2f",
                id, name, department, salary);
    }
}

// 2. EmployeeManager Class - Manages all employee-related operations
class EmployeeManager {
    // Using HashMap to store employees for efficient lookup by ID and prevent
    // duplicate IDs.
    // Key: Employee ID (Integer), Value: Employee object
    private Map<Integer, Employee> employees;
    // Using a Queue for the promotion queue (FIFO - First In, First Out)
    private Queue<Integer> promotionQueue;

    public EmployeeManager() {
        this.employees = new HashMap<>();
        this.promotionQueue = new LinkedList<>(); // LinkedList implements the Queue interface
    }

    // Accept employee details from user input & Prevent duplicates based on
    // Employee ID
    public void addEmployee(Employee employee) {
        if (employees.containsKey(employee.getId())) {
            System.out.println("Error: Employee with ID " + employee.getId() + " already exists. Not added.");
        } else {
            employees.put(employee.getId(), employee);
            System.out
                    .println("Employee " + employee.getName() + " (ID: " + employee.getId() + ") added successfully.");
        }
    }

    // Sort employees by salary in descending order and display
    public void displayEmployeesSortedBySalary() {
        if (employees.isEmpty()) {
            System.out.println("\nNo employees to display.");
            return;
        }
        // Get all Employee objects from the HashMap values
        List<Employee> sortedEmployees = new ArrayList<>(employees.values());

        // Sort using a lambda expression as a Comparator
        // Double.compare(e2.getSalary(), e1.getSalary()) ensures descending order
        sortedEmployees.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));

        System.out.println("\n--- Employees Sorted by Salary (Descending) ---");
        sortedEmployees.forEach(System.out::println);
    }

    // Group employees by their department and display the map
    public void groupEmployeesByDepartment() {
        if (employees.isEmpty()) {
            System.out.println("\nNo employees to group.");
            return;
        }
        // Using Java Stream API's Collectors.groupingBy
        Map<String, List<Employee>> employeesByDept = employees.values().stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("\n--- Employees Grouped by Department ---");
        employeesByDept.forEach((department, employeeList) -> {
            System.out.println("Department: " + department);
            employeeList.forEach(emp -> System.out.println("  - " + emp.getName() + " (ID: " + emp.getId() + ")"));
        });
    }

    // Identify top performers (salary > ₹50,000 and name starting with ‘A’)
    public void identifyTopPerformers() {
        if (employees.isEmpty()) {
            System.out.println("\nNo employees to check for top performers.");
            return;
        }
        // Using Java Stream API's filter
        List<Employee> topPerformers = employees.values().stream()
                .filter(emp -> emp.getSalary() > 50000 && emp.getName().startsWith("A"))
                .collect(Collectors.toList());

        if (topPerformers.isEmpty()) {
            System.out.println("\nNo top performers found (salary > ₹50,000 and name starting with 'A').");
        } else {
            System.out.println("\n--- Top Performers (Salary > ₹50,000 & Name Starts with 'A') ---");
            topPerformers.forEach(System.out::println);
        }
    }

    // Manage a promotion queue based on employee ID input
    public void addEmployeeToPromotionQueue(int employeeId) {
        if (employees.containsKey(employeeId)) {
            if (!promotionQueue.contains(employeeId)) { // Prevent duplicates in the queue itself
                promotionQueue.offer(employeeId); // Add to the end of the queue
                System.out.println("Employee ID " + employeeId + " added to the promotion queue.");
            } else {
                System.out.println("Employee ID " + employeeId + " is already in the promotion queue.");
            }
        } else {
            System.out.println("Error: Employee with ID " + employeeId + " not found. Cannot add to promotion queue.");
        }
    }

    public void simulatePromotion() {
        if (promotionQueue.isEmpty()) {
            System.out.println("\nPromotion queue is empty. No promotions to simulate.");
            return;
        }
        System.out.println("\n--- Simulating Promotions ---");
        while (!promotionQueue.isEmpty()) {
            int empId = promotionQueue.poll(); // Remove employee from the front of the queue
            Employee promotedEmployee = employees.get(empId);
            if (promotedEmployee != null) {
                System.out.println(
                        "Promoting: " + promotedEmployee.getName() + " (ID: " + promotedEmployee.getId() + ")");
                // In a real application, you would update their salary, role, etc.
            } else {
                System.out.println("Employee with ID " + empId
                        + " was in the queue but no longer exists in records (might have been removed).");
            }
        }
        System.out.println("Promotion simulation complete.");
    }

    // Bonus: Remove employees earning less than ₹30,000
    public void removeLowEarners() {
        if (employees.isEmpty()) {
            System.out.println("\nNo employees to remove from.");
            return;
        }
        // Identify IDs of employees to remove
        List<Integer> idsToRemove = employees.values().stream()
                .filter(emp -> emp.getSalary() < 30000)
                .map(Employee::getId)
                .collect(Collectors.toList());

        if (idsToRemove.isEmpty()) {
            System.out.println("\nNo employees earning less than ₹30,000 found.");
            return;
        }

        System.out.println("\n--- Removing Employees Earning Less Than ₹30,000 ---");
        for (int id : idsToRemove) {
            Employee removedEmp = employees.remove(id); // remove from the map
            if (removedEmp != null) {
                System.out.println("Removed: " + removedEmp.getName() + " (ID: " + removedEmp.getId() + ")");
            }
        }
        System.out.println("Removal process complete.");
    }

    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("\nNo employees currently in the system.");
            return;
        }
        System.out.println("\n--- Current Employees in System ---");
        employees.values().forEach(System.out::println);
    }
}

// Main Class - Handles user interaction and calls EmployeeManager methods
public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();

        System.out.println("--- Welcome to Sri Eswar Tech Solutions - Employee Management App ---");

        // 1. Accept number of employees
        int numEmployees = -1;
        while (numEmployees < 0) {
            try {
                System.out.print("\nEnter the number of employees to add: ");
                numEmployees = scanner.nextInt();
                if (numEmployees < 0) {
                    System.out.println("Number of employees cannot be negative. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Consume the invalid input
            }
        }
        scanner.nextLine(); // Consume the leftover newline character

        // 2. Accept employee details
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\n--- Enter details for Employee #" + (i + 1) + " ---");
            int id = -1;
            while (id <= 0) {
                try {
                    System.out.print("  Employee ID: ");
                    id = scanner.nextInt();
                    if (id <= 0) {
                        System.out.println("Employee ID must be a positive integer.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter an integer ID.");
                    scanner.next();
                    id = -1; // Reset to loop again
                }
            }
            scanner.nextLine(); // Consume newline

            System.out.print("  Name: ");
            String name = scanner.nextLine();
            System.out.print("  Department: ");
            String department = scanner.nextLine();
            double salary = -1.0;
            while (salary < 0) {
                try {
                    System.out.print("  Salary: ₹");
                    salary = scanner.nextDouble();
                    if (salary < 0) {
                        System.out.println("Salary cannot be negative.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid salary (e.g., 55000.00).");
                    scanner.next();
                    salary = -1.0; // Reset to loop again
                }
            }
            scanner.nextLine(); // Consume newline

            manager.addEmployee(new Employee(id, name, department, salary));
        }

        // Functional Requirements Display
        manager.displayAllEmployees();
        manager.displayEmployeesSortedBySalary();
        manager.groupEmployeesByDepartment();
        manager.identifyTopPerformers();

        // Manage Promotion Queue
        int numPromotions = -1;
        while (numPromotions < 0) {
            try {
                System.out.print("\nHow many employees are requesting promotion (enter 0 if none)? ");
                numPromotions = scanner.nextInt();
                if (numPromotions < 0) {
                    System.out.println("Number of promotions cannot be negative. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }

        for (int i = 0; i < numPromotions; i++) {
            int promoId = -1;
            while (promoId <= 0) {
                try {
                    System.out.print("  Enter Employee ID for promotion #" + (i + 1) + ": ");
                    promoId = scanner.nextInt();
                    if (promoId <= 0) {
                        System.out.println("Employee ID must be a positive integer.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter an integer ID.");
                    scanner.next();
                    promoId = -1; // Reset to loop again
                }
            }
            manager.addEmployeeToPromotionQueue(promoId);
        }
        manager.simulatePromotion();

        // Bonus: Remove low earners
        System.out.print("\nDo you want to remove employees earning less than ₹30,000? (yes/no): ");
        String removeChoice = scanner.nextLine().trim().toLowerCase();
        if (removeChoice.equals("yes")) {
            manager.removeLowEarners();
        } else {
            System.out.println("Skipping removal of low earners.");
        }

        // Display current state after removals (if any)
        manager.displayAllEmployees();

        System.out.println("\n--- Thank you for using the Employee Management App ---");
        scanner.close();
    }
}
