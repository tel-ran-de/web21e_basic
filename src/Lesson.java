public class Lesson {

    public static void main(String[] args) {
//        printRow(-10, 22);
//        printRow(-30, 50);
//        printRow(-130, 500);
//
//        printStepsRow(0, 300, 10);
//
//        printSum( getSumOfRow(10, 100, 20) );
//        printSum( getSumOfRow(-100, 100, 31) );
//
//        printRowWithCondition(1,25);

        tableMult(10,20);

    }

    public static void printRow(int start, int finish) {

        while (start <= finish) {
            System.out.print(start + " ");
            start +=2;
        }
        System.out.println("\n-------");
    }

    public static void printStepsRow(int start, int finish, int step) {
        while (start <= finish) {
            System.out.print(start + " ");
            start += step;
        }
        System.out.println("\n-------");
    }

    public static int getSumOfRow(int start, int finish, int step) {
        int result = 0;
        while (start <= finish) {
            result += start;
            start += step;
        }
        return result;
    }

    public static void printSum(int value) {
        if ( value >= 0 ) {
            System.out.println(value);
        } else {
            System.out.println("Не хочу печатать отрицательные числа");
        }

    }

    public static void printRowWithCondition(int min, int max) {
        while (min <= max) {
            compareCondition(min, 5, 7, 13);
            min++;
        }
    }

    public static void compareCondition(int value, int comp1, int comp2, int comp3) {
        if (value % comp1 == 0 || value % comp2 == 0 || value % comp3 == 0 ) {
            System.out.print(value + ", ");
        }
    }

    public static void tableMult(int start, int end) {
        int i = start;
        int y = start;
        while ( i <= end ) {
            while ( y <= end ) {
                System.out.print( (i*y) +"\t");
                y++;
            }
            System.out.println();
            y = start;
            i++;
        }
    }

}
