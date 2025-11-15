import java.util.Scanner;

public class MaxOccurringChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");V
        String str = sc.nextLine();

        int[] count = new int[256];   // ASCII size
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        int max = 0;
        char ans = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] > max) {
                max = count[str.charAt(i)];
                ans = str.charAt(i);
            }
        }

        System.out.println("Maximum occurring character: " + ans);
        sc.close();
    }
}
