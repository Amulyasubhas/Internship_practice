import java.util.Scanner;
class CarPar{
  String name,model,color;
  int year;
  CarPar(String n,String m,String c,int y){
    name=n;
    model=m;
    color=c;
    year=y;
  }
  void display(){
    System.out.println(name+" "+model+" "+color+" "+year);
  }
}
class CarPar{
  public static void main(String args[]){
    Car st=new Car("bmw","new","red",12345);
    st.display();
  }
}