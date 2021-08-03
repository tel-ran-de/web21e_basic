package hw3;

import java.sql.SQLOutput;
import java.util.Locale;

public class MyLovelyStringAndChar {
    public static void main(String[] args) {
        //exe01();
        //exe02();
        exe03();
    }

    public static void exe03() {
        String s1 = "Вход разрешён";
        String s2 = s1.substring(0, 5) + "воспрещён";
        System.out.println(s2);
    }

    public static void exe02() {
        String input = "Осторожно, вход воспрещён";
        System.out.println(input.toUpperCase());
    }

    public static void exe01() {
        char c1 = '\u246C';
        System.out.println(c1);
        char c2 = '®';
        char c3 = '™';
        char c4 = 'η';
        String s1 = "Сергей";
        String s2 = "Андрей";
        String s3 = s1 + s2;

        //конкатенация, конъюнкция;
        // String s4 = s1 * s2; невозможно.
        String myName = "\"Andrej погромист\"";
        String myNameTwo = "'Andrej погромист'";
        char quote = '\"';
        System.out.println(myName);
        System.out.println(quote + "Andrej" + quote);
        System.out.println("Andrej");
        System.out.println("Рыжиков");
        System.out.println("Профессия: Погромист");
        System.out.println("кокойтоемайл");
        System.out.println("адрес");
    }
}
