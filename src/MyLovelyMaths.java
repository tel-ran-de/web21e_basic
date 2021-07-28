public class MyLovelyMaths {
    public static void main(String[] args) {
        division();
        modulo();
    }

    public static void addition() {
        int a = 45;
        int b = 100;
        int sum = a + b;
    }

    public static void subtraction() {
        int a = 45;
        int b = 100;
        int result = b - a;
    }

    public static void multiplication() {
        int a = 45;
        int b = 100;
        int output = a * b;
        System.out.println("Результат работы операции умножения: " + output);
    }

    public static void division() {
        int a = 45;
        int b = 100;
        int result = b / a;
        System.out.println("Результат деления: " + result);
    }

    public static void modulo() {
        int a = 45;
        int b = 100;
        int result = b % a;
        System.out.println("Остаток деления: " + result);
    }
}
