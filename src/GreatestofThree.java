import java.util.Scanner;

public class GreatestofThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Greatest Number Checker ");
        System.out.print("Enter the First Numbers :");
        int num1 = input.nextInt();
        System.out.print("Enter the Second Numbers :");
        int num2 = input.nextInt();
        System.out.print("Enter the Third Numbers :");
        int num3 = input.nextInt();
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + "  First Number is Big. ");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 +"  Second Number is Big.");

        } else System.out.println(num3 + "   Third Number is Big.");
    }
}