public class StringExe07 {
    public static void main(String[] args) {
        System.out.println(middleThree("Candy")); //→ "and"
        System.out.println(middleThree("and")); //→ "and"
        System.out.println(middleThree("solving")); //→ "lvi"
    }


    /**
     * @param str must be at least 3
     * @return
     */
    public static String middleThree(String str) {
        int middle = str.length() / 2;
        int beginIndex = middle - 1;
        int endIndex = middle + 2;
        return str.substring(beginIndex, endIndex);
    }
}
