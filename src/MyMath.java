public class MyMath {
    public static void main(String[] args) {
        //getPower();
        myRandom();
    }

    public static void getPower() {
        int a = 2;
        int b = 10;
        double c = Math.pow(2, 10);
        int d = (int) Math.pow(2, 10);
        System.out.println(c);
        System.out.println(d);

        int example = 10;
        double example2 = example;
        double pi = 3.14;
        int myLovelyPi = (int) pi;
        System.out.println("каст double: " + myLovelyPi);
    }

    public static void myRandom() {
        int min = 20;
        int max = 70;
        int result = (int) (Math.random() * (max - min) + 1) + min;
        //System.out.println((int) (Math.random() * 100));
        System.out.println(result);
        System.out.println((int) (Math.random() * (max - min) + 1) + min);
    }
}
