package car;

import car.model.Mercedes;

public class App {
    public static void main(String[] args) {
        Mercedes m1 = new Mercedes("B123AB", "E200");
        System.out.println(m1.getNumber());
    }
}
