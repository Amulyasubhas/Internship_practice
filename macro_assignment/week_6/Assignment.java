class Person{
  String name;
  int age;}
  class Employee extends Person{
    double salary;
    String position;}
    class Manager extends Employee{
      int num_reports;
      int hire_employee(){
        return num_reports++;
      }}
      class Engineer extends Employee{
        String specialization;
        void solve_problem(){
          System.out.println("problem solved!!!");
        }
      }
    
  
  class Assignment{
    public static void main(String args[]){
      Manager emp=new Manager();
      emp.name="amulya";
      emp.age=23;
      emp.salary=120000;
      emp.position="manager";
      emp.num_reports=5;
    //  emp.specialization="cse";
     // emp.Manager();
    //  emp.solve_problem();
      System.out.println(emp.num_reports);
    }}
  
