package shape;

public class App {
    public static void main(String[] args) {
//        Circle c1 = new Circle(5);
//        System.out.println(c1.area());
//
//        Square s1 = new Square(3);
//        System.out.println(s1.area());

        Shape [] shapes = new Shape[2];
        shapes[0] = new Circle(5);
        shapes[1] = new Square(5);

        for (Shape shape: shapes) {
            System.out.println(shape.area());
        }

    }
}
