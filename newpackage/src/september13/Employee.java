package september13;
public class Employee {
    private int id;
    private String name;
    private Department department;
    private double salary;

    public Employee(int id, String name, Department department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

   
}
