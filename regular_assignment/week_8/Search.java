// import java.util.ArrayList;

public class Search {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("kiwi");
        fruits.add("grape");
        String searchElement = "kiwi";
        int index = fruits.indexOf(searchElement);
        if(index == -1) {
            System.out.println("Element not found in the ArrayList");
        }
        else {
            System.out.println("Element found at index: " + index);
        }
    }

}