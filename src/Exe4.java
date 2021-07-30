public class Exe4 {
    public static void main(String[] args) {
        // nonStart("Hello", "There").sout
        System.out.println(nonStart("Hello", "There"));  //→ "ellohere"
        System.out.println(nonStart("java", "code"));  // → "avaode"
        System.out.println(nonStart("shotl", "java"));  // → "hotlava"
    }

    public static String nonStart(String input1, String input2) {
        String output1 = input1.substring(1);
        String output2 = input2.substring(1);
        return output1 + output2;
    }
}
