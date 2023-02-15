import java.util.Scanner;
class Library{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of book");
    int num1=sc.nextInt();
      System.out.println("enter the author name");
    String AuthorName=sc.next();
      System.out.println("enter the name of book");
    String BookName=sc.next();
    System.out.println("number"+num1);
     System.out.println("AuthorName"+AuthorName);
       System.out.println("name"+BookName);

  }
}