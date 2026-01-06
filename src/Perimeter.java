import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Perimeter Calculator 👍: " );
        System.out.println("Enter the all 4 Side in Cm :");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        System.out.println( "Your Perimeter of Your rectangle is : " +(a + b + c + d) +"cm" );
    }
}
