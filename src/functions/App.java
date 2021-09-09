package functions;

import java.util.Arrays;
import java.util.Locale;

public class App {
    public static final double PI = 3.14;
    public static void main(String[] args) {
        // Посчитать и вывести на консоль квадраты чисел от 1 до 10

        // DRY

//        for (int i = 1; i < 10; i++) {
//            System.out.println( i*i );
//        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

//        printSquareNumbers(a, b, true);
//
//        System.out.println( PI );

        int[] array = {10,20,30,40,50};
        getAndPrintSquareArray( array );

        System.out.println(Arrays.toString(array));

//        System.out.println( getSquareOfNumber(5) );
//        printNumber(100500);

        String person = "Igors";
        System.out.printf("Hello, %s!\n", person);
        System.out.println( "Hello, " + person + "!" );
        String[] words = {"mama", "papa", "me"};
        System.out.printf("Hello, %s\n", words[2]);

        String phrase = String.format( "Hello, %s", person );
        System.out.println( phrase );

    }


    public static void getAndPrintSquareArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= array[i];
            System.out.printf("%d ",array[i]);// %f %.2f 100.10, %s
        }
        System.out.println();
    }


    private static void printSquareNumbers(int a, int b, boolean isTrue) {
        for (int i = a; i < b; i++) {
            int square = getSquareOfNumber(i);
            printNumber( square );
            a*=10;
        }
    }

    private static void printNumber(int integerNumber) {
        System.out.println( "Какое замечательное число " +integerNumber );
    }

    private static int getSquareOfNumber(int i) {
        return i*i;
    }


}
