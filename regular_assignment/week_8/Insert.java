// Write a Java program to insert an element into the array list at the first position
import java.util.*;
public class Insert {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(0, 1);
        
System.out.println(numbers);
    }

}