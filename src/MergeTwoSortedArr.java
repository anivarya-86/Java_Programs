import java.util.Arrays;

public class MergeTwoSortedArr {
    public static void main(String[] args) {
        System.out.println("Welcome to Merge Two Sorted Arrays Program");

        int[] numArr1 = ArrayUtility.inputArray();
        int[] numArr2 = ArrayUtility.inputArray();

        int[] sortedArr = merge(numArr1, numArr2);
        System.out.println("Merged Sorted Array is:");
        System.out.println(Arrays.toString(sortedArr));
    }

    public static int[] merge(int[] numArr1, int[] numArr2) {

        int newSize = numArr1.length + numArr2.length;
        int[] newArr = new int[newSize];

        int i = 0; // Pointer for 1st Array
        int j = 0; // Pointer for 2nd Array
        int k = 0; // Pointer for New (Result) Array

        // Step 2: Main Comparison Loop
        while (i < numArr1.length && j < numArr2.length) {
            if (numArr1[i] < numArr2[j]) {
                newArr[k] = numArr1[i];
                i++;
            } else {
                newArr[k] = numArr2[j];
                j++;
            }
            k++;
        }

        while (i < numArr1.length) {
            newArr[k] = numArr1[i];
            i++;
            k++;
        }

        while (j < numArr2.length) {
            newArr[k] = numArr2[j];
            j++;
            k++;
        }

        return newArr;
    }
}