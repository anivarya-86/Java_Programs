public class PalindromeArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Array Program");


        int[] numArr = ArrayUtility.inputArray();


        boolean isPalin = isPalindrome(numArr);

        if (isPalin) {
            System.out.println("Yeh Array Palindrome HAI ✅");
        } else {
            System.out.println("Yeh Array Palindrome NAHI hai ❌");
        }
    }

    public static boolean isPalindrome(int[] numArr) {
        int i = 0;
        int j = numArr.length - 1;

        while (i <= j) {

            if (numArr[i] != numArr[j]) {
                return false;
            }
            i++;
            j--;
        }

        return true; 
    }
}