//Write a program that takes a list of integers as input and returns a new list that contains only the odd integers.
import java.util.*;
public class Odd{
    public static void main(String[] args) {
ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(10);
    numbers.add(25);
    numbers.add(7);
ArrayList<Integer> oddNumbers = Odd(numbers);
    System.out.println("The odd numbers in the list are: " + oddNumbers);
  }

  public static ArrayList<Integer> Odd(ArrayList<Integer> numbers) {
    ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
    for (int i = 0; i < numbers.size(); i++) {
      int num = numbers.get(i);

      if (num % 2 != 0) {

        oddNumbers.add(num);
      }
    }
    return oddNumbers;
  }
}







