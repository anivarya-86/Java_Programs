import java.util.Scanner;

public class OccurrencesForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Occurrence Using For Each");
        int [] arr = ArrayUtility.inputArray();
        System.out.println("Please Enter the number want to find : ");
        int find = input.nextInt();
        int occ = ofOccurrence(arr , find);
        System.out.println("Your element was found :" + occ + " times");
    }
    public static int ofOccurrence(int []arr , int find ){
        int occ = 0;
        for (int num : arr){
            if (num == find){
                occ++;
            }

        }
        return occ;

    }
}
