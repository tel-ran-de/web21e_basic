public class HelloDouble {
    public static void main(String[] args) {
        allPrimitiveTypes();
    }

    public static void helloDouble() {
        double d0 = 3.14;
        double d1 = 10;
        System.out.println(d1);
        double d2 = d0 + d1;
    }

    public static void helloFloat() {
        float f1 = 3.14f;
        float f2 = 3.14F;
//        long l0 = 10_000_000_000_000_000L;
//        long l10 = 10_000_000l; // 1Il настоятельно не рекомендуется

        float f3 = (float) 3.14;
    }


    public static void allPrimitiveTypes() {
        int i = 10;
        String str1 = "I LOVE JAVA";
        String s2 = "1";
        String s3 = "%";
        char tm = '™';
        char c1 = 'T';
        System.out.println("Сейчас будет редкий символ " + tm);
        boolean b1 = true;
        boolean b2 = false;
    }
}
