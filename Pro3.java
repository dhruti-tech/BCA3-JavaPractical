class Employee {

    String name;
    double salary;

    // Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Display method
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Manager subclass
class Manager extends Employee {

    Manager(String name, double salary) {
        super(name, salary);
    }

    // Method overriding
    @Override
    void display() {
        System.out.println("\n===== MANAGER DETAILS =====");
        System.out.println("Manager Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Role: Manager");
    }
}

// Developer subclass
class Developer extends Employee {

    Developer(String name, double salary) {
        super(name, salary);
    }

    // Method overriding
    @Override
    void display() {
        System.out.println("\n===== DEVELOPER DETAILS =====");
        System.out.println("Developer Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Role: Developer");
    }
}

// Main class
public class Pro3 {
    public static void main(String[] args) {

        Manager m = new Manager("Ram", 60000);
        Developer d = new Developer("Laxman", 45000);

        m.display();
        d.display();
    }
}