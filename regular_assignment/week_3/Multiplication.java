import java.util.Scanner;

class Multiplication {
  public static void main(String args[]) {
    scanner sc = new Scanner(System.in);
    int m = 0;
    System.out.println("enter the n value");
    n = sc.nextInt();
    for (int i = 1; i <= 10; i++) {
      m = n * i;
      if (m % n == 0)
        System.out.println(n + "*" + i + "=" + m);
    }

  }
}
