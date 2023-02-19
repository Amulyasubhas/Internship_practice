import java.util.Scanner;
  class WebApplication{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int option;
      int num1,num2;
      double result=0;
     String operator,operations;
      num1=sc .nextInt();
      num2=sc.nextInt();
      int random_number;
      int Input;
      String convert;
     System.out.println("1.calculator \n 2.coverter \n 3.random number \n 4.quit");
       System.out.println("Enter the option: ");
        option=sc.nextInt();
         if(option == 1){
           System.out.println("choose operations");
          System.out.println("a:addition");
             System.out.println("b:substraction");
              System.out.println("c:multiplication");
            System.out.println("d:division");
          System.out.println("e:remainder");
           operator=sc.next();
           operations=sc.next();
           if(operations =="a"){
             result=num1+num2;
           }
           else if(operations =="b"){
             result=num1+num2;
           }
            else if (operations =="c"){
             result=num1+num2;
             }
          else if (operations =="d"){
             result=num1+num2;
          }
           else if(operations =="e"){
             result=num1%num2;
           }
           else{
             System.out.println("Invalid operations");
             System.out.println("result"+result);
           }
           if(option==2){
             Input=sc.nextInt();
           double Celcius, Fahrenheit,Kilometers,Miles;
            System.out.println("convert to degree");
           System.out.println("a.celcius to fahrenheit");
             System.out.println("b.fahrenheit to celcius");
              System.out.println("a.kilometers to miles");
              System.out.println("Miles to Kilometers");
             convert=sc.next();
            if(convert("a"))
      {
        Fahrenheit=((Input*9)/5)+32;
        System.out.println(Input+"°Celcius="+Fahrenheit+"°Fahrenheit");
      }
      else if(convert("b"))
      {
        Celcius=((Input-32)*5)/9 ;
        System.out.println(Input+"°Fahrenheit="+Celcius+"°Celcius");
      }
       else if(convert("c"))
      {
        Miles=1.609*Input;
        System.out.println(Input+"Kilometers="+Miles+"Miles");
      }
      else if(convert("d"))
      {
        Kilometers=0.621*Input;
        System.out.println(Input+"Miles="+Kilometers+"kilometers");
      }
      else 
        System.out.println("Invalid choice");
    }
    else if(option==3)
    {
     random_number=sc.nextInt();
     System.out.println("Number="+random_number);
    }
    else if(option==4)
      System.out.println("thank you");
    else
      System.out.println("Invalid choice");
  }
}}


           
           
           
           
             
                 
             
         


      

      
      
    
  
  
