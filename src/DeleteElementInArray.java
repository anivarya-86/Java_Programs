import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Element Deleter");
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Enter the number you want to delete: ");
        int numberToDelete = input.nextInt();
        int[] newArr = deleteNumber(numArr, numberToDelete);

        System.out.println("Here is your new array:");
        for(int num : newArr){
            System.out.print(num + " ");
        }
    }

    public static int[] deleteNumber(int[] numArr, int numberToDelete) {
        int occ = OccurrencesArray.noOfOccurrences(numArr, numberToDelete); 

        if (occ == 0) {
            return numArr; 
        }

        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];

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
