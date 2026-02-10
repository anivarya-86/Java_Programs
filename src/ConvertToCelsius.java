import java.util.Scanner;

public class ConvertToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Temperature Converter🌤️ ");
        System.out.println("Please Enter Fahrenheit :");
        float fahrenheit = input.nextFloat();
        float Celsius = (fahrenheit-32) * 5.0f / 9.0f ;
        System.out.println("Your Temperature is : " + Celsius +"c");
    }

}
