import java.util.Scanner;

// Base class
class Employee {
    String name;
    int age;
    String phone;
    String address;
    int salary;

    void printSalary() {
        System.out.println(salary);
    }
}

// Officer class
class Officer extends Employee {
    String specialization;
}

// Manager class
class Manager extends Employee {
    String department;
}

public class EmployeeInheritance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // -------- OFFICER INPUT --------
        Officer officer = new Officer();
        officer.name = sc.nextLine();
        officer.age = sc.nextInt();
        sc.nextLine();
        officer.phone = sc.nextLine();
        officer.address = sc.nextLine();
        officer.salary = sc.nextInt();
        sc.nextLine();
        officer.specialization = sc.nextLine();

        // -------- MANAGER INPUT --------
        Manager manager = new Manager();
        manager.name = sc.nextLine();
        manager.age = sc.nextInt();
        sc.nextLine();
        manager.phone = sc.nextLine();
        manager.address = sc.nextLine();
        manager.salary = sc.nextInt();
        sc.nextLine();
        manager.department = sc.nextLine();

        // -------- OUTPUT --------
        System.out.println("Officer:");
        System.out.println(officer.name);
        System.out.println(officer.age);
        System.out.println(officer.phone);
        System.out.println(officer.address);
        System.out.println(officer.salary);
        System.out.println(officer.specialization);

        System.out.println("Manager:");
        System.out.println(manager.name);
        System.out.println(manager.age);
        System.out.println(manager.phone);
        System.out.println(manager.address);
        System.out.println(manager.salary);
        System.out.println(manager.department);
    }
}
