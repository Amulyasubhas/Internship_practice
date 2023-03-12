class Vehicle{
  String make;
  String model;
  int year;
  
}
class car extends Vehicle{
  String color;
  int no_of_doors;
  void getInfo(){
    System.out.println("make is"+make);
    System.out.println("model is"+model);
    System.out.println("year is"+year);
    System.out.println("color is"+color);
  }
}
public class VehicleDemo{
  public static void main(String args[]){
    car c=new car();
    c.make="lol";
    c.color="red";
    c.model="khoo";
    c.no_of_doors=5;
    c.getInfo();
  }
}
