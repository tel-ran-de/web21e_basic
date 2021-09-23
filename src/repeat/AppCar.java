package repeat;

public class AppCar {
    public static void main(String[] args) {
        Engine eng = new Engine("M5", 1000);
        Car car = new Car("Mercedes", eng, "Red");
        System.out.println(car);
    }
}
