import java.util.Scanner;

public class AreaOFTriangle {
    public static void main(String[] args) {
        System.out.println("welcome to Triangle Area Calculator ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Height of Triangle:");
        double height = input .nextDouble();
        System.out.println("Enter the Base of Triangle:");
        double base = input .nextDouble();
        double area = 0.5 * base * height ;
        System.out.println("Your Triangle Area is : " + area + "cm." );

    }
}
