package currency;

public class Currency {

    private String name;
    public int sum;
    private int [] rur = {75,95,11};

    public Currency(String value) {//"Usd 100"
        this.name = value.substring(0,3);
        this.sum = Integer.parseInt(value.substring(4));

    }

    public String getRur() {
        int amount=0;
        switch (this.name) {
            case "USD":
                amount=rur[0]*sum;
                break;
            case "EUR":
                amount=rur[1]*sum;
                break;
            case "CNY":
                amount=rur[2]*sum;
                break;
            default:
                amount= - 1;

        }

        return amount>0?"В рублях "+ amount : "ошибка";
    }

    @Override
    public String toString() {
        return "Currency{" +
                "Currency='" + name + '\'' +
                ", Amount=" + sum +
                '}';
    }
}
