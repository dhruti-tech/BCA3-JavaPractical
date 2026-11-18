import java.sql.*;
import java.util.Scanner;

public class Pro10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "my password"
            );

            int choice;

            do {
                System.out.println("\n===== STUDENT CRUD =====");
                System.out.println("1. Insert");
                System.out.println("2. Display");
                System.out.println("3. Update");
                System.out.println("4. Delete");
                System.out.println("5. Exit");

                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        // Insert
                        System.out.print("Enter GRNO: ");
                        int grno = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Marks: ");
                        int marks = sc.nextInt();

                        PreparedStatement ps1 = con.prepareStatement(
                            "INSERT INTO Student VALUES (?, ?, ?)"
                        );

                        ps1.setInt(1, grno);
                        ps1.setString(2, name);
                        ps1.setInt(3, marks);

                        int r1 = ps1.executeUpdate();

                        System.out.println("Affected rows: " + r1);

                        ps1.close();
                        break;

                    case 2:
                        // Display
                        Statement st = con.createStatement();

                        ResultSet rs = st.executeQuery(
                            "SELECT * FROM Student"
                        );

                        while (rs.next()) {
                            System.out.println(
                                rs.getInt("grno") + " " +
                                rs.getString("name") + " " +
                                rs.getInt("marks")
                            );
                        }

                        rs.close();
                        st.close();
                        break;

                    case 3:
                        // Update
                        System.out.print("Enter GRNO: ");
                        int ug = sc.nextInt();

                        System.out.print("Enter New Marks: ");
                        int um = sc.nextInt();

                        PreparedStatement ps2 = con.prepareStatement(
                            "UPDATE Student SET marks = ? WHERE grno = ?"
                        );

                        ps2.setInt(1, um);
                        ps2.setInt(2, ug);

                        int r2 = ps2.executeUpdate();

                        System.out.println("Affected rows: " + r2);

                        ps2.close();
                        break;

                    case 4:
                        // Delete
                        System.out.print("Enter GRNO: ");
                        int dg = sc.nextInt();

                        PreparedStatement ps3 = con.prepareStatement(
                            "DELETE FROM Student WHERE grno = ?"
                        );

                        ps3.setInt(1, dg);

                        int r3 = ps3.executeUpdate();

                        System.out.println("Affected rows: " + r3);

                        ps3.close();
                        break;

                    case 5:
                        System.out.println("Program completed.");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } while (choice != 5);

            con.close();

        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
        }

        sc.close();
    }
}