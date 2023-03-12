class Animal{
  String name;
  String color;
  int no_of_legs;
  int tail_length;
  void eat(){
    System.out.println("eating...");
  }
}
class dog extends Animal{
  String bread;
  String type;
  void bark(){
    System.out.println("barking...");
  }

void display(){
  System.out.println(name+" "+color+" "+no_of_legs+" "+tail_length+" "+bread+" "+type);
}}
public class Inheritance{
  public static void main(String args[]){
    dog dog=new dog();
    dog.name="puppy";
    dog.color="red";
    dog.no_of_legs=5;
    dog.tail_length=5;
    dog.bread="lab";
    dog.type="hybrid";
    dog.display();
    dog.eat();
    dog.bark();
  }
}