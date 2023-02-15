import java.util.Scanner;
class AverageGrade{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the mark of sub1");
    int sub1=sc.nextInt();
    System.out.println("enter the mark of sub2");
     int sub2=sc.nextInt();
    System.out.println("enter the mark of sub3");
      int sub3=sc.nextInt();
    int average=(sub1+sub2+sub3)/3;
    System.out.println("average mark"+average);
  }
}