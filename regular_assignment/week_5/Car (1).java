import java.util.*;

class Car {
  String name,model,color;
  int year;
   car(){
   model="eryy";
   color="red";
   year=125;

     }
  

  public void display() {
    
    System.out.println("The model of car is" + model);
    System.out.println("The color of the car" + color);
    System.out.println("The year of this car" + year);
  }




  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    Car Car1 = new Car();

    Car1.display();
  }}
