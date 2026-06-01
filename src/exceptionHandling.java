package again;

import java.util.Scanner;

public class exceptionHandling {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Exception Handling");
        System.out.print("Please Enter the first number: ");
        int first = input.nextInt(); // Naming standard: small case variables
        System.out.print("Now, Enter Second Number: ");
        int second = input.nextInt();

        try {
            int divide = first / second;
            System.out.printf("Result is %d\n", divide);
        } catch (ArithmeticException exception) {
            if (exception.getMessage().equals("/ by zero")) {
                System.out.println("❌ Error: Divide by Zero Occurred. You cannot divide a number by 0.");
            } else {
                throw exception;
            }
        }
    }
}