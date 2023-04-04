import java.util.*;

class Shop {
  public static void main(String args[]) {
    List<String> shop = new ArrayList<String>();
    shop.add("orange");
    shop.add("apple");
    shop.add("mango");
    int count = 0, index = 0;
    for (String str : shop) {
      if (str.equals("apple")) {
        break;
      }
      if (count == 1) {
        System.out.println("found at pos " + index);
      } else {
        System.out.println("not found");
      }
    }
  }
}