import java.util.Scanner;
  class AlphaDigitSpl{
    public static void main(String args[]){
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the character");
      ch = sc.next().charAt(0);
       if((ch >= 'a'&& ch <='z') || (ch >= 'A' && ch <= 'Z')){
        System.out.println("it is a alphabet");
      } else if (ch>='0' && ch<= '9') {
        System.out.println("it is a digit"); 
      } 
      else{
        System.out.println("it is a special character");
      }
    
    }
  }