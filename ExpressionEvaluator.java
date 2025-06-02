import java.util.Scanner;

public class ExpressionEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part (a)
        System.out.println("Name:Vijay Singh,Roll No.:0873AL231026");
        System.out.println("Part (a): y = x^2 + 3x - 7");
        System.out.print("Enter value of x: ");
        int x = scanner.nextInt();
        int y = x * x + 3 * x - 7;
        System.out.println("Value of y = " + y);

        // Part (b)
        System.out.println("\nPart (b): y = x++ + ++x");
        System.out.print("Enter value of x: ");
        x = scanner.nextInt();
        y = x++ + ++x;
        System.out.println("Value of x = " + x);
        System.out.println("Value of y = " + y);

        // Part (c)
        System.out.println("\nPart (c): z = x++ - --y - --x + x++");
        System.out.print("Enter value of x: ");
        x = scanner.nextInt();
        System.out.print("Enter value of y: ");
        y = scanner.nextInt();
        int z = x++ - --y - --x + x++;
        System.out.println("Value of x = " + x);
        System.out.println("Value of y = " + y);
        System.out.println("Value of z = " + z);

        // Part (d)
        System.out.println("\nPart (d): z = x && y || !(x || y)");
        System.out.print("Enter boolean value of x (true/false): ");
        boolean bx = scanner.nextBoolean();
        System.out.print("Enter boolean value of y (true/false): ");
        boolean by = scanner.nextBoolean();
        boolean bz = (bx && by) || !(bx || by);
        System.out.println("Value of z = " + bz);

        scanner.close();
    }
}