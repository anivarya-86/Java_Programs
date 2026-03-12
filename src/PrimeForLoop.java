import java.util.Scanner;

public class PrimeForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome Prime Number using For loop : ");
        System.out.print("Please Enter the number : ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        if (isPrime){
            System.out.println("Your number is Prime");
        }
        else {
            System.out.println("Your Number is Not Prime");
        }
    }
    public static  boolean isPrime(int num){
        for (int i = 2 ; i < num ; i ++){
            if (num % i == 0){
                return false;
            }
        }
        return true;

    }
}
