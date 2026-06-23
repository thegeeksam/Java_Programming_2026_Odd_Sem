import java.time.LocalDate;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private LocalDate joiningDate;
    private boolean isActive;

    public Employee(int id, String name, String department, double salary, LocalDate joiningDate, boolean isActive) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.joiningDate = joiningDate;
        this.isActive = isActive;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public LocalDate getJoiningDate() { return joiningDate; }
    public boolean isActive() { return isActive; }

    @Override
    public String toString() {
        return id + " | " + name + " | " + department + " | ₹" + salary + " | " + joiningDate + " | " + isActive;
    }
}
