import java.util.Scanner;

public class MarriageEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs
        System.out.println("Name:Vijay Singh,Roll No.:0873AL231026");
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter gender (1 for male, 0 for female): ");
        int gender = scanner.nextInt();

        // Determine eligibility
        boolean eligible;
        if (gender == 1) {             // Male
            eligible = (age >= 21);
        } else if (gender == 0) {      // Female
            eligible = (age >= 18);
        } else {
            System.out.println("Invalid gender input! Use 1 for male, 0 for female.");
            scanner.close();
            return;
        }

        // Output result
        if (eligible) {
            System.out.println("Eligible for marriage.");
        } else {
            System.out.println("Not eligible for marriage.");
        }

        scanner.close();
    }
}
