import java.util.Scanner;

public class FirstNonRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] count = new int[256]; // ASCII size

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        // Find first non-repeating character
        char result = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                result = str.charAt(i);
                break;
            }
        }

        if (result == ' ')
            System.out.println("No non-repeating character found.");
        else
            System.out.println("First non-repeating character: " + result);

        sc.close();
    }
}

