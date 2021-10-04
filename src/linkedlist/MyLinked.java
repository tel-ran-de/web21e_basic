package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyLinked {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        num.add(26);
        num.add(2);
        num.add(1);
        num.add(5);
        num.add(10);
        num.add(100500);

        num.add(3, 4);
        num.addFirst(33);
        num.addLast(35);

        System.out.println(num);

        num.removeFirst();
        num.removeLast();

        System.out.println(num);

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(1,2 );
        System.out.println( numbers );

        System.out.println( numbers.get(numbers.size() - 1) );
        System.out.println(num.getLast());
        System.out.println(num.getFirst());

        System.out.println( num.size() );
        num.push(11);
        System.out.println(num);
        System.out.println(num.pop());
        System.out.println( num );

        num.set(6, 222);
        System.out.println(num);

        num.clear();
        System.out.println(num);
    }
}
