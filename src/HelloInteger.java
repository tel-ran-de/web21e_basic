public class HelloInteger {
    public static void main(String[] args) {
        example5();
    }

    public static void example5() {
        int var1 = 10;
        int var2 = 0;
        int var3 = var1 / var2;
        System.out.println(var3);
    }

    public static void example4() {
        int money = 500;
        int iphone = 1000;
        int count = money / iphone;
        int remainder = money % iphone;
        System.out.println(remainder);
    }

    public static void example3() {
        int var1 = 10;
        int var2 = 3;
        int var3 = var1 / var2;
        System.out.println(var3);
        int var4 = var1 % var2;
        System.out.println("остаток деления " + var4);
    }

    public static void example2() {
        int a = 10;
        int b = 3;
        int result = a - b;
        System.out.println(result);
        // ctrl + alt + L
    }

    public static void example1() {
        int a = 5;
        int b = 10;
        int d = 30;
        int c = a + b + d;
        System.out.println(c);
    }
}
