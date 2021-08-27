import java.util.Arrays;
import java.util.Random;

public class MyArrays {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
        // ================
        int [][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i)*(j);
            }
        }

        System.out.println("================");

//        System.out.println(Arrays.deepToString(array));
//        System.out.println(Arrays.toString(array));

        printArray(array);

        System.out.println( array[5][5] );

        int [][] arr1 = {{1, 2},{2, 3, 4, 5},{9,8,7,6,5,4,3,2,1}};

        // Составить программу, которая меняет местами два любых элемента двумерного массива.

        Random rnd = new Random();
        int [][] ourArray = new int[10][10];
        for (int i = 0; i < ourArray.length; i++) {
            for (int j = 0; j < ourArray[i].length; j++) {
                ourArray[i][j] = rnd.nextInt(100);
            }
        }

        printArray(ourArray);

        changeMatrixElement(ourArray, rnd.nextInt(10),rnd.nextInt(10),rnd.nextInt(10),rnd.nextInt(10));

        printArray(ourArray);

        changeMatrixRow(ourArray,rnd.nextInt(10),rnd.nextInt(10) );

        printArray(ourArray);

        // Произвольный двумерный массив. Составить программу, которая будет считать сумму всех элементов
        // внутреннего массива для любого внешнего индекса

        System.out.println(getSumOfRow(ourArray, rnd.nextInt(10)));

    }

    public static int getSumOfRow(int[][] ourArray, int nextInt) {
        System.out.println( nextInt );
        int result = 0;
        for (int i = 0; i < ourArray[nextInt].length; i++) {
            result += ourArray[nextInt][i]; // result = result + ourArray[nextInt][i]
        }

        return result;
    }

    public static void changeMatrixRow(int[][] ourArray, int nextInt, int nextInt1) {
        System.out.println( nextInt + " " + nextInt1 );
        int[] tmp = ourArray[nextInt];
        ourArray[nextInt] = ourArray[nextInt1];
        ourArray[nextInt1] = tmp;
    }

    public static void printArray(int[][] ourArray) {
        for (int[] element : ourArray) {
//            System.out.println(Arrays.toString(element));
            for (int a : element) {
                System.out.print(a + "\t");
            }
            System.out.println();
        }
    }

    private static void changeMatrixElement(int[][] ourArray, int indexX, int indexY, int indexX1, int indexY1) {
        System.out.println(indexX+ " " + indexY + " "+ indexX1 + " "+ indexY1);
        int tmp = ourArray[indexX][indexY];
        ourArray[indexX][indexY] = ourArray[indexX1][indexY1];
        ourArray[indexX1][indexY1] = tmp;
    }


}
