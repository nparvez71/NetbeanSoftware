
package Catpackage;

import java.util.Date;

public class ToString {
    
    public static void main(String[] args) {
       
         Date now=new Date();
    System.out.println(now);
        System.out.println("after using tostring"+now.toString());
        //
        
        String x="10";
        int y=Integer.parseInt(x);
        String z=Integer.toString(y);
        System.out.println("x as String" + " "+ x);
        System.out.println("y as int" +" "+ y);
        System.out.println("z as String"+" " + z);
    }
    
}
