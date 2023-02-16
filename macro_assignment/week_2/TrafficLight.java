import java.util.Scanner;
 class TrafficLight{
   public static void main(String args[]){
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the traffic flow");
     String traffic_flow=sc.next();
      System.out.println("Enter the time");
     int time=sc.next();
     if((time>=8 && time<=10) && (traffic_flow.equals("heavy"))){
       System.out.println("red light for east west and green for north south");
     }
     else if((time>=12 && time<14) && (traffic_flow.equals("low"))){
       System.out.println("red light for east west and green for north south");
     }
     else{
       System.out.println("yellow for all directions");
     }
     }
   }
 