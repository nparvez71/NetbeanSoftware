package september13;
public class App1 {
    public static void main(String[] args) {
        Employee1 employee1=new Employee1();
        employee1.setId(5001);
        employee1.setName("nParvez");
        employee1.setDepartment("HR");
        employee1.setSalary(25000.0);
        System.out.println("Id="+employee1.getId());
        System.out.println("Name="+employee1.getName());
        System.out.println("Department="+employee1.getDepartment());
        System.out.println("Salary="+employee1.getSalary());
        
                
    }
    
}
