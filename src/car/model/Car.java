package car.model;

public class Car {
    protected String number;

    public Car(String number) {
        this.number = number;
    }



    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "car.model.Car{" +
                "number='" + number + '\'' +
                '}';
    }
}
