package currency;

public class AppCurrency {
    public static void main(String[] args) {
        // "USD 100"
        // "EUR 130"
        // "RUB 1500"

        // "Currency - USD, Amount - 100"
        Currency cur1 =new Currency("USD 100");
        //"USD  100"
        //"EURO 130"
        //"EURO 1500"

        //"Currency -USD, Amount -100"
        System.out.println(cur1);
        System.out.println(cur1.getRur());
    }
}
