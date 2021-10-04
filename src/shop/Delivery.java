package shop;

import java.util.ArrayList;

public class Delivery {
    private String deliveryName;
    ArrayList<Product> products;

    public Delivery(String deliveryName) {
        this.deliveryName = deliveryName;
        this.products = new ArrayList<>();
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void clearProducts() {
        this.products.clear();
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "deliveryName='" + deliveryName + '\'' +
                ", products=" + products +
                '}';
    }
}
