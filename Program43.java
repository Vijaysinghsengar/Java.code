import java.util.ArrayList;
import java.util.Arrays;

class Program43 {
    public static void main(String[] args) {
        System.out.println("Program by Vijay Singh, Roll No: 0873AL231026");
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        String element = "Banana";
        System.out.println("Found: " + list.contains(element));
    }
}
