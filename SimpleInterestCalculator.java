import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal, rate, and time
         System.out.print("Name:Vijay Singh,Roll No.:0873AL231026: ");
        System.out.print("Enter Principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest (R): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time in years (T): ");
        double time = scanner.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display result
        System.out.printf("Simple Interest = %.2f\n", simpleInterest);

        scanner.close();
    }
}
