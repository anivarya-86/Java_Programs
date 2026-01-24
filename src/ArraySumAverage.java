
public class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to Array sum and average");
        int [] numArr = ArrayUtility.inputArray(); // These is file ArrayUtility.java 
        long sum = sum(numArr);
        double average = average(numArr);
        System.out.println("Your Array Sum is " + sum);
        System.out.println("Your Array Average is " + average);

        }
         public static long sum(int[] numArr){
        long sum = 0 ;
        int i = 0;
        while ( i < numArr.length) {
            sum += numArr[i];
            i++;
        }
        return sum ;
         }
         public static int average (int [] numArr) {
        double sum = sum(numArr);
        return (int) (sum / numArr.length);


         }
    }




