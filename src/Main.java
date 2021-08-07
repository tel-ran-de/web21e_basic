package com.company;

public class Main {

    public static void main(String[] args) {
        int apples = 10;

        //"(apples >= 0)" - условие, если условие
        //  true - то выполятся код в теле цикла, после сново проверятся условие.
        //  false - то НЕ выполнятся код в тела цикла, а выполняется код после всего блока while.
        //  в этом случае строка 17 и далее.
        while (apples >= 0) {
            //тело цикла
            cleanApple(apples);
            apples = apples - 1;
        }

        System.out.println();
        apples = 10;

        // гарантировано будет выполнен один раз, не зависимо от значения условия "(apples >= 0)".
        // И только потом выполнение тела цикла будет зависить от условия "(apples >= 0)".
        do {
            //тело цикла
            cleanApple(apples);
            apples = apples - 1;
        } while (apples >= 0);
    }

    public static void cleanApple(int apples) {
        System.out.print("яблок: " + apples + " ");
    }
}
