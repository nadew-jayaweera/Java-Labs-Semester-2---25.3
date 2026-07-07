package Q03;

public class Employee {
    private int employeeID;
    private String name;
    private double salary;

    public Employee(int employeeID, String name, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeID() { return employeeID; }
    public void setEmployeeID(int employeeID) { this.employeeID = employeeID; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public double calculateBonus() {
        return this.salary * 0.05;
    }
}

class Manager extends Employee {
    private String department;

    public Manager(int employeeID, String name, double salary, String department) {
        super(employeeID, name, salary);
        this.department = department;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.15;
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(int employeeID, String name, double salary, String programmingLanguage) {
        super(employeeID, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() { return programmingLanguage; }
    public void setProgrammingLanguage(String programmingLanguage) { this.programmingLanguage = programmingLanguage; }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.10;
    }
}

