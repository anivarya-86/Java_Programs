import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime Number Checker : ");

        System.out.println("Please Enter the  Number : ");
        int first = input.nextInt();
        boolean isPrime = isPrime(first);
        if (isPrime){
            System.out.println("Your Number is Prime ");
        }else {
            System.out.println("Number is not Prime");
        }
    }
    public static boolean isPrime(int first){
        int i = 2;
        while (i < first){
            if (first % i == 0 ){
                return false;
            }
            i++;
        }
        return true;
    }

}
