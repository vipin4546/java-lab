import java.util.Scanner;

public class ThreeInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        System.out.print("Enter third number: ");
        int third = sc.nextInt();

        // Input abc flag
        System.out.print("Enter true/false for abc: ");
        boolean abc = sc.nextBoolean();

        // Logic
        boolean result;
        if (abc) {
            result = (third > second);  // Ignore first check
        } else {
            result = (second > first && third > second);
        }

        // Output
        System.out.println("Result: " + result);

        sc.close();
    }
}
