import java.util.Scanner;
  class Temperature{
    public static void main(String args[]){
      Scanner sc=next Scanner(System.in);
      System.out.println("enter temperature");
      double Input=sc.nextDouble();
      System.out.println("Convert to:");
      System.out.println("enter c for celcius");
      System.out.println("enter f for fahrenheit");
      String convert=sc.next();
      double c,f;
      if(convert.equals("c")){
        c=((Input-32)*5)/9;
        System.out.println("temperature"+c+"c");
      }
      else if(convert.equals("f"))
      {
        f=((Input*9)/5)+32;
        System.out.println("temperature"+f+"f");
      }
      else
        System.out.println("invalid Input");
      
    }
  }