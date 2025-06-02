import java.util.ArrayList;

public class InsertAtFirst {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        System.out.println("Name : VIJAY SINGH SENGAR");
        System.out.println("Enrollment Number : 0873AL231026");

        ArrayList<String> items = new ArrayList<>();
        items.add("Banana");
        items.add("Mango");
        items.add("Apple");

        // Display the original list
        System.out.println("Original List:");
        System.out.println(items);

        // Insert element at the first position
        items.add(0, "Orange");

        // Display the updated list
        System.out.println("\nList after inserting 'Orange' at the first position:");
        System.out.println(items);
    }
}
