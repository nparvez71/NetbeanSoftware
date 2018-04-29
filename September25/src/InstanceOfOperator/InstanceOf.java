/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InstanceOfOperator;

/**
 *
 * @author J2EE-33
 */
public class InstanceOf {
    public static void main(String[] args) {
        System.out.println("r is emp and c is emp");
        Employee e =new Employee();
        doSomething(e);
         System.out.println("r is emp and c is emp");
        Employee e2 =new Manager();
        doSomething(e2);
        System.out.println("r is emp and c is emp");
        Employee e3 =new Engineer();
        doSomething(e3);
        
    }
    public static void doSomething(Employee e) {
        if(e instanceof Manager){
        System.out.println("Manager");
    }else if(e instanceof Engineer){
        System.out.println("Engineer");  
    }else {
           System.out.println("Employee"); 
        }
    }
}
