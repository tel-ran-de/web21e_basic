package car.model;

import car.model.Car;

public class Mercedes extends Car {

    public String model;

    public Mercedes(String number) {
        super(number);
    }

    public Mercedes(String number, String model) {
        super(number);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "car.model.Mercedes{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
