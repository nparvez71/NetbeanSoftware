
package com.janno;

public class App {
    public static void main(String[] args) {
       Managerff manager=new Managerff("philosophy", "parvez1", 25000);
        System.out.println(manager.getDetails());
        Employee m = new Managerff("philosophy", "parvez2", 25000);
            System.out.println(m.getDetailsx());
            Employee employee =new Employee("parvez3", 25000);
            System.out.println(employee.getDetailsx());
        
        
    }
    
}
