import incapsulation.Car;

public class App {
    public static void main(String[] args) {
        Car car = new Car();
//        car.manufacturer = "BMW";
        car.setManufacturer("BMW");
    }
}
