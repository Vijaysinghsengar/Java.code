import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.println("Name:Vijay Singh,Roll No.:0873AL231026");
        System.out.print("Enter a number to print its table: ");
        int number = scanner.nextInt();

        // Print multiplication table up to 10
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
