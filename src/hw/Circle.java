package hw;

public class Circle {
    public static void findCircumference(double radius) {
        double result = 2 * Math.PI * Math.pow(radius, 2);
        System.out.println(result);
    }

    public static void findCircleArea(double radius) {
        double result = 3.14 * radius * radius;
        System.out.println(result);
    }

    public static void main(String[] args) {
        findCircleArea(45);
        findCircumference(45);
    }
}
