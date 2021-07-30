public class HelloString {
    public static void main(String[] args) {
        // exampleOne();
        helloUser("Вася");
        helloUser("Света");
        helloUser("Админ");
    }

    public static void exampleOne() {
        String firstname = "Вася";
        String secondName = "Чижиков";
        char copyright = '\u00A9';
        int age = 20;
        System.out.println(firstname + " "
                + secondName + " "
                + age + " "
                + copyright);
    }

    public static void helloUser(String firstname) {
        System.out.println("Привет " + firstname
                + " тебя давно не было на сайте, как твои дела?!");
    }
}
