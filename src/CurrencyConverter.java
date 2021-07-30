public class CurrencyConverter {
    public static void main(String[] args) {
        dollarToEuro(1000);
        dollarToEuro(30);
        dollarToEuro(400);
        dollarToEuro(700);

    }

    public static void dollarToEuro(double moneyUSD) {
        double result = moneyUSD / 1.1;
        System.out.println("Евро " + result);
    }
}
