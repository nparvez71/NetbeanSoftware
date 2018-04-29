/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Catpackage;

/**
 *
 * @author J2EE-33
 */
public class TestEquals {
    public static void main(String[] args) {
         MyDate date1=new MyDate(14,3,2016);
          MyDate date2=new MyDate(14,3,2016);
          if(date1==date2){
              System.out.println("d1 is chaned to d2");}
          else{
           System.out.println("d1 is not chaned to d2");}
          
          if(date1.equals(date2)){
              System.out.println("d1 is equal to d2");}
          else{
           System.out.println("d1 is not not equal to d2");}
        
          System.out.println("set date2=d1;");
          date2=date1;
          
          if(date1==date2){
              System.out.println("d1 is chaned to d2");}
          else{
           System.out.println("d1 is not chaned to d2");}
          
    }
    
}
