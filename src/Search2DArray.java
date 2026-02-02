import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to 2D Search\n");
        int[][] numArr = ArrayUtility.input2DArray();
        System.out.print("Enter the element to find in the Array:");
        int num = input.nextInt();
        boolean search = search(numArr , num );
        if (search){
            System.out.println("Your Element was Found");
        }else {
            System.out.println("Your Element was not Found ");
        }
    }
    public static boolean search (int [][] numArr , int num ){
        int i = 0 ;
        while (i < numArr.length){
            int j = 0 ;
            while (j < numArr.length){
                if (numArr[i][j] == num ){
                    return  true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
