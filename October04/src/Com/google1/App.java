/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.google1;

/**
 *
 * @author J2EE-33
 */
public class App {
    public static void main(String[] args) {
        Student student1 =new Student("jaharna", "akther", 501, 8.0);
          Student student2 =new Student("farjana", "akther", 502, 5.0);
          
          System.out.println("compare result:"+student1.compareTO(student2));
        
    }
}
