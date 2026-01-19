import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LCM");

        System.out.println("Please Enter the first Number : ");
        int first = input.nextInt();

        System.out.println("Please Enter The Second Number : ");
        int second = input.nextInt();

        int lcm = lcm(first, second);
        System.out.println("LCM of the Two Numbers is : " + lcm);
    }
    public static int lcm(int first, int second) {
        if (first == 0 || second == 0) return 0;

        int i = 1;
        while (true) {
            int factor = first * i;
            if (factor % second == 0) {
                return factor;
            }

            i++;
        }
    }
}