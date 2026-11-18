import java.util.Scanner;

public class Pro1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;
        double percentage;
        char grade;

        // Accept marks of 5 subjects
        System.out.println("Enter marks of 5 subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }

        // Calculate percentage
        percentage = total / 5.0;

        // Calculate grade
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Display result
        System.out.println("\n===== STUDENT RESULT =====");
        System.out.println("Subject 1 Marks : " + marks[0]);
        System.out.println("Subject 2 Marks : " + marks[1]);
        System.out.println("Subject 3 Marks : " + marks[2]);
        System.out.println("Subject 4 Marks : " + marks[3]);
        System.out.println("Subject 5 Marks : " + marks[4]);
        System.out.println("---------------------------");
        System.out.println("Total Marks : " + total + " / 500");
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade : " + grade);
        System.out.println("===========================");

        sc.close();
    }
}