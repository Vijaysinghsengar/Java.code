import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();

        int reversed = 0;

        // Logic to reverse the number
        while (number != 0) {
            int digit = number % 10;            // Get last digit
            reversed = reversed * 10 + digit;   // Build reversed number
            number = number / 10;               // Remove last digit
        }

        // Output reversed number
        System.out.println("Reversed number: " + reversed);

        scanner.close();
    }
}
