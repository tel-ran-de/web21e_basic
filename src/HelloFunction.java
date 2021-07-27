public class HelloFunction {
    // main +tab
    // psvm + tab
    public static void main(String[] args) {
        functionOne();
    }

    public static void functionOne() {
        System.out.println("1");
        function4();
    }

    public static void functionTwo() {
        System.out.println("2");
    }

    public static void function3() {
        functionTwo();
        System.out.println("3");
    }

    public static void function4() {
        System.out.println("4");
        function3();
    }
}
