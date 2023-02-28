import java.util.Scanner;
  class TwoD{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int a[][]={{12,45,36},{68,66,95},{45,26,78}};
      for(int i=0;i<3;i++){
        for(int j=0;j<3;j++)
        {
          System.out.print(a[i][j]+"");
          
        }
        System.out.println(a[0][1]);
      }
    }
    
  }