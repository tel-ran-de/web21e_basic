package hwsolution;

public class Exe1 {
    public static void main(String[] args) {
        boolean mamaPermission = false;
        boolean papaPermission = false;
        boolean omaPermission = true;
        System.out.println(verySmartDepositBoxVersionThree(mamaPermission, papaPermission, omaPermission));
    }

    public static boolean verySmartDepositBoxVersionThree(
            boolean mama, boolean papa, boolean oma) {
        return (mama && papa) || oma;
    }
}
