import java.util.Scanner;
class EvenOdd{
  public static void main(String args[]){
    int Number;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number");
    Number=sc.nextInt();
    if(Number%2==0){
      System.out.println("print even number");
    }
    else{
      System.out.println("print odd number");
    }
   
  }
}