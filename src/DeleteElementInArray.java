import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Element Deleter");

        // 1. Array Input liya
        int[] numArr = ArrayUtility.inputArray();

        System.out.print("Enter the number you want to delete: ");
        int numberToDelete = input.nextInt();

        // 2. Naya Array banaya
        int[] newArr = deleteNumber(numArr, numberToDelete);

        System.out.println("Here is your new array:");
        // Print karne ke liye loop ya Arrays.toString use karein
        for(int num : newArr){
            System.out.print(num + " ");
        }
    }

    public static int[] deleteNumber(int[] numArr, int numberToDelete) {
        // Step 1: Occurrences count karo (Tumhara purana code reuse kar sakte ho!)
        int occ = OccurrencesArray.noOfOccurrences(numArr, numberToDelete); // Agar class public hai to call kar lo

        // Ya manually count kar lo agar wo file link nahi hai
        if (occ == 0) {
            return numArr; // Agar number hai hi nahi, to wahi wapas kar do
        }

        // Step 2: Naya size
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];

        // Step 3: Copy only non-target elements
        int i = 0, j = 0;
        while (i < numArr.length) {
            if (numArr[i] != numberToDelete) {
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}