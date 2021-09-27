package salary;

public class Sales extends People{
    private int baseMonthsSalary;
    private final int dealPrice=200;
    private int countOfDeals;

    public Sales(String fName, String tNumber, int baseMonthsSalary, int countOfDeals) {
        super(fName, tNumber);
        this.baseMonthsSalary = baseMonthsSalary;
        this.countOfDeals = countOfDeals;
    }

    public int getBaseMonthsSalary() {
        return baseMonthsSalary;
    }

    public void setBaseMonthsSalary(int baseMonthsSalary) {
        this.baseMonthsSalary = baseMonthsSalary;
    }

    public int getDealPrice() {
        return dealPrice;
    }

    public int getCountOfDeals() {
        return countOfDeals;
    }

    public void setCountOfDeals(int countOfDeals) {
        this.countOfDeals = countOfDeals;
    }


    @Override
    public int getSalary() {
        return baseMonthsSalary+countOfDeals*dealPrice;
    }

    @Override
    public String toString() {
        return "SalesDepartment{" +
                "baseMonthsSalary=" + baseMonthsSalary +
                ", dealPrice=" + dealPrice +
                ", countOfDeals=" + countOfDeals +
                '}';
    }
}
