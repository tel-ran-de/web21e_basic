package shop;

import java.util.ArrayList;
import java.util.LinkedList;

public class Stock {
    private String name;
    private ArrayList<Product> products;
    private LinkedList<Delivery> delivs;

    public Stock(String name) {
        this.name = name;
        this.products = new ArrayList<>();
        this.delivs = new LinkedList<>();
    }

    public void newDelivery(Delivery delivery) {
        this.delivs.addFirst(delivery);
    }

    public void outputDelivery() {
        Delivery delivery = this.delivs.getLast();
        this.output(delivery.getProducts());
        delivery.clearProducts();
        this.delivs.removeLast();
    }

    private void output(ArrayList<Product> delivery_products) {
        for (Product product : delivery_products) {
            if (this.products.contains(product)) {
                continue;
            }
            this.products.add(product);
        }
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", products=" + products +
                ", delivs=" + delivs +
                '}';
    }
}
