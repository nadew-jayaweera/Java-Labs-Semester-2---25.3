package Q04;

class Person {
    private int personID;
    private String name;

    public Person(int personID, String name) {
        this.personID = personID;
        this.name = name;
    }

    public int getPersonID() { return personID; }
    public void setPersonID(int personID) { this.personID = personID; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void displayInfo() {
        System.out.println("ID: " + personID);
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    private double salary;

    public Employee(int personID, String name, double salary) {
        super(personID, name);
        this.salary = salary;
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(int personID, String name, double salary, String department) {
        super(personID, name, salary);
        this.department = department;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}