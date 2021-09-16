package auto;

public class Auto {
    public String color;
    public String number;
    public String manufacturer;
    public String model;
    public int wheels = 5;
    public int year = 2021;
    public int run = 0;
    public final int speed = 90;

    public  Auto() {
    }

    public Auto(String color, String number, String manufacturer, String model, int wheels, int year) {
        this.color = color;
        this.number = number;
        this.manufacturer = manufacturer;
        this.model = model;
        this.wheels = wheels;
        this.year = year;
    }

    public Auto(String color, String number, String manufacturer, String model) {
        this.color = color;
        this.number = number;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public void toDrive(int minutes) {
        double result = (double)minutes/60 * speed;
        System.out.printf( "За %d минут наша машинка проехала расстояние %.2f км.\n", minutes, result );
        this.run += result;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "color='" + color + '\'' +
                ", number='" + number + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", wheels=" + wheels +
                ", year=" + year +
                ", run=" + run +
                '}';
    }
}
