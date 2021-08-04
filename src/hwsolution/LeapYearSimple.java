package hwsolution;

public class LeapYearSimple {
    public static void main(String[] args) {
        System.out.println(findLeapYearSimple(2000));
        System.out.println(findLeapYearSimple(2001));
    }

    public static boolean findLeapYearSimple(int year) {
        return year % 4 == 0;
    }
}
