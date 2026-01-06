import java.util.Scanner;

public class AllArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("Welcome The All Arithmetic Calculator 😊");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The First Elements :- ");
        int a = input.nextInt();
        System.out.println("Enter The Second Elements :- ");
        int b = input.nextInt();
        System.out.println( "Addition :" + (a + b) );
        System.out.println("Subtraction :" + (a - b) );
        System.out.println("Division :" + (a / b) );
        System.out.println("Multiplication :"+(a * b) );
        System.out.println( "Modulus :" + (a % b) );
        System.out.println("Thank You ❤️");
    }
}
