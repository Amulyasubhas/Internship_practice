import java.util.Scanner;
  class GrossSalary{
    public static void main(String args[]){
      double basicSalary,hra,da;
      Scanner sc=new Scanner(System.in);
       System.out.println("enter the basic salary");
       basicSalary=sc.nextDouble();
      if(basicSalary<=10000){
        hra=10000*20/100;
        da=10000*80/100;
          }
      else if(basicSalary<=20000){
        hra=20000*25/100;
          da=20000*90/100;
      }
      else{
        hra=20000*30/100;
        da=20000*95/100;
      }
      double GrossSalary = basicSalary+hra+da;
      System.out.println("gross salary"+GrossSalary);
    }}
