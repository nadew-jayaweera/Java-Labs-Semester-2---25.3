public class Employee {
    int empId;
    String empName;
    String department;
    double basicSalary;

    public Employee(int empId, String empName, String department, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    public double calculateNetSalary(double bonusPercentage) {
        double netSalary = basicSalary +
                (basicSalary * bonusPercentage / 100);

        return netSalary;
    }

    public String getEmployeeSummary() {
        return "Employee ID: " + empId +
               ", Name: " + empName +
               ", Department: " + department;
    }

    public void promote(String newDepartment) {
        department = newDepartment;

        System.out.println(empName +
                " has been promoted to " +
                newDepartment + ".");
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee(101, "gimahana", "IT", 80000);
        Employee emp2 = new Employee(102, "noone", "HR", 70000);

        System.out.println(emp1.getEmployeeSummary());
        System.out.println(emp2.getEmployeeSummary());

        System.out.println("Net Salary of " + emp1.empName +
                ": Rs. " + emp1.calculateNetSalary(20));

        System.out.println("Net Salary of " + emp2.empName +
                ": Rs. " + emp2.calculateNetSalary(20));

        emp1.promote("Management");
    }
}