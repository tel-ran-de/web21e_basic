public class MyLovelyBoolean {
    public static void main(String[] args) {
        // intro01();
        // intro02();
        intro3();

    }

    public static void intro3() {
        boolean a = (7 + 8) * 5 > 7 + 8 * 5;  //true
        boolean b = (7 + 8) * 4 != 7 + 4 * 5; // false  -> true
        boolean c = 3 + 4 > 9 + 1 && 16 - 5 > 3 * 4;  // 7 > 10 && 11 > 12 -->> false && false -> false
        boolean d = 16 / 2 < 6 + 2 || 4 + 5 <= 4 * 5; // 8 < 8 || 9<= 20  // фалсе || труе
        boolean e = !(3 * 4 < 7 + 8); // -> !(12 < 15); !(true)  - НЕ ТРУ ->  фалсе
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }

    public static void intro02() {
        // булевая алгебра, логика, логическая алгебра
        boolean oficer1 = true;
        boolean oficer2 = true;
        boolean result = oficer1 && oficer2; //  &&
        // конъюнкция
        System.out.println(result);
    }

    public static void intro01() {
        int a = 5;
        int b = 10;
        // true , false
        System.out.println(a > b);

        boolean c = a > b;
        boolean bool = false;
        boolean bool0 = true;
        // логическое умножение, логическое сложение, отрицание
    }
}
