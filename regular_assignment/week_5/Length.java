import java.util.StringTokenizer;
  class Length{
    public static void main(String args[]){
      StringTokenizer s=new StringTokenizer("welcome to bitlabs");
      while(s.hasMoreTokens()){
        System.out.println(s.nextToken());
        
      }
      System.out.println(s.length());
    }
  }