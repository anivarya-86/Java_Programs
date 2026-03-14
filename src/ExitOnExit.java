import java.util.Scanner;

public class ExitOnExit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Enter Your Command: ");
            String command = input.next();
            if (command.equals("exit") ){
                break;
            }
        }
        System.out.println("You have successfully exited.");
    }
}
