// Write a Java program to reverse elements in a array list.
import java.util.*;
import java.util.Collections;

public class Reverse {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
              Collections.reverse(colors);
        System.out.println("The reversed colors are:");
        for(String color : colors) {
            System.out.println(color);
        }
    }

}