
package com.doodle;

public class App {
    
    public static void main(String[] args) {
        MyDate obj= new MyDate(23,9 , 2000);
        obj.addDays(5);
        System.out.println(obj.toString());
        System.out.println(obj.addDays(5));
        
    }
}
