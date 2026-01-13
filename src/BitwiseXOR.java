import java.util.Scanner;
public class BitwiseXOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise XOR Operator\n");
        System.out.print("Please Enter the First Number:");
        int first = input.nextInt();
        System.out.print("Enter the Second Number:");
        int second = input.nextInt();
        int AND = first ^ second;
        System.out.println("XOR Operator is : " + AND);
    }
}