public class Person implements Comparable<Person>{
  private String name;
  private int age;
  public Person(String name,int age){
    this.name=name;
    this.age=age;
  }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
  public int compareTo(Person o){
    int ageComparison=Integer.compare(this.getAge(),o.getAge() );
    if(ageComparison==o){
      return this.getName().compareTo(o.getName());
    }
    return ageCompare;
    }
  public static class AgeComparator implements Comparator<Person>{
    public int compare(Person o1,Person o2){
      return Integer.compare(o1.getAge(), o2.getAge());
    }
    class PersonDemo{
      public static void main(String args[]){
        ArrayList<Person>persons=new ArrayList<Person>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
          persons.add(new Person(sc.next(),sc.nextInt()));
        }
        
      }
    }
  }
    }
  }
  }
}