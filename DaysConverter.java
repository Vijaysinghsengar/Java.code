import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of days
        System.out.print("Name:Vijay Singh,Roll No.:0873AL231026 ");
        System.out.print("Enter total number of days: ");
        int totalDays = scanner.nextInt();

        // Convert days to years, months, and days
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;

        int months = remainingDays / 30;
        int days = remainingDays % 30;

        // Display result
        System.out.println("Equivalent time:");
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);

        scanner.close();
    }
}
