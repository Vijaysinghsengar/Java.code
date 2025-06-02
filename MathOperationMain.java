import java.util.Scanner;
import MathOperationMain;

class MathOperation {
    // Data members
    double X, Y, R;

    // Method to input X and Y
    void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name : VIJAY SINGH SENGAR");
        System.out.println("Enrollment Number : 0873AL231026");

        System.out.print("Enter value for X: ");
        X = scanner.nextDouble();
        System.out.print("Enter value for Y: ");
        Y = scanner.nextDouble();
    }

    // Method to add X and Y
    void add() {
        R = X + Y;
    }

    // Method to multiply X and Y
    void multiply() {
        R = X * Y;
    }

    // Method to calculate X raised to power Y
    void power() {
        R = Math.pow(X, Y);
    }

    // Method to display result
    void display() {
        System.out.println("Result (R) = " + R);
    }
}

// Main class to test MathOperation
public class MathOperationMain {
    public static void main(String[] args) {
        MathOperation m = new MathOperation();
        m.init();

        m.add();
        System.out.print("Addition: ");
        m.display();

        m.multiply();
        System.out.print("Multiplication: ");
        m.display();

        m.power();
        System.out.print("Power (X^Y): ");
        m.display();
    }
}

