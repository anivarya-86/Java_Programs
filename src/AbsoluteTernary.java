import java.util.Scanner;

public class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to AbsoluteTernary Calculator");
        System.out.print("Please Enter the Number : ");
        int number = input.nextInt();
        int result = number >= 0 ?  number : -number;
        System.out.println("Your Result is " + result);
    }
}
