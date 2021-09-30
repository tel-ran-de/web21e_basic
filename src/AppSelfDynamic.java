public class AppSelfDynamic {
    public static void main(String[] args) {
        DynamicStringArray ar = new DynamicStringArray();
        System.out.println(ar.getLength());

        ar.add("Hello");
        ar.add("World");
        ar.add("!");
        ar.add(0, "Hello,");
        ar.add(10000, ":-)");
        printArray( ar );
        System.out.println(ar.getLength());
        ar.pop();
        System.out.println(ar.getLength());
        printArray( ar );
    }

    public static void printArray(DynamicStringArray array) {
        for (int i = 0; i < array.getLength(); i++) {
            System.out.println( array.get(i) );
        }
    }
}
