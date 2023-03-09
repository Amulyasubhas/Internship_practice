class Rectangle{
    int l,b,a; 
    Rectangle() 
   { 
   l=135; 
     b=12; 
   } 
   void Display() 
    { 
     a=l*b; 
   System.out.println("Area of Rectangle is : "+a); 
       } 
   } 
   class RectangleDefault 
       { 
 public static void main(String args[]) 
 { 
     Rectangle Rect = new Rectangle(); 
     Rect.Display(); 
   } 
}