package shop;

public class App {
    public static void main(String[] args) {
        Product meat = new Product("M001", "Meat", 4.5);
        Product fish = new Product("M002", "Fish", 6.5);
        Product pasta = new Product("M003", "Pasta", 4.3);
        Product eggs = new Product("M004", "Eggs", 3.1);
        Product bread = new Product("M005", "Bread", 1.9);
        Product butter = new Product("M006", "Butter", 2.8);
        Product sugar = new Product("M007", "Sugar", 4.5);

        Delivery car1 = new Delivery("Car1");
        Delivery car2 = new Delivery("Car2");
        Delivery car3 = new Delivery("Car3");

        car1.addProduct(meat);
        car1.addProduct(eggs);
        car1.addProduct(butter);

        car2.addProduct(bread);
        car2.addProduct(meat);
        car2.addProduct(fish);
        car2.addProduct(sugar);

        car3.addProduct(meat);
        car3.addProduct(pasta);
        car3.addProduct(sugar);
        car3.addProduct(butter);
        car3.addProduct(fish);

        Stock st = new Stock("Ulybka (Smile)");

        st.newDelivery(car2);
        st.newDelivery(car3);
        st.newDelivery(car1);

        System.out.println("Прошло 2 часа...");
        System.out.println( st );
        st.outputDelivery();
        System.out.println( st );
        System.out.println("Прошло еще 2 часа...");
        st.outputDelivery();
        System.out.println( st );
        System.out.println("Прошло еще 3 часа...");
        st.outputDelivery();
        System.out.println( st );
        System.out.println("Конец рабочего дня!");

    }
}
