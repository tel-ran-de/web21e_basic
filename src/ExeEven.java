public class ExeEven {
    public static void main(String[] args) {
        // Кратно двум
        // делится на два
        // делится на два без остатка
        // остаток при делении на два ноль
        // модуло два равно нулю
        //System.out.println(findEvenNumber(10)); // труе
        //System.out.println(findEvenNumber(11)); // false
        System.out.println(multipleOf11(11)); // true
        System.out.println(multipleOf11(12)); // false
        // Напишите программу, которая находит числа кратные 11.
    }

    public static boolean multipleOf11(int number) {
        return number % 11 == 0;
    }


    public static boolean findEvenNumber(int number) {
        /*  boolean result = (number % 2 == 0);
        return result;*/
        return number % 2 == 0;
    }
}
