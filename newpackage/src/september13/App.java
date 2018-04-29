/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package september13;

/**
 *
 * @author J2EE-33
 */
public class App {
    public static void main(String[] args) {
        Employee employee=new Employee(1225312,"Parvez",new Department("Philosophy"),15000.0);
        System.out.println("Id:-"+employee.getId());
         System.out.println("Name:-"+employee.getName());
          System.out.println("Department:-"+employee.getDepartment().getDepName());
           System.out.println("Salary:-"+employee.getSalary());
          
        
    }
    
}
