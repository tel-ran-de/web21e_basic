package loops;

public class App {
    public static void main(String[] args) {
        /*
         for с параметром

         for (int i = 0; condition with "i"; change "i") {
            actions
         }



         for each -> цикл для массива

         while

         while (condition) {
            actions
         }

         do-while

         do {
            actions
        } while (condition)

         */

//        int bottle = 0;
//        while (bottle > 0) {
//            bottle -= 100;
//            System.out.println("Выпиваем стакан сока");
//        }
//        System.out.println( "Сок закончился!!! Пора в магазин." );

//        int number = 15;
//        do {
//            System.out.println(number);
//            number -= 2;
//        } while ( number > 25 );

        // Есть произвольное положительное число. Вычислить сумму цифр его составляющих

//        int number = -5937;
//        int result = 0;
////        int result = number/10 + number % 10;
//        while ( number != 0 ) {
//            result += number % 10;
//            number /= 10;
//        }
//
//
//
//        System.out.println( result );

//        int number = 5937;
//        int result = 0;
////        int result = number/10 + number % 10;
//        while ( number != 0 ) {
//            result = result * 10  + number % 10;
//            number /= 10;
//        }
//
//        System.out.println( result );

//        for (int i = 0; i < 10; i++) {
//            System.out.println( i*i );
//        }

//        for (int i = 0; i <= 15; i+=3) {
//            System.out.println(i);
//        }

//        for (int i = 15; i >= 0 ; i-=3) {
//            System.out.println(i);
//        }

//        int i = 15;
//        for (; i >= 0;) {
//            System.out.println( i );
//            i -=3;
//        }

//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                System.out.printf("%d\t", i*j);
//            }
//            System.out.println();
//        }

        int[][] array = {{2,4,6}, {3,7,4}, {9,0,3}};
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            System.out.println( sum );
        }

        if (1==0)
            System.out.println("Uppps");
        System.out.println("120");
    }
}
