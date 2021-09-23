package repeat;

public class Car {
    private String model;
    private Engine engine;
    private String color;

    public Car(String model, Engine engine, String color) {
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine=" + engine.getModel() + "(" + engine.getPower() + ")" +
                ", color='" + color + '\'' +
                '}';
    }
}
