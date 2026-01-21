import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Fibonacci Series Program");
        System.out.print("Please Enter the Digits :");
        int digit = input.nextInt();
        System.out.println("Here is the Fibonacci Series : ");
        printFibonacci(digit);

    }
    public static void printFibonacci(int digit){
        if (digit < 0 ) return;
        System.out.print("0");
        if (digit == 0)
            System.out.println("1");
         int first = 0 , second = 1;
         while (first + second <= digit) {
             int third = first + second;
             System.out.print(third + " ");
             first = second;
             second = third;
         }
    }
}
