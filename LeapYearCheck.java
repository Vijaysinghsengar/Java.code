import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input year from user
        System.out.println("Name:Vijay Singh,Roll No.:0873AL231026");
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check for leap year
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        scanner.close();
    }
}
