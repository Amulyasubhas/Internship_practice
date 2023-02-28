import java.util.Scanner;
  class TwoEven{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int a[][]={{12,45,36},{68,66,95},{45,26,78}};
      
      int count=0;
      for(int i=0;i<3;i++){
        for(int j=0;j<3;j++)
        {
          if(a[i][j]%2==0){
            count++;
          }}}
          System.out.print(count);}}