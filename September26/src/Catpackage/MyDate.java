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
public class MyDate {
     int day;
      int month;
       int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    MyDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals (Object o){
    boolean result = false;
    if((o!= null)&&(o instanceof MyDate)){
        MyDate d =(MyDate) o;
        if ((day == d.day)&&(month == d.month)&&(year == d.year)){
            result = true;
    }
    }
    return result;
    }
       @Override
       public int hashCode(){
           return(day<<4^month^year);
       }
    
    }
      
      
    

