public class Palindrome {
    public static void main(String[] args) {
        int [] array1 = new int[] {1,2,3,4,5,4,3,2,1}; // Yes
        int [] array2 = new int[] {1,2,3,4,5,6,4,3,2,1}; // No
        isPalindrome(array1);
        isPalindrome(array2);
    }

    private static void isPalindrome(int[] array) {
        boolean isPal = true;
        for (int i = 0; i <= array.length  / 2; i++) {
            if ( array[i] != array[ array.length - 1 - i]) {
                isPal = false;
                break;
            }
        }

//        System.out.println( isPal ? "Palindrome" : "Not Palindrome" );
        String result = isPal ? "Palindrome" : "Not Palindrome";
        System.out.println( result );
    }

    public static String isPositive(int number) {
        return (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Is 0";
    }

}
