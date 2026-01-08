import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number Checker :" );
        System.out.print("Enter Your Number :");
        int num = input.nextInt();
        if (num> 0 ) {
            System.out.println("This is Positive Number. ");
        }
        else if (num==0) {
            System.out.println("This is Number Zero.");
        }
            else  {
                System.out.println("This is Negative Number. ");
}
        }

        }


