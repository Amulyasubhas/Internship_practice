import java.io.FileWriter;
class File1{
  public static void main(String args[]){
try{
  FileReader fr=new FileReader("abc.txt");
  int i;
  while((i=fr.read())!=-1){
    System.out.println((char)i);
    
  }
}
    catch(Exception e){
      System.out.println(e);
    }}}