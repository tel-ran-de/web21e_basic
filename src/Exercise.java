public class Exercise {
    public static void main(String[] args) {
        System.out.println(smartDepositBox(true, false)); //  -> true
        System.out.println(smartDepositBox(false, true)); //  -> true
        System.out.println(smartDepositBox(false, false)); // -> false
        System.out.println(smartDepositBox(true, true)); // -> false
        System.out.println("-----------------------------------");
        System.out.println(smartDepositBoxVersionTwo(true, false));// -> false
        System.out.println(smartDepositBoxVersionTwo(false, true)); // -> false
        System.out.println(smartDepositBoxVersionTwo(false, false)); // -> false
        System.out.println(smartDepositBoxVersionTwo(true, true)); // -> true
    }

    public static boolean smartDepositBoxVersionTwo(boolean mama, boolean papa) {
        return mama && papa;
    }

    public static boolean smartDepositBox(boolean mama, boolean papa) {
        return mama ^ papa;
    }
}
