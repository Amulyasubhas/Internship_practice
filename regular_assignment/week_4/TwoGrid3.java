import java.util.Scanner;
  class TwoGrid3{
    public  static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number of row");
      int n=sc.nextInt();
      System.out.println("enter the number of columns");
      int m=sc.nextInt();
      System.out.println("enter the number of elements");
      for(int i=0;i<n;i++){
        for(int j=0;i<n;j++){
          a[i][j]=sc.nextInt();
        }
        System.out.println();
      }
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          if(arr[i][j]!=20){
            sum=sum+arr[i][j];
          }}}
      System.out.println(sum);
    }}