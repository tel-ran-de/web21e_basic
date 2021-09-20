package incapsulation;

public class App {
    public static void main(String[] args) {
        Cat mursik = new Cat("Mursik");
        System.out.println(mursik.seePassport());
        mursik.newYear();
        System.out.println(mursik.seePassport());
        mursik.pusico();

        Cat pushistik = new Cat("Pushistik");

        pushistik.newYear();
        pushistik.newYear();
        pushistik.newYear();
        pushistik.newYear();
        pushistik.newYear();

        System.out.println(pushistik.seePassport());


//        Algebra al = new Algebra(10,5);
//        System.out.println( al.getDivision() );
//        al.setOp1(100);
//        al.setOp2(0);
//        System.out.println( al.getDivision() );
//        al.setOp1(100);
//        al.setOp2(3);

        Car car = new Car();
        car.manufacturer = "BMW";

    }
}
