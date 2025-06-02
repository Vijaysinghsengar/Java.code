import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature in Fahrenheit
        System.out.print("Name:Vijay Singh,Roll No.:0873AL231026");
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert to Celsius
        double celsius = 5 * (fahrenheit - 32) / 9;

        // Display result
        System.out.printf("Temperature in Celsius: %.2f\n", celsius);

        scanner.close();
    }
}
