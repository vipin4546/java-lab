
import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("1");
            
        }
        else{
            System.out.println("0");
        }

    }
    
}
