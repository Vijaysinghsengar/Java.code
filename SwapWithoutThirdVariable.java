
import java.util.Scanner;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Name:Vijay Singh,Roll No.:0873AL231026: ");
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        // Swapping without using third variable
        a = a + b;
        b = a - b;
        a = a - b;

        // Output the result
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        scanner.close();
    }
}
