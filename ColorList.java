import java.util.ArrayList;

public class ColorList {
    public static void main(String[] args) {
        System.out.println("Name : VIJAY SINGH SENGAR");
        System.out.println("Enrollment Number : 0873AL231026");

        // Create an ArrayList to store color names
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the list
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        // Print the ArrayList
        System.out.println("List of Colors:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
