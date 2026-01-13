import java.util.Scanner;

public class BitwiseEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd/Even Calculator");
        System.out.print("Enter the Number : ");
       int num1 = input.nextInt();
       if ((num1 & 1) == 1 ){
           System.out.println("Number is Odd");

       }else {
           System.out.println("Number is Even");
       }
    }
}
