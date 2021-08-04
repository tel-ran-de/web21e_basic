public class ExeLogic01 {
    public static void main(String[] args) {
        System.out.println(cigarParty(30, false)); //→ false
        System.out.println(cigarParty(50, false)); //→ true
        System.out.println(cigarParty(70, true)); //→ true
    }

    public static boolean cigarParty(int cigars, boolean weekend) {
        // return (weekend && cigars > 40) || (!weekend && cigars > 40 && cigars <= 60);
        return cigars > 40 && (weekend || cigars <= 60);
    }

    public static boolean cigarPartySimple(int cigars, boolean weekend) {
        if (weekend && cigars > 40) {
            return true;
        } else if (!weekend && cigars > 40 && cigars <= 60) {
            return true;
        }
        return false;
    }
}
