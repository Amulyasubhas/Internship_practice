import java.util.*;
import java.util.ArrayList;

public class Arrays {
  public static void main(String args[]) {
    ArrayList<String> student = new ArrayList<String>();
    student.add("aaaa");
    student.add("bbbb");
    student.add("ccc");
    System.out.println(student);
    String Details = student.get(0);
    System.out.println(Details);
    student.set(2, "ccccc");
    System.out.println(student);
    student.remove(1);
    System.out.println(student);

  }
}