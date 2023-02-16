import java.util.Scanner;
  class LeapYear{
    public static void main(String args[]){
      int year;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the year");
      year=sc.nextInt();
      if(year%400==0){
        System.out.println("it is a leap year");
      }
      else{
        System.out.println("it  not  a leap year");
      }
    }} 
      