
import java.util.ArrayList;
import java.util.Scanner;

public class UpdateElement {
    public static void main(String[] args) {
        // Create and populate the ArrayList
        System.out.println("Name : VIJAY SINGH SENGAR");
        System.out.println("Enrollment Number : 0873AL231026");

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        // Display the original list
        System.out.println("Original List: " + colors);

        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to be replaced: ");
        String oldColor = scanner.nextLine();

        System.out.print("Enter the new element: ");
        String newColor = scanner.nextLine();

        // Check and update
        if (colors.contains(oldColor)) {
            int index = colors.indexOf(oldColor);
            colors.set(index, newColor);
            System.out.println("Updated List: " + colors);
        } else {
            System.out.println("Element '" + oldColor + "' not found in the list.");
        }

        scanner.close();
    }
}
