import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("Hello");
//        strings.add("World");
//        strings.add("!");
//
//        strings.set(0, "Hello,");
//
//        strings.add(3, "Ups");
//        strings.remove(3);
//        System.out.println(strings.indexOf("abra"));
//
//        System.out.println( strings.size() );
//        printList(strings);

//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(100);
//        System.out.println(numbers.get(0));

//        ArrayList<Boolean> booleanList = new ArrayList<>();
//        booleanList.add(false);
//        booleanList.add(true);
//        System.out.println(booleanList.get(0));
//        System.out.println(booleanList.get(1));

        ArrayList<People> people = new ArrayList<>();
        people.add(new People("Ivan", 40));
        people.add(new People("Nikolay", 27));
        people.add(new People("Marya", 18));

        for (int i = 0; i < people.size(); i++) {
            System.out.println( people.get(i) ); // people[i]
        }
    }

    public static void printList(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            System.out.println( strings.get(i) );
        }
    }
}
