import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Number Program ");
        System.out.println("Please Enter the Number : ");
        int num = input.nextInt();
        boolean output = inPalindrome(num);
        System.out.println("Your Number is " + output);

    }
    public  static  boolean inPalindrome (int num){
     int reverse = reverse(num);
     return reverse == num;
    }
    public static int reverse (int num){
        int newNum = 0 ;
        while (num > 0 ){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;

        }
        return newNum;
    }
}
