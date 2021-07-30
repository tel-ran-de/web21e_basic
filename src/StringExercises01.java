public class StringExercises01 {
    public static void main(String[] args) {
        helloName("Bob"); //→ "Hello Bob!"
        helloName("Alice");// → "Hello Alice!"
        helloName("X");// → "Hello X!"
    }

    public static void helloName(String name) {
        System.out.println("Hello " + name + "!");
    }

}
