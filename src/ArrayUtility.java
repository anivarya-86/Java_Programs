import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number of Element: ");
        int index = input.nextInt();
        int[] myArr = new int[index];
        int i = 0;
        while (i < index) {
            System.out.print("Please enter element no " + (i + 1) + ": ");
            myArr[i] = input.nextInt();
            i++;
        }
        return myArr;
    }
}
