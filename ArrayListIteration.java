import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {
    public static void main(String[] args) {
        System.out.println("Name : VIJAY SINGH SENGAR");
        System.out.println("Enrollment Number : 0873AL231026");

        // Create and populate the ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        // 1. Using for-each loop
        System.out.println("Using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 2. Using classic for loop
        System.out.println("\nUsing classic for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // 3. Using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 4. Using forEach() method (Java 8+)
        System.out.println("\nUsing forEach() method:");
        fruits.forEach(System.out::println);
    }
}
