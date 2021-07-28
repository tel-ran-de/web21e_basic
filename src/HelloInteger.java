public class HelloInteger {
    public static void main(String[] args) {
        /*exampleTwo();*/
        example5();
    }

    public static void exampleOne() {
        String userName, firstname, secondName;
        byte b0 = 125;
        byte b1 = 3;
        byte b2 = (byte) (b0 + b1);
        System.out.println(b2);
    }

    public static void exampleTwo() {
        short s1 = 10;
        short s2 = 20;
        short s3 = 30;
        short s4 = (short) (s1 + s2 + s3);
    }

    public static void example3() {
        int i0 = 1_0;
        int i1 = 20;
        int i2 = 30;
        int i3 = i0 + i1 + i2;
        System.out.println(i3);
        int price = 150_45;
    }

    public static void example4() {
        long l0 = 10_000_000_000_000_000L;
        long l10 = 10_000_000l; // 1Il настоятельно не рекомендуется
        long l1 = 10;
        long l2 = l0 + l1;
        System.out.println(l2);
    }

    public static void example5() {
        int lightCoral = 0xF08080;
        System.out.println(lightCoral);
        int octal = 0555;
        System.out.println(octal);
        int binary = 0B1001_1001;
        System.out.println(binary);
    }
}
