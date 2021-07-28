public class Circle {

    public static void main(String[] args) {
        circumference();
    }

    public static void circumference() {
        // 1. double pi = 3.14;
        // 2. final double PI = 3.14;
        final int MIN_TEMPERATURE = 18;
        final int MAX_TEMPERATURE = 24;
        final double BERLIN_AREA = 923409.23423;
        int radius = 10;
        double pi = Math.PI;
        System.out.println(pi);
        double length = 2 * pi * radius;
        System.out.println("Длина окружности: " + length);
    }

}
