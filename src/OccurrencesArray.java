import java.util.Scanner;

public class OccurrencesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Occurrences \n ");
        int [] numArr = ArrayUtility.inputArray();
        System.out.println("Now Enter the Number You want to Find : ");
        int num = input.nextInt();
        int Occurrences = noOfOccurrences(numArr , num);
        System.out.println("Your element was found " + Occurrences + " Times in the array ");
    }
     public static int noOfOccurrences(int [] numArr , int num ){
      int occ = 0 ;
      int i = 0 ;
      while (i < numArr.length){
          if (numArr[i] == num){
              occ++;
          }
          i++;
      }
        return occ;
     }
}
