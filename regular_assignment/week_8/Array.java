import java.util.*;

class Array {
  public static void main(String args[]) {
    List list = new ArrayList();
    Scanner sc = new Scanner(System.in);
    list.add(sc.next());
    list.add(sc.next());
    list.add(sc.next());
    for (Object str : list) {
      System.out.println(str);
    }
  }
}