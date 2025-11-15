import java.util.Scanner;

public class DivisionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int numerator = sc.nextInt();  // Taking numerator input

            System.out.print("Enter denominator: ");
            int denominator = sc.nextInt();  // Taking denominator input

            int result = numerator / denominator; // May throw ArithmeticException
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (Exception e) {
            System.out.println("Error: Invalid input!");
        } finally {
            System.out.println("Program execution completed.");
            sc.close(); // Closing the Scanner
        }
    }
}