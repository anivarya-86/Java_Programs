public class DiagonalSum2DArray {
  public static void main(String[] args) {
      System.out.println("Welcome to Diagonal Sum ");
      int [][] numArr = ArrayUtility.input2DArray();
      long sum = sumofDiagonals(numArr);
      System.out.println("Sum of Diagonals is: "+ sum);
  }
  public static long sumofDiagonals(int [][] numArr){
      long leftSum = sumofLeftDiagonals(numArr);
      long rightSum = sumofRightDiagonals(numArr);
      long sum = leftSum + rightSum;
      if (numArr.length % 2 != 0){
          int ind = numArr.length/2;
      }
      return sum;
  }
    public static long sumofLeftDiagonals(int [][] numArr) {
      long sum = 0;
      int i = 0 ;
      while (i < numArr.length){
          sum += numArr[i][i];
          i++;
      }
        return sum;
    }
    public static long sumofRightDiagonals(int [][] numArr) {
      long sum = 0 ;
      int i = 0 ;
      while (i < numArr.length){
      int col = numArr.length - 1 - i ;
          sum += numArr[i][col];
          i++;
}
        return sum;
    }
}
