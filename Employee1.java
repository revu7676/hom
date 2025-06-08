class Employee {
    // Employee attributes
    int id;
    String name;
    String department;
    double salary;

    // Constructor
    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee ID      : " + id);
        System.out.println("Name             : " + name);
        System.out.println("Department       : " + department);
        System.out.println("Salary           : $" + salary);
        System.out.println("------------------------------");
    }

    // Main method
    public static void main(String[] args) {
        // Creating employee objects (hardcoded)
        Employee emp1 = new Employee(101, "Alice Smith", "HR", 55000);
        Employee emp2 = new Employee(102, "Bob Johnson", "IT", 75000);
        Employee emp3 = new Employee(103, "Charlie Brown", "Finance", 65000);

        // Display employee details
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}

