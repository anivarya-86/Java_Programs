import java.util.Scanner;

public class MultiplicationTableFOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplication Table using For Loop : ");
        System.out.print("Please Enter the Number to want Table : ");
        int num  = input.nextInt();
        for (int i = 1 ; i <= 10 ; i ++ ){
        System.out.println(num + " x "+ i + " is " + num * i );}
    }
}
