// Write a Java program to iterate through all elements in a array list

import java.util.*;
public class Iterate{
  public static void main(String args[]){
    ArrayList<String>ele=new Arraylist<String>();
    ele.add("pen");
    ele.add("pencil");
    ele.add("eraser");
    for(int i=0;i<ele.size();i++){
      System.out.println(ele.get(i));}
    for(String ele:ele){
      System.out.println(ele);
    }
    }
  }
