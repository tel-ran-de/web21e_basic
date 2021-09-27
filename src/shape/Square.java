package shape;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }


    public double area() {
        return side * side;
    }
}
