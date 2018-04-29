/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author J2EE-33
 */
public class App {
    public static void main(String[] args) {
        
        User user1=new User(1225312,"Parevz","Bangladesh","nparvez@gmail.com");
        System.out.println("ID ="+user1.getId());
        System.out.println("UserName = "+user1.getUsername());
        System.out.println("Country = "+user1.getCountry());
        System.out.println("Email = "+user1.getEmail());
    }
    
}
