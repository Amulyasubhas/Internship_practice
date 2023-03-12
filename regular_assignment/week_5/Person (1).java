public class Person {
    String name;
    int age;
     char gender;
    
        void read() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the name");
    name = sc.next();
    System.out.println("enter the age");
    age = sc.nextInt();
          System.out.println("enter gender");
          gender=sc.next().charAt(0);
        }
    
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
      System.out.println("Gender: " + gender);
    }
    
    public int calculateBirthYear() {
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        return currentYear - age;
    }
    public static void main(String args[]) {
    Person person = new Person();
    person.read();
    person.display();
    person.calculateBirthYear();
  }
}
  

