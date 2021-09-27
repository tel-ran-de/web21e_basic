package fruits;

public class Bananes extends Fruit{
    private String sort;
    private String color;

    public Bananes(String country, String sort, String color) {
        super(country);
        this.sort = sort;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bananes{" +
                "sort='" + sort + '\'' +
                ", color='" + color + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
