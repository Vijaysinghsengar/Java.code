public class LucasSeriesSum {
    public static void main(String[] args) {
        int n1 = 1, n2 = 2;
        int sum = n1 + n2;
        System.out.println("Name : VIJAY SINGH SENGAR");
        System.out.println("Enrollment Number : 0873AL231026");


        System.out.print("Lucas-like series (10 terms): ");
        System.out.print(n1 + ", " + n2);

        for (int i = 3; i <= 10; i++) {
            int next = n1 + n2;
            System.out.print(", " + next);
            sum += next;

            // Update previous two numbers
            n1 = n2;
            n2 = next;
        }

        // Output the sum
        System.out.println("\nSum of the first 10 terms: " + sum);
    }
}
