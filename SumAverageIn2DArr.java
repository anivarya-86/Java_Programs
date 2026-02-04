import static java.lang.Long.sum;

public class SumAverageIn2DArr {
  public static void main(String[] args) {
      System.out.println("Welcome to 2D Array Sum and Average Program ");
      int[][] numArr = ArrayUtility.input2DArray();
      long sum = Sum(numArr);
      double average = average(numArr);
      System.out.println("Your 2D Array's Sum is : " + sum);
      System.out.println("Your 2D Array's  Average is : "+ average);
    }
    public static long Sum (int [][] numArr){
     long sum = 0 ;
     int i = 0 ;
     while ( i < numArr.length){
         int j = 0 ;
         while (j < numArr[i].length){
             sum +=  numArr[i][j];
             j++;
         }
        i++;
     }

      return sum;
    }
    public static double average (int [][] numArr){
       if (numArr.length == 0 ){
           return 0;
       }
       int rows = numArr.length;
       int cols = numArr[0].length;
       double size = rows * cols;
       return Sum(numArr)/size;

    }

}
