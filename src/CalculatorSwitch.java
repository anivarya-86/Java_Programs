import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Mini Calculator ");
        System.out.print("Please enter the number : ");
       double firstNum = input.nextDouble();
        System.out.print("Again enter number :");
        double secondNum =input.nextDouble();
        System.out.println("Please Enter the Operator : (+ , - , * , / , % )");
        char operator = input.next().charAt(0);
        double result;



        switch (operator){
            case '+':
                result = firstNum + secondNum;
                System.out.println("Result = " + result);
                break;
            case '-':
                result = firstNum - secondNum;
                System.out.println("Result = " + result);
                break;
            case '*':
                result = firstNum * secondNum;
                System.out.println("Result = " + result);
                break;
            case '/':
                result = firstNum / secondNum;
                System.out.println("Result = " + result);
                break;
            case '%':
                result = firstNum % secondNum;
                System.out.println("Result = " + result);
                break;
        }


    }

}
