import java.util.Scanner;
  class TwoSumEven{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int a[][]={{12,45,36},{68,66,95},{45,26,78}};
      
      int count=0,sum=0;
      for(int i=0;i<3;i++){
        sum=0;
        for(int j=0;j<3;j++){
          sum=a[i][j]+sum;
        }
        System.out.println(sum);}}}