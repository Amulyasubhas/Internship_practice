import java.util.Scanner;
class Car{
  String name,model,color;
  int year;

  Car(){
    name="bmw";
    model="new";
    color="red";
    year=1234;
  }

  void display(){
    System.out.println("the name of the car is -"+name);
    System.out.println("the model of the car is -"+model);
    System.out.println("the color of the car is -"+color);
    System.out.println("the car launched in the year -"+year);
      System.out.println("/-/-/-/-/-/-/-/ \n");
    
  }

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Car c=new Car();
    c.display();
  }
}