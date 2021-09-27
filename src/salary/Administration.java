package salary;

public class Administration extends People{
    private int baseSalary;
    private int bonus;

    public Administration(String fName, String tNumber, int baseSalary, int bonus) {
        super(fName, tNumber);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int getSalary() {
        return baseSalary+bonus;
    }

    @Override
    public String toString() {
        return "Administration{" +
                "baseSalary=" + baseSalary +
                ", bonus=" + bonus +
                '}';
    }
}
