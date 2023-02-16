import java.util.Scanner;
  class PrintWeekDay{
    public static void main(String args[]){
      int num;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the day");
      int day= sc.nextInt();
      if(day==1){
        System.out.println("it is a sunday");
      }
      else if(day==2){
        System.out.println("it is a monday");
      }
        else if(day==3){
        System.out.println("it is a tuesday");
      }
        else if(day==4){
        System.out.println("it is a wednesday");
      }
        else if(day==5){
        System.out.println("it is a thursday");
      }
        else if(day==6){
        System.out.println("it is a friday");
      }
        else {
        System.out.println("it is a saturday");
      }
    }}

      
      
      