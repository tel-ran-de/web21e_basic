package salary;

public class App {
    public static void main(String[] args) {
        Administration a1=new Administration("Ivanov","123", 1500, 700);
        Worker w1 =new Worker( "Sidorow", "345", 20, 22);
        Worker w2=new Worker( "Petrov", "523", 21, 20);
        Worker w3=new Worker( "Zaizev", "956", 22, 27);
        Worker w4=new Worker( "Lisizin", "456", 20, 19);
        Worker w5=new Worker( "Wulf", "789", 19, 20);
        Sales s1 = new Sales("Sachar", "678", 300, 5);
        Sales s2 = new Sales("Zukov", "912", 300, 7);

        People [] collektive ={a1,w1,w2,w3,w4,w5,s1,s2};
        int sum=0;
        for (int i = 0; i < collektive.length ; i++) {
            System.out.printf("%d.\t%s\t%s\t%d\n",i+1, collektive[i].gettNumber(), collektive[i].getfName(), collektive[i].getSalary());
            sum+=collektive[i].getSalary();
        }

        System.out.println("Summe for month in the our firma: "+sum);

    }
}
