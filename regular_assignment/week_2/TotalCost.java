import java.util.Scanner;
class TotalCost{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the roomrate");
    int num1=sc.nextInt();
    System.out.println("roomrate"+num1);
    System.out.println("enter the numberof nights");
    int num2=sc.nextInt();
    System.out.println("nights"+num2);
    int totalcost= (num1 * num2);
    System.out.println("total cost"+totalcost);
  }
