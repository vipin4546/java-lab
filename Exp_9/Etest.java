package Exp_9;

public class Etest {
    public static void main(String[] args) {
        
        Eex obj = new Eex();
        obj.dividebyzero(10, 0);
        int[] arr = {1,2,3,4,5};
        obj.arrayaccess(arr, 5);
    
    }   
}

class Eex{
    void dividebyzero( int a, int b ){
        try {
            int data = a / b; 
            System.out.println(data);
        } catch (ArithmeticException e) {
            System.out.println("can not divide by zero ");
        } 
    }
    void arrayaccess(int[] arr, int i){
        try {
            System.out.println(arr[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is not found");
        } 
        }
 voi

}


















