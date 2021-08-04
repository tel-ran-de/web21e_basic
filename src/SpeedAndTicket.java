public class SpeedAndTicket {
    public static void main(String[] args) {
        System.out.println(caughtSpeeding(60, false));// → 0
        System.out.println(caughtSpeeding(65, false));// → 1
        System.out.println(caughtSpeeding(65, true));// → 0
        System.out.println(caughtSpeeding(82, false));// → 2
        System.out.println(caughtSpeeding(82, true));// → 1
    }

    public static int caughtSpeeding(int speed, boolean birthday) {
        if (birthday) {
            speed = speed - 5;
        }
        // два разных условных оператора
        if (speed <= 60) {
            return 0;
        } else if (speed <= 80) {
            return 1;
        } else {
            return 2;
        }
    }
}
