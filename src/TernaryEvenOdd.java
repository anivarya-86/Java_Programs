import java.util.Scanner;

public class TernaryEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Ternary Even Odd Calculator");
        System.out.print("Please Enter Number :");
        int num = input.nextInt();
        String result = num % 2 == 0 ? "Even" : "Odd" ;
        System.out.println("Your Number is " + result);

    }


}
