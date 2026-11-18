import java.util.Scanner;

class Student {

    // Student details
    String name;
    int rollNo;
    int[] marks = new int[5];

    // Static member
    static int totalStudents = 0;

    // Constructor
    Student(String name, int rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        totalStudents++;
    }

    // Method to calculate total
    int calculateTotal() {
        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];
        }

        return total;
    }

    // Method to calculate percentage
    double calculatePercentage() {
        return calculateTotal() / 5.0;
    }

    // Display result
    void displayResult() {
        System.out.println("\n===== STUDENT RESULT =====");
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollNo);

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + " : " + marks[i]);
        }

        System.out.println("Total : " + calculateTotal() + " / 500");
        System.out.println("Percentage : " + calculatePercentage() + "%");
        System.out.println("==========================");
    }
}

public class Pro2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        int[] marks = new int[5];

        System.out.println("Enter marks of 5 subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Create Student object using constructor
        Student s1 = new Student(name, rollNo, marks);

        // Display result
        s1.displayResult();

        System.out.println("Total Students: " + Student.totalStudents);

        sc.close();
    }
}