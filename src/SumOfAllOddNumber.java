import java.util.Scanner;

public class SumOfAllOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to All Odd Number Calculator ");
        System.out.print("Please Enter Your odd number: ");
        int num = input.nextInt();

        // Yahan humne IF condition lagayi hai check karne ke liye
        if (num % 2 == 0) {
            // Agar number 2 se poora divide ho gaya (Even hai)
            System.out.println("Wrong: You enter even number (" + num + ").");
            System.out.println("Please Enter Odd Number Only.");
        } else {
            // Agar number Odd hai, tabhi calculation hogi
            int sum = sumOfAllOddNumbers(num);
            System.out.println("OddSum till " + num + " is " + sum);
        }
    }

    public static int sumOfAllOddNumbers(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;
            i += 2;
        }
        return sum;
    }
}