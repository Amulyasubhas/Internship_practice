import java.util.Scanner;
  class TwoGrid{
    public  static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number of row");
      int n=sc.nextInt();
      System.out.println("enter the number of elements");
      for(int i=0;i<n;i++){
        for(int j=0;i<n;j++){
          a[i][j]=sc.nextInt();
        }
        System.out.println();
      }
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          if(a[i][j]>10 && a[i][j]!=20){
            count++;
            break;
          }
        }
      }
      if(count==0)
        System.out.println("yes");
      else
        System.out.println("no");
    }
  }