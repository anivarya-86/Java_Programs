import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Simple Interest Calculator\n");
        System.out.print("Please enter your principle amount Rs:");
        int principle = input.nextInt();
        System.out.print("Now, Tell me your rate of interest :"+ "%");
        float rate = input.nextFloat();
        System.out.print("Now, Tell me for how many years are you borrowing this money:" );
        float time = input.nextFloat();
        double interest = (principle*rate*time)/100; //Interest Formula is :- (P*R*T)/100
        System.out.println("Your Simple interest is Rs:" + interest);


    }
}
