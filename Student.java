package College;

public class Student {

    private int rollNo;
    private String name;

    // Constructor
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Display method
    public void display() {
        System.out.println("===== STUDENT DETAILS =====");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Student Name: " + name);
    }
}
