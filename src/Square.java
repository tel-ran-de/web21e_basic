public class Square {

    public static void findPerimeterSquare(int siteSquare) {
        int perimeter = 4 * siteSquare;
        System.out.println("Периметр квадрата" + perimeter);
    }

    public static void findAreaSquare(int siteSquare) {
        double area = Math.pow(siteSquare, 2);
        System.out.println("Площадь квадрата" + area);
    }

    public static void main(String[] args) {
        findAreaSquare(7);
        findPerimeterSquare(10);
    }
}
