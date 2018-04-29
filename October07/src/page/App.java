/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



/**
 *
 * @author J2EE-33
 */
public class App {
    
    public static void main(String[] args) {
        
        List <Students>list =new ArrayList<Students>();
        list.add(new Students("parvez",25));
         list.add(new Students("Jakir",29));
         
         Iterator<Students> elements =list.iterator();
         while (elements.hasNext()){
          //   System.out.println(""+elements.next().getFirstName());
           
             System.out.println(""+elements.next().getAge());
              //System.out.println(""+elements.next().getAge());
         }
    }
}
