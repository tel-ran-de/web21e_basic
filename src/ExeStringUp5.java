public class ExeStringUp5 {
    public static void main(String[] args) {
        System.out.println(theEnd("Hello", true));// → "H"
        System.out.println(theEnd("Hello", false)); // → "o"
        System.out.println(theEnd("oh", true)); //→ "o"
        System.out.println(theEnd("o", true)); //→ "o"
    }

    public static String theEnd(String str, boolean front) {
        String result = "";
        if (front) {
            result = str.substring(0, 1);
        } else {
            result = str.substring(str.length() - 1);
        }
        return result;
    }
}
