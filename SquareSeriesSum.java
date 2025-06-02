import java.util.Scanner;

public class SquareSeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input n
        System.out.println("Name : VIJAY SINGH SENGAR");
        System.out.println("Enrollment Number : 0873AL231026");

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = 0;

        // Calculate sum of squares from 1 to n
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }

        // Output result
        System.out.println("Sum of the series 1² + 2² + ... + " + n + "² = " + sum);

        scanner.close();
    }
}
