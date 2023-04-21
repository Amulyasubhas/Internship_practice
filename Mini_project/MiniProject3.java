// [15:52] Lalitha Ujjaneni
//     Create a program that simulates an organization with different types of employees and departments. The program should have the following classes/interfaces:
// Employee - This is an abstract class that has the properties of an employee such as name, age, salary, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them.
// Department - This is an abstract class that has the properties of a department such as name, budget, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them. It should also have an interface named "Operation" that has a method named "performOperation" which will be implemented by different department operations such as hiring, firing, budget allocation, etc.
// Manager - This is a derived class of the Employee class. It should have additional properties such as team, department, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them.
// Developer - This is a derived class of the Employee class. It should have additional properties such as technology, experience, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them.
// Marketing - This is a derived class of the Department class. It should have additional properties such as campaigns, events, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them. It should also implement the "Operation" interface with a method implementation of the "performOperation" method that will simulate marketing campaigns and events.
// IT - This is a derived class of the Department class. It should have additional properties such as technology, infrastructure, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them. It should also implement the "Operation" interface with a method implementation of the "performOperation" method that will simulate IT operations such as hiring, firing, and budget allocation.
// In the main method, create objects of different types of employees and departments, and simulate employee management and department operations by calling the "performOperation" method of the respective department.

abstract class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class Manager extends Employee {
    private String team;
    private String department;

    public Manager(String name, int age, double salary, String team, String department) {
        super(name, age, salary);
        this.team = team;
        this.department = department;
    }

    public String getTeam() {
        return team;
    }

    public String getDepartment() {
        return department;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
class Developer extends Employee {
    private String technology;
    private int experience;

    public Developer(String name, int age, double salary, String technology, int experience) {
        super(name, age, salary);
        this.technology = technology;
        this.experience = experience;
    }

    public String getTechnology() {
        return technology;
    }

    public int getExperience() {
        return experience;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
interface Operation {
    void performOperation();
}

abstract class Department implements Operation {
    private String name;
    private double budget;

    public Department(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public double getBudget() {
        return budget;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
class Marketing extends Department {
    private String campaigns;
    private String events;

    public Marketing(String name, double budget, String campaigns, String events) {
        super(name, budget);
        this.campaigns = campaigns;
        this.events = events;
    }

    public String getCampaigns() {
        return campaigns;
    }

    public String getEvents() {
        return events;
    }

    public void setCampaigns(String campaigns) {
        this.campaigns = campaigns;
    }

    public void setEvents(String events) {
        this.events = events;
    }
    public void performOperation() {
        System.out.println("Performing marketing operations...");
    }
}
class IT extends Department {
    private String technology;
    private String infrastructure;

    public IT(String name, double budget, String technology, String infrastructure) {
        super(name, budget);
        this.technology = technology;
        this.infrastructure = infrastructure;
    }

    public String getTechnology() {
        return technology;
    }

    public String getInfrastructure() {
        return infrastructure;
    }

    public void setTechnology(String technology)
}
}

public void setInfrastructure(String infrastructure) {
    this.infrastructure = infrastructure;
}


public void performOperation() {
   System.out.println("Performing IT operations...");
}}

public class MiniProject3 {
public static void main(String[] args) {
Manager manager = new Manager("John Doe", 35, 5000.0, "Sales", "Marketing");
Developer developer = new Developer("Jane Smith", 28, 4000.0, "Java", 3);
Marketing marketing = new Marketing("Marketing", 100000.0, "Email campaign", "Product launch event");
IT it = new IT("IT", 500000.0, "Cloud computing", "Data center");
      marketing.performOperation();
    it.performOperation();
}
}



