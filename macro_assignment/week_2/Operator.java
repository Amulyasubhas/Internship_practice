import java.util.Scanner;
  class Operator{
    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      int num1,num2,sum;
     System.out.println("enter the two numbers");
      num1=sc.nextInt();
      num2=sc.nextInt();
      sum=sc.nextInt();
      System.out.println("enter the operators");
      String operator;
      operator=sc.next();
      if(operator == "+"){
        sum= num1+num2;
      }
      else if(operator == "-"){
        sum= num1-num2;
      }
      else if(operator ==  "*"){
        sum= num1*num2;
      }
    else{
      System.out.println("not valid operator");
    }
      System.out.println(sum);
    
    }
    
  }