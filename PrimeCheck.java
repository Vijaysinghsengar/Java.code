import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.println("Name : VIJAY SINGH SENGAR");
        System.out.println("Enrollment Number : 0873AL231026");

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        // Prime check logic
        if (number <= 1) {
            isPrime = false; // 0 and 1 are not prime numbers
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Output result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }

        scanner.close();
    }
}
