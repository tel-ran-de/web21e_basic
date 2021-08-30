package HomeWorkSolution;

import java.util.Arrays;
import java.util.Random;

public class HomeWork {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] intArray = new int[rand.nextInt(5)+3][rand.nextInt(5)+3];
        int x = rand.nextInt(intArray.length);
        int x1 = rand.nextInt(intArray.length);
        int y = rand.nextInt(intArray[0].length);
        int y1 = rand.nextInt(intArray[0].length);

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = rand.nextInt(30);
            }
        }

        // 1. Составить программу расчета разности двух любых элементов двумерного массива
        System.out.println("Ex. 1");
        getResultNumOne(intArray, x, y, x1,y1);
        System.out.println("=================");

        // 2. Дан двумерный массив целых чисел. Выяснить имеются ли числа кратные 5 в произвольной строке этого массива
        System.out.println("Ex. 2");
        int row = rand.nextInt(intArray.length);
        System.out.println(isDeliveryOfFive(intArray, row));
        System.out.println("=================");

        // 3. Заполнить двумерный массив размером n * n единицами и двойками таким образом, чтобы единицы размещались так,
        // как размещаются на шахматной доске черные поля, а двойки — как белые поля. Начинается построение с черной клетки
        System.out.println("Ex. 3");
        int cellNumber = (rand.nextInt(5)+1)*2;
        getCheckMateBoard(cellNumber);
        System.out.println("=================");

        // 4. Дан двумерный массив. Вывести на экран все элементы третьей строки массива, начиная с последнего элемента этой
        // строки
        System.out.println("Ex. 4");
        int rowFour = rand.nextInt(intArray.length);
        printReverseThirdRow(rowFour, intArray);
        System.out.println("=================");

        // 5. Дан двумерный массив. Определить сумму всех элементов k-й строки массива
        System.out.println("Ex. 5");
        int rowFive = rand.nextInt(intArray.length);
        System.out.println(getRowSummary(rowFive, intArray));
        System.out.println("=================");

        // 6. В двумерном массиве хранится информация о баллах, полученных спортсменами-пятиборцами в каждом из пяти видов спорта
        // (в первой строке — информация о баллах первого спортсмена, во второй — второго и т. д.).
        // Общее число спортсменов равно 20. Создать результирующую таблицу и по ней определить победителя
        System.out.println("Ex. 6");
        int[][] sportTable = new int[20][5];
        for (int i = 0; i < sportTable.length; i++) {
            for (int j = 0; j < sportTable[i].length; j++) {
                sportTable[i][j] = rand.nextInt(5)+5;
            }
        }
        getChampionshipTable(sportTable);
        System.out.println("=================");

        // 7. В поезде 18 вагонов, в каждом из которых 36 мест. Информация о продан-ных на поезд билетах хранится
        // в двумерном массиве, номера строк которых соответствуют номерам вагонов, а номера столбцов — номерам мест.
        // Если билет на то или иное место продан, то соответствующий элемент массива имеет значение 1,
        // в противном случае — 0. Составить программу, определяющую число свободных мест в любом из вагонов поезда.
        System.out.println("Ex. 6");
        int[][] train = new int[18][36];
        for (int i = 0; i < train.length; i++) {
            for (int j = 0; j < train[i].length; j++) {
                train[i][j] = rand.nextInt(2);
            }
        }
        int wagon = rand.nextInt(train.length);
        System.out.println(getFreePlaceCount(train, wagon));
        System.out.println("=================");

    }

    public static int getFreePlaceCount(int[][] train, int wagon) {
        int count = 0;
//        for (int[] el : train) {
//            for (int cell : el) {
//                System.out.printf("%d\t", cell);
//            }
//            System.out.println();
//        }
        System.out.printf("Wagon number %d\n", wagon);
        for (int i = 0; i < train[wagon].length; i++) {
            count += train[wagon][i]; // count = count + train[wagon][i];
        }
        return train[wagon].length - count;
    }

    public static void getChampionshipTable(int[][] sportTable) {
//        for (int[] el : sportTable) {
//            for (int cell : el) {
//                System.out.printf("%d\t", cell);
//            }
//            System.out.println();
//        }

        int[] resultTable = new int[sportTable.length];
        for (int i = 0; i < sportTable.length; i++) {
            int finishResult = 0;
            for (int j = 0; j < sportTable[i].length; j++) {
                finishResult += sportTable[i][j];
            }
            resultTable[i] = finishResult;
//            System.out.println(resultTable[i]);
        }

        int max = 0;
        for (int cell : resultTable) {
            if (cell > max) {
                max = cell;
            }
        }

        int count = 0;
        String winners = "";
        for (int i = 0; i < resultTable.length; i++) {
            if ( resultTable[i] == max ) {
                winners += count > 0 ? ", " + (i+1) : (i+1);
                count++;
            }
        }
        System.out.printf("The winners are number %s\n", winners);

    }

    public static int getRowSummary(int rowFive, int[][] intArray) {
        System.out.println(Arrays.toString(intArray[rowFive]));
        int result = 0;
        for (int element : intArray[rowFive]) {
            result += element;
        }
        return result;
    }

    public static void printReverseThirdRow(int rowFour, int[][] array) {
        System.out.printf("Row number %d \n", rowFour);
        for (int i = array[rowFour].length - 1; i >= 0; i--) {
            System.out.printf("%d, ", array[rowFour][i]);
        }
        System.out.println();
    }

    public static void getCheckMateBoard(int rowsCols) {
        int[][] board = new int[rowsCols][rowsCols];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if ( i % 2 == 0 && j % 2 == 0 || i % 2 != 0 && j % 2 != 0 ) {
                    board[i][j] = 1;
                } else {
                    board[i][j] = 2;
                }
//                board[i][j] = (i+j) % 2 == 0 ? 1 : 2;
            }
        }

        for (int[] el : board) {
            for (int cell : el) {
                System.out.printf("%d\t", cell);
            }
            System.out.println();
        }
        System.out.println("----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.printf("%d\t", board[i][j]);
            }
            System.out.println();
        }

    }

    public static boolean isDeliveryOfFive(int[][] intArray, int row) {
        System.out.printf("Row number %d \n", row);
        for (int element: intArray[row]) {
            if (element % 5 == 0) {
                return true;
            }
        }
        return false;
    }

    public static void getResultNumOne(int[][] intArray, int x, int y, int x1, int y1) {
        System.out.println(Arrays.deepToString(intArray));
        System.out.printf("First indexes %d, %d \n", x, y);
        System.out.printf("Second indexes %d, %d \n", x1,y1);
        System.out.printf("%d - %d = %d \n", intArray[x][y], intArray[x1][y1], intArray[x][y] - intArray[x1][y1]);
    }
}
