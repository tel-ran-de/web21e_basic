package car;

import car.model.Car;

public class Volvo extends Car {

    public Volvo(String number) {
        super(number);
    }

    @Override
    public String toString() {
        return "car.Volvo{" +
                "number='" + number + '\'' +
                '}';
    }
}
