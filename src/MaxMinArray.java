import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Max and Min \n");
        int [] numArr = ArrayUtility.inputArray(); // These are File Code in ArrayUtility.java .
        System.out.println("Your Maximum Number is: " + max(numArr));
        System.out.println("Your Minimum Number is: " + min(numArr));
    }
      public static int max ( int [] numArr){
        if (numArr.length == 0 ){
            return Integer.MIN_VALUE;
        }
        int max = numArr[0];
        int i = 1 ;
        while ( i < numArr.length){
            if (max < numArr[i] ){
                max = numArr[i];
            }
            i++;
        }
        return max;
      }
      public static int min (int [] numArr){
        int min = Integer.MAX_VALUE;
        int i = 0 ;
        while (i < numArr.length){
            if (min > numArr[i]){
                min = numArr[i];
            }
            i++;
            }
        return min;
        }

 }

