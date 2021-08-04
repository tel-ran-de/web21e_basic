public class StringExe0106 {
    public static void main(String[] args) {
        System.out.println(endsLy("oddly")); // → true
        System.out.println(endsLy("y"));// → false
        System.out.println(endsLy("oddy"));// → false
    }

    public static boolean endsLy(String str) {
        String etalon = "ly";
        /*  if (str.length() > 2 && etalon.equals(str.substring(str.length() - 2))) {
            return true;
        }*/
        return str.length() > 2 && etalon.equals(str.substring(str.length() - 2));
    }
}
