import java.util.Scanner;

public class StudentScoreTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Student Score Ternary Calculator");
        System.out.print("Please Enter the Your marks : ");
        int marks = input.nextInt();
        String result = marks > 80 ? "High" : (marks > 50 ? "Mid" : "Low");
        System.out.println("Your category is " + result);
    }
}
