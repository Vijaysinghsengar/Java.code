import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        // Logic to find the greatest number
        int greatest;
        if (a >= b && a >= c) {
            greatest = a;
        } else if (b >= a && b >= c) {
            greatest = b;
        } else {
            greatest = c;
        }

        // Output the result
        System.out.println("The greatest number is: " + greatest);

        scanner.close();
    }
}