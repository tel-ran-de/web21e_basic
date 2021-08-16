import java.util.Arrays;
import java.util.Random;

public class ClassWork {
    public static void main(String[] args) {
//        Random rnd = new Random();
//        int i = rnd.nextInt(100);
//        System.out.println( i );
//
//        int[] array = new int[rnd.nextInt(50)];
//        for (int j = 0; j < array.length; j++) {
//            array[j] = rnd.nextInt();
//        }
//
//        System.out.println(Arrays.toString(array));

        int [] integerArray = getArray();
        printArray(integerArray);
        System.out.println(getSum(integerArray));

    }

    public static int[] getArray() {
        Random rnd = new Random();
        int i;
        do {
           i = rnd.nextInt(25);
        } while (i < 2);
        int[] array = new int[i];
        for (int j = 0; j < array.length; j++) {
            array[j] = rnd.nextInt(50);
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println("==================");
        for (int i: array) {
            System.out.print(i + "\t");
        }
        System.out.println("\n==================");
    }

    public static int getSum(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i += 2) {
            result += array[i];
        }
        return result;


    }
}
