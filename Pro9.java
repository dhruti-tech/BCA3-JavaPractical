import java.sql.*;
import java.util.Scanner;

public class Pro9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Database connection
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "my password"
            );

            // Accept student details
            System.out.print("Enter GR Number: ");
            int grno = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            // PreparedStatement
            String query = "INSERT INTO Student (grno, name, marks) VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, grno);
            ps.setString(2, name);
            ps.setInt(3, marks);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Student Record Inserted Successfully!");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
