import java.util.Scanner;

public class TableProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplication World");
        System.out.print("Please Enter the Number : ");
        int num = input.nextInt();
        printMultiplicationTable(num);

    }

    public static void printMultiplicationTable(int num ){
    int i = 1;
    while (i<= 10) {
        System.out.println(num + "x" + i +  "=" + (num*i));
        i++;
    }
    }

}
