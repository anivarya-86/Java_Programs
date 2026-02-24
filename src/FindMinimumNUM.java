import java.util.Scanner;

public class FindMinimumNUM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Minimum number Calculator");
        System.out.print("Please Enter the 1st number:");
        int firstNumber = input.nextInt();
        System.out.print("Enter 2nd number:");
        int secondNumber = input.nextInt();
       int result = ternary(firstNumber, secondNumber);
        System.out.println("Your Minimum Number : " + result );
    }
    public static int ternary(int first, int second){
        return first < second ? first : second;
      /*  if (first > second){

            return second;
        }
        else {
            return first;
        }*/
    }
}
