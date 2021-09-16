package auto;

public class App {
    public static void main(String[] args) {
//        Auto car = new Auto();
//        car.manufacturer = "BMW";
//        car.model = "X5";
//        car.color = "Silver";
//        car.wheels = 5;
//        car.number = "B546DB";
//        car.year = 2020;
//        System.out.println( car );

        Auto car2 = new Auto("Black", "D1110RT", "Ford", "Focus", 5, 2018);
        System.out.println( car2 );

//        Auto car3 = new Auto("Blue", "M999MM", "Audi", "TT");
//        System.out.println(car3);

        car2.toDrive(40);
        System.out.println(car2);
        car2.toDrive(600);
        System.out.println(car2);

    }
}
