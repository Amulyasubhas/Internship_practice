import java.util.Scanner;
  class TwoAddMatrix{
    public  static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int a[][]={{1,2,3},{3,4,50},{6,4,7}};
      int b[][]={{7,2,3},{3,4,50},{6,4,7}};
      int c[][]=new int[3][3];
      
      for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
          c[i][j]=a[i][j]+b[i][j];
          System.out.println(c[i][j]+" ");
        }
        

        System.out.println();}}}