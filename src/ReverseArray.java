import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Reversal\n");

        // 1. Standard way to get input (replacing ArrayUtility)
        int[] numArr = inputArray();

        System.out.println("Original Array: " + Arrays.toString(numArr));

        // 2. CRITICAL FIX: You must call the reverse method here
        reverse(numArr);

        // 3. Print the result after the reversal
        System.out.println("Your reversed array is: " + Arrays.toString(numArr));
    }

    public static void reverse(int[] arr) {
        int i = 0;
        // Loop runs until the middle of the array
        while (i < arr.length / 2) {
            // Swap element at i with element at (length - 1 - i)
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = swap;
            i++;
        }
    }

    // Helper method to handle input (Replacing your ArrayUtility)
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of elements: ");
        int size = input.nextInt();
        int[] nums = new int[size];

        System.out.println("Please enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            nums[i] = input.nextInt();
        }
        return nums;
    }
}