package fruits;

public class Fruit {
    protected String country;

    public Fruit(String country) {
        this.country = country;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    @Override
    public String toString() {
        return "Fruit{" +
                "country='" + country + '\'' +
                '}';
    }
}
