import java.util.Scanner;
  class UpperLower{
    public static void main(String args[]){
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the character");
      ch = sc.next().charAt(0);
       if(ch >= 'A' && ch <= 'Z') {
        System.out.println("it is a uppercase");
      } 
      else{
        System.out.println("it is a lowercase");
      }
    
    }
  }