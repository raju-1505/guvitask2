package Person;

public class Person {
    protected String name;
    protected int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}



package Person;

public class Employee extends Person {
    private int employeeID;
    private double salary;

    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }


    public void displayEmployeeDetails() {
        super.displayPersonDetails();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: ₹" + salary);
    }
}



package Person;

import java.util.Scanner;

class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accepting employee details from user
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter employee ID: ");
        int empID = sc.nextInt();

        System.out.print("Enter salary: ₹");
        double salary = sc.nextDouble();

        // Creating Employee object
        Employee emp = new Employee(name, age, empID, salary);

        // Displaying employee info
        System.out.println("\n--- Employee Details ---");
        emp.displayEmployeeDetails();

        sc.close();
    }
}
