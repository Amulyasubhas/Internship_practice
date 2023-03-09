class StudentPar{
  int roll;
  String name,place;

  StudentPar(int r,String n,String p){
    roll=r;
    name=n;
    place=p;
  }

  void display(){
    System.out.println("student details " +roll+" "+name+" "+place);
  }
  public static void main(String args[]){
    StudentPar s=new StudentPar(10,"ammu","kun");
    s.display();
  }
}