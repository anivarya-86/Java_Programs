import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Grade Calculator ");
        System.out.print("Please enter your percentage :");
        float marks = input.nextFloat();
        if (marks >= 90 ){
            System.out.println(marks +" Grade A (Congratulation 👍)");
        } else if (marks >= 75 ) {
            System.out.println(marks+ " Grade B");
        } else if (marks >= 60) {
            System.out.println(marks + " Grade C");
        } else if (marks >= 30 ) {
            System.out.println(marks + " Grade D ");
        }else {
            System.out.println(marks +" Sorry, You are fail and you got F");
        }
    }
}
