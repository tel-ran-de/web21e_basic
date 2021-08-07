package com.company;

public class Main {

//Напишите программу действий для сотрудника дорожной полиции, который остановил машину:
//при езде до 50 км/час нарушений нет;
//за езду от 50 км/час до 65 км/час — устное порицание и лекция на 5 минут;
//за превышение скорости от 16 км/час — 40 евро штрафа;
//за езду от 100 км/час до 130 км/час — штраф 500 евро;
//и за езду свыше 130 км/час — штраф в 1000 евро, конфискация прав на 3 года и конфискация транспортного
//средства.
//Напишите программу, которая объяснит наступление определённых событий, в зависимости от выбора "витязя".
//Напишите программу для машины на светофоре. Что делать, если горит красный, жёлтый или зелёный свет.
//Напишите программу выдачи денег работнику с учётом надбавки за стаж, если базовая зарплата 500$. За 3 года
//работы надбавка 10%, за 5 лет работы надбавка 50%, за 10 лет работы надбавка 100%, за 15 лет работы надбавка
//150%.
//Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If
//either string is length 0, use '@' for its missing char.


    public static void main(String[] args) {

//        policemen(50);
//        policemen(64);
//        policemen(98);
//        policemen(129);
//        policemen(220);

//        trafficLight(14);
//        trafficLight(140);
//        trafficLight(14025342);
//        trafficLight(0);
//        trafficLight(-5);

        System.out.println(getBonus(1));
        System.out.println(getBonus(4));
        System.out.println(getBonus(6));
        System.out.println(getBonus(10));
        System.out.println(getBonus(100));
    }

    public static void policemen(int speed) {
        //при езде до 50 км/час нарушений нет;
        if (speed <= 50) {
            System.out.println("нет нарушений");
            //за езду от 50 км/час до 65 км/час — устное порицание и лекция на 5 минут;
        } else if (speed <= 65) {
            System.out.println("устное порицание и лекция на 5 минут");
            //за превышение скорости от 16 км/час — 40 евро штрафа;
        } else if (speed <= 99) {
            System.out.println("40 евро штрафа;");
            //за езду от 100 км/час до 130 км/час — штраф 500 евро;
        } else if (speed <= 130) {
            System.out.println("штраф 500 евро");
        } else {
            System.out.println("конфискация прав на 3 года и конфискация транспортного средства.");
        }
    }

    /**
     * color = 1 - color red
     * color = 2 - color yellow
     * color = 3 - color green
     */
    public static void trafficLight(int actuallyColor) {
        if (actuallyColor == 1) {
            System.out.println("стоп");
        } else if (actuallyColor == 2) {
            System.out.println("включаем 1 передачу");
        } else if (actuallyColor == 3) {
            System.out.println("едем");
        } else {
            System.out.println("такого цвета у нас нет в программе");
        }

//        switch (actuallyColor) {
//            case 1:
//                System.out.println("стоп");
//                break;
//            case 2:
//                System.out.println("включаем 1 передачу");
//                break;
//            case 3:
//                System.out.println("едем");
//                break;
//            default:
//                System.out.println("такого цвета у нас нет в программе");
//                break;
//        }
    }

    public static void trafficLightUsingString(String actuallyColor) {

        if (actuallyColor.equals("red")) {
            System.out.println("стоп");

        } else if (actuallyColor.equals("yellow")) {
            System.out.println("включаем 1 передачу");

        } else if (actuallyColor.equals("green")) {
            System.out.println("едем");

        } else {
            System.out.println("такого цвета у нас нет в программе");
        }
    }

//Напишите программу выдачи денег работнику с учётом надбавки за стаж, если базовая зарплата 500$. За 3 года
//работы надбавка 10%, за 5 лет работы надбавка 50%, за 10 лет работы надбавка 100%, за 15 лет работы надбавка
//150%.

    public static double getBonus(int yearEx) {
        double baseSalary = 500;
        double salaryAfter3Years = baseSalary * 1.1;
        double salaryAfter5Years = baseSalary + (baseSalary / 2);
        double salaryAfter10Years = baseSalary + baseSalary;
        double salaryAfter15Years = baseSalary + baseSalary + (baseSalary / 2);

        double result;

        if (yearEx >= 15) {
            result = salaryAfter15Years;
        } else if (yearEx >= 10) {
            result = salaryAfter10Years;
        } else if (yearEx >= 5) {
            result = salaryAfter5Years;
        } else if (yearEx >= 3) {
            result = salaryAfter3Years;
        } else {
            // работник с опытом меньше трех лет получает базовую зарплату
            result = baseSalary;
        }

        return result;
    }
}
