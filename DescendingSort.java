import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class DescendingSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] arr = new Integer[10];  // Use Integer instead of int for reverse sorting

        // Input 10 elements
        System.out.println("Name : VIJAY SINGH SENGAR");
        System.out.println("Enrollment Number : 0873AL231026");

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Sort array in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        // Display sorted array
        System.out.println("Array in descending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
