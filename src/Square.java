public class Square {
    public static void main(String[] args) {
        findPerimeter();
        // strg + alt + l
    }

    public static void findPerimeter() {
        int a = 10;
        int perimeter = 4 * a;
        System.out.println("Периметр квадрата со стороной " + a
                + " равен - " + perimeter);
    }

    public static void findArea() {
        int a = 10;
        int result = a * a;
        System.out.println("Площадь квадрата со стороной " + a
                + " равен - " + result);
    }
}
