public class MyFirstCalendar {
    public static void main(String[] args) {
        // 1. январь -> 01
        // 10 -> октябрь
        System.out.println(switchDemoCalendar("ЯнВаРь")); // 1
        System.out.println(switchDemoCalendar("ЯнВафдхгзфгрхзтзрухрРь")); // 1
    }

    public static int switchDemoCalendar(String month) {
        month = month.toLowerCase();
        int monthNumber = 0;
        switch (month) {
            case "январь":
                monthNumber = 1;
                break;
            case "февраль":
                monthNumber = 2;
                break;
            case "март":
                monthNumber = 3;
                break;
            case "апрель":
                monthNumber = 4;
                break;
            case "май":
                monthNumber = 5;
                break;
            case "июнь":
                monthNumber = 6;
                break;
            case "июль":
                monthNumber = 7;
                break;
            case "август":
                monthNumber = 8;
                break;
            case "сентябрь":
                monthNumber = 9;
                break;
            case "октябрь":
                monthNumber = 10;
                break;
            case "ноябрь":
                monthNumber = 11;
                break;
            case "декабрь":
                monthNumber = 12;
                break;
            default:
                monthNumber = -1;
                break;
        }
        return monthNumber;
    }
}
