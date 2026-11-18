import java.util.Scanner;

// User-defined exception
class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

public class Pro5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above to vote.");
            }

            System.out.println("You are eligible to vote.");
        }

        catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        finally {
            System.out.println("Voting eligibility check completed.");
            sc.close();
        }
    }
}
