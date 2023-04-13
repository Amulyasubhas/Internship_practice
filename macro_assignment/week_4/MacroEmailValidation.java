import java.util.regrex.Matcher;
import java.util.regrex.Pattern;
import java.util.Scanner;

  class MacroEmailValidation{
    static  boolean  verifyEmail(String email ){
      String patternString= "[a-zA-Z0-9.%+-]+[@]+[a-zA-Z]+\\.[a-z]{2,3}$";
      Pattern pattern = Pattern.compile(patternString);
      Matcher matcher = pattern.matcher(email);
      return matcher.matches();
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      String email=sc.nextLine();
      Boolean op=verifyEmail(email);
      if(op==true)
        System.out.println("matched!!!");
      else
        System.out.println("not matched");
    }
      
    }
  