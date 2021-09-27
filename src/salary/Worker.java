package salary;

public class Worker extends People{
    private int dailySalary;
    private int daysInMonth;

    public Worker(String fName, String tNumber, int dailySalary, int daysInMonth) {
        super(fName, tNumber);
        this.dailySalary = dailySalary;
        this.daysInMonth = daysInMonth;
    }

    public int getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(int dailySalary) {
        this.dailySalary = dailySalary;
    }

    public int getDaysInMonth() {
        return daysInMonth;
    }

    public void setDaysInMonth(int daysInMonth) {
        this.daysInMonth = daysInMonth;
    }

    @Override
    public int getSalary() {
        return dailySalary*daysInMonth;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "dailySalary=" + dailySalary +
                ", daysInMonth=" + daysInMonth +
                '}';
    }
}
