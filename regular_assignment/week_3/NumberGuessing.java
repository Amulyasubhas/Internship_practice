//    1. Number Guessing Game: Create a number guessing game where the user has to guess a randomly generated number within a certain range. Use loops to repeatedly prompt the user for a guess and conditional statements to check if the guess is correct.
import java.util.Scanner;
import java.util.Random;
  class NumberGuessing{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      Random ran=new Random();
      System.out.println("enter the number");
      int num=sc.nextInt();
      int guess=sc.nextInt();
      int ranNum=ran.nextInt(100);
      while(true){
        if(guess!=ranNum){
          System.out.println("not correct and enter the number again");
          guess=sc.nextInt();
        }
        else{
          System.out.println("guessed password is correct");
          break;
        }
        
      }

    }
  }
