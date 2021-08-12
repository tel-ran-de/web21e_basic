import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        /*
        Массив - это нумерованный набор переменных одного типа

        [1,2,3,4,5]
        Переменная - элемент
        Позиция элемента в массиве - индекс
        Индексация в массиве начинается с 0

        Значения по умолчанию по типам массивов
        numeric - 0
        boolean - false
        Object - null

         */

        int[] arrayX;
//        arrayX = new int[5];

//        System.out.println( Arrays.toString( arrayX ));
//
//        arrayX[3] = 100;
//
//        System.out.println( Arrays.toString( arrayX ));
//
//        boolean[] arrayBoolean = new boolean[10];
//
//        System.out.println( Arrays.toString( arrayBoolean ));
//
//        int[] arrayDec = new int[] {1,2,3,4,5,6,7,8,9};
//        System.out.println( Arrays.toString( arrayDec ));

        arrayX = new int[] {1,2,3,4,5,6};
//        System.out.println( Arrays.toString( arrayX ));

//        System.out.println( arrayX.length );

//        System.out.println(arrayX[0]);
//        System.out.println(arrayX[1]);
//        System.out.println(arrayX[2]);
//        System.out.println(arrayX[3]);
//        System.out.println(arrayX[4]);
//        System.out.println(arrayX[5]);

//        int i = 0;
//        while (i < arrayX.length) {
//            System.out.println(arrayX[i]);
//            i++;
//        }

//        printArray(arrayX);

        /*

        i++ -> i = i + 1 ( i+=1 )
        i-- -> i = i -1 ( i-=1 )
        ++i
        --i


         */

//        System.out.println( getNum( 1 ) );

//        int i = 0;
//        System.out.println( 10 / ++i ); // NOT i++
//        System.out.println(i);

//        for (int i = arrayX.length - 1; i >=0; i--) {
//            System.out.println(arrayX[i]);
//        }

        for (double j = 1; j < 100; j+=2) {
            System.out.println( 100 / j );
        }

    }


    public static int getNum(int i) {
        return ++i;
    }


    public static void printArray(int[] printedArray) {
        int i = 0;
        System.out.println("======================================");
        while (i < printedArray.length) {
            System.out.println("Element with index " + i + " is " + printedArray[i]);
            i++;
        }
        System.out.println("======================================");
        System.out.println("Total elements - " + printedArray.length);
    }

}
