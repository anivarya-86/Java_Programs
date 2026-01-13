import java.util.Scanner;

public class BitwiseNOT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise NOT Operator ");
        System.out.print("Please Enter a number : ");
        int num = input.nextInt();
        int Result =  ~num; // Complement= NOT Operator
        System.out.println("NOT Operator is " + Result);
    }
}
