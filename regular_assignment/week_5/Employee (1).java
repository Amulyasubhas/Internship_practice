import java.util.Scanner;
public class Employee{
  int id;
  String name;
  String address;
  double salary,Hra,da,gs,incometax,netsalary;
  void read(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the emp id");
    Employee id=sc.nextInt();
    System.out.println("enter the emp name");
    Employee name=sc.next();
    System.out.println("enter the emp address");;
    Employee address=sc.next();
    System.out.println("enter the salary");
    Employee salary=sc.nextDouble();
    System.out.println("enter the hra");
    Employee Hra=sc.nextDouble();
    System.out.println("enter the da");
    Employee da=sc.nextDouble();
    
    
    
  }
  void calculateSalary(){
    HRA=0.1*salary;
    DA=0.73*salary;
    GS=salary+da+Hra;
    incometax=0.3*salary;
    netsalary=GS-incometax;
    
    
  }
  public void display(){
    System.out.println("employee id"+id);
    System.out.println("employee name"+name);
    System.out.println("employee salary"+salary);
      System.out.println("address"+address);
    System.out.println("hra"+HRA);
    
  }
}