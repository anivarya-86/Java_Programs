import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to OddEven Number Checker :");
        System.out.print("Enter the Number : ");
        int num = input.nextInt();
        if (num %2 == 0 ) {
            System.out.println("This is an Even Number");
        } else {
            System.out.println("This is a Odd Number");

        }


    }
}
