import java.util.ArrayList;
import java.util.Scanner;

public class RetrieveElement {
    public static void main(String[] args) {
        System.out.println("Name : VIJAY SINGH SENGAR");
        System.out.println("Enrollment Number : 0873AL231026");

        // Create and populate the ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        // Display the list
        System.out.println("Color List: " + colors);

        // Accept index from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter index to retrieve element (0 to " + (colors.size() - 1) + "): ");
        int index = scanner.nextInt();

        // Validate and retrieve the element
        if (index >= 0 && index < colors.size()) {
            String color = colors.get(index);
            System.out.println("Element at index " + index + " is: " + color);
        } else {
            System.out.println("Invalid index. Please enter a number between 0 and " + (colors.size() - 1));
        }

        scanner.close();
    }
}
