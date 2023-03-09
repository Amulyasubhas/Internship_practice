import java.util.Scanner;
  class Employee{
    int eid;
    String name;
    double salary;
    Employee(int id,String n,double s){
      eid=id;
      name=n;
      salary=s;
      
    }
    void grossSalary(double hra,double da){
      double totalSal=hra+da+salary;
      System.out.println(totalSal);
    }
    void display(){
      System.out.println(eid+" "+name+" "+salary);
    }
  }
  
public class Employee{
  public static void main(String args[]){
    System.out.println("enter employee info");
    Scanner sc=new Scanner(System.in);
    Employee emp=new Employee(sc.nextInt(),sc.next(),sc.nextDouble());
    System.out.println("info");
    emp.display();
    emp.grossSalary(1200,1500);
  }
}