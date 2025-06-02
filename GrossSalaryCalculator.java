import java.util.Scanner;

public class GrossSalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input basic salary
        System.out.println("Name:Vijay Singh,Roll No.:0873AL231026");
        System.out.print("Enter the basic salary of the employee: ");
        double basic = scanner.nextDouble();

        double hra, da, grossSalary;

        // Calculate HRA and DA based on salary condition
        if (basic < 1500) {
            hra = 0.10 * basic;
            da = 0.90 * basic;
        } else {
            hra = 500;
            da = 0.98 * basic;
        }

        // Calculate gross salary
        grossSalary = basic + hra + da;

        // Output the result
        System.out.println("Gross Salary = Rs. " + grossSalary);

        scanner.close();
    }
}
