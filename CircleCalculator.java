import java.util.Scanner;

public class CircleCalculator {
    //Name:Vijay Singh,Roll No.:0873AL231026
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input radius
        System.out.print("Name:Vijay Singh,Roll No.:0873AL231026 ");

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate area and circumference
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        // Display results
        System.out.printf("Area of the circle: %.2f\n", area);
        System.out.printf("Circumference of the circle: %.2f\n", circumference);

        scanner.close();
    }
}
