import java.util.StringTokenizer;
  class countToken{
    public static void main(String args[]){
      StringTokenizer s=new StringTokenizer("welcome to bitlab");
      int count=0;
      while(s.hasMoreTokens()){
        System.out.println(s.nextToken());
        count++;
      
      }
      System.out.println("the number of tokens are"+count);
    }
  }