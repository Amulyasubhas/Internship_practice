import java.util.Scanner;
  class StudentGrade{
    public static void main(String args[]){
      double physics,chemistry,bio,maths,computer,percentage;
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the physics marks");
       physics=sc.nextDouble();
      System.out.println("enter the chemistry marks");
       chemistry=sc.nextDouble();
      System.out.println("enter the bio marks");
       bio=sc.nextDouble();
      System.out.println("enter the maths marks");
       maths=sc.nextDouble();
      System.out.println("enter the computer marks");
       computer=sc.nextDouble();
      percentage=((physics+chemistry+bio+maths+computer)/500)*100;
      System.out.println(percentage);
      if(percentage >=90){
        System.out.println("grade A");
      }
      else if(percentage >=80){
        System.out.println("grade B");
      }
      else if(percentage >=70){
        System.out.println("grade C");
      }
      else if(percentage >=60){
        System.out.println("grade D");
      }
      else if(percentage >=40){
        System.out.println("grade E");
      }
      else{
          System.out.println("fail");
      }
      }
  }




      
    
  
