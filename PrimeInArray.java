import java.util.Scanner;

public class PrimeInArray {

    // Method to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) return false;  // 0 and 1 are not prime
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter number of elements in the array: ");
        int n = scanner.nextInt();

        // Declare and input array elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Print prime numbers in the array
        System.out.println("Prime numbers in the array:");
        boolean found = false;
        for (int num : arr) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("None");
        }

        scanner.close();
    }
}
