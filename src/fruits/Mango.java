package fruits;

public class Mango extends Fruit{
    public String tasty;

    public Mango(String country, String tasty) {
        super(country);
        this.tasty = tasty;
    }

    @Override
    public String toString() {
        return "Mango{" +
                "country='" + country + '\'' +
                "tasty='" + tasty + '\'' +
                '}';
    }
}
