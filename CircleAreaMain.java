import java.util.Scanner;

class Circle {
    // Data members
    double radius;
    double area;

    // Method to initialize radius
    void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name : VIJAY SINGH SENGAR");
        System.out.println("Enrollment Number : 0873AL231026");

        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();
    }

    // Method to calculate area
    void calc() {
        area = Math.PI * radius * radius;
    }

    // Method to display area
    void display() {
        System.out.println("Area of the circle = " + area);
    }
}

// Main class to use Circle
public class CircleAreaMain {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.init();    // Input radius
        c.calc();    // Calculate area
        c.display(); // Display result
    }
}
