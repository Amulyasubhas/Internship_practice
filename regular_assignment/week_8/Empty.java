import java.util.*;

public class Empty {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("ArrayList before clearing: " + numbers);
        numbers.clear();
                System.out.println("ArrayList after clearing: " + numbers);
    }
}
