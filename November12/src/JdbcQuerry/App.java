/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JdbcQuerry;

import JdbcDomain.Employees;
import java.util.List;

/**
 *
 * @author J2EE-33
 */
public class App {
    public static void main(String[] args) {
        List<Employees>employeeList=DataRetrive.getEmployee();
        for(Employees e:employeeList){
            System.err.println("Emp id"+e.getEmployyeeId()+"name"+e.getLastName());
        }
    }
    
}
