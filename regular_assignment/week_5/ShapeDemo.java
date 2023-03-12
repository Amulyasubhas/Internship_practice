class Shape{
  String color;
  String filled;
}
class Rectangle extends Shape{
  double width;
  double height;
  void get_area(){
    double area=length*height;
    return area;
  }}
  public class ShapeDemo{
    public static void main(String args[]){
      Rectangle rectangle=new Rectangle();
      rectangle.color="red";
      rectangle.filled="yes";
      double area=rectangle.get_area();
      System.out.println("area is"+area);
    }
  }
  
  

