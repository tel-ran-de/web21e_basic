public class Rectangle {
    public static void findPerimeterRectangle(double siteOne, double siteTwo) {
        double result = 2 * (siteOne + siteTwo);
        System.out.println(result);
    }

    public static void findSquareRectangle(double siteOne, double siteTwo) {
        double output = siteOne * siteTwo;
        System.out.println(output);
    }

    public static void main(String[] args) {
        findPerimeterRectangle(5,6);
        findSquareRectangle(5,6);
    }
}
