package hwsolution;

public class Exe3 {
    public static void main(String[] args) {
//        System.out.println(findEven(5));// фалсе
//        System.out.println(findEven(4));// true
        System.out.println(findOdd(5)); //true
        System.out.println(findOdd(4)); //false

    }

    public static boolean findOdd(int number) {
        //return number % 2 == 1;
        //return number % 2 != 0;
        // что такое нечётное число - это НЕ чётное число
        return  !findEven(number);
    }

    public static boolean findEven(int number) {
        return number % 2 == 0;
    }
}
