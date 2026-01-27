public class InSortedArray {
     public static void main(String[] args) {
         System.out.println("Welcome to Array Sorting Check post \n");
         int[] numArr = ArrayUtility.inputArray();
         boolean Decrease = isDecreasing(numArr);
         boolean Increase = isIncreasing(numArr);
         if (Decrease || Increase){
             System.out.println("Array are Sorted ");
         }else {
             System.out.println("Array are not Sorted");
         }

     }
     public static boolean isDecreasing (int[] numArr){
     int i = 1;
     while (i < numArr.length){
         if (numArr[i] > numArr[i-1]){
             return false;
         }

         i++;
     }
      return true;
     }
     public static boolean isIncreasing ( int [] numArr) {
         int i = 1;
         while (i < numArr.length){
             if (numArr[i] < numArr[i-1]){
                 return false;
             }

             i++;
         }
         return true;
     }
}
