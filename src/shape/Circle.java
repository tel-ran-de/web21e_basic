package shape;

public class Circle extends Shape{
    private static final double PI = Math.PI;
    private double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }


    public double area() {
        double radius = diameter / 2;
        return PI * radius * radius;
    }
}
