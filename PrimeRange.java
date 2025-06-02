import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input start and end numbers
        System.out.println("Name : VIJAY SINGH SENGAR");
        System.out.println("Enrollment Number : 0873AL231026");

        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        // Loop through the range
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
