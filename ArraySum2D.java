import java.util.Scanner;

public class ArraySum2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name : VIJAY SINGH SENGAR");
        System.out.println("Enrollment Number : 0873AL231026");


        int[][] array = new int[5][];
        int totalElements = 17;
        int entered = 0;
        int sum = 0;

        // Allocate columns dynamically to total 17 elements across 5 rows
        for (int i = 0; i < 5; i++) {
            int remaining = totalElements - entered;
            int size = remaining >= 4 ? 4 : remaining; // Fill with 4 elements per row if possible
            array[i] = new int[size];

            for (int j = 0; j < size; j++) {
                System.out.print("Enter element for row " + (i + 1) + ", column " + (j + 1) + ": ");
                array[i][j] = scanner.nextInt();
                sum += array[i][j];
                entered++;
            }
        }

        // Output the sum
        System.out.println("Sum of all 17 elements = " + sum);

        scanner.close();
    }
}
