// Shapes: Create classes for different shapes (e.g. Circle, Rectangle, Triangle) that all extend a base Shape class. Each class should have methods to calculate the area and perimeter of the shape. You can also create a custom exception called InvalidDimensionsException to throw when the dimensions of a shape are invalid.
class InvalidDimennsionsException extends Exception{
  InvalidDimennsionsException(String str){
    super(str);
  }
}
class Circle extends shape{
 public static double area(String str) throws InvalidDimennsionsException{
   double radius;
   public Circle(double radius) throws InvalidDimennsionsException{
     if(radius<=10){
       throw new InvalidDimensionsException("radius is positive");
     }
     this.radius=radius;
   }
   public rectangle(double length,double width) throws InvalidDimennsionsException{
     if(length<=0 || width<=0){
       throw new InvalidDimensionsException("length and width is positive");
     }
     this.length=length;
     this.width=width;
  }
}
  class Mshapes{
    public static void main(String args[]){
      Shape s=new Shape();
      
    }
  }