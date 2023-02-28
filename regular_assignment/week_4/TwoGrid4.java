import java.util.*;
class TwoGrid4{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter number of rows");
    int n=sc.nextInt();
    int sum=0;
    System.out.println("enter number of columns");
    int m=sc.nextInt();
    int arr[][]=new int[n][m];
    int i,j,count=0;
    System.out.println("enter elements ");
    // reading elements
      for(i=0;i<n;i++){
      for (j=0;j<m;j++){
        arr[i][j]=sc.nextInt();
      }
        System.out.println();
    }
    for(i=0;i<n;i++){
      for(j=0;j<m;j++){
        if(arr[i][j]!=20){
          sum=sum+arr[i][j];
        }
      }
    }
    System.out.println(sum);
  }

}