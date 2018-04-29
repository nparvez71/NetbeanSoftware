/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.google3;

import java.util.Comparator;

/**
 *
 * @author J2EE-33
 */
public class GradeComp implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        if(((page228)o1).GPA == ((page228)o2).GPA)
            return 0;
        else if (((page228)o1).GPA < ((page228)o2).GPA)
            return -1;
        else 
            return 1;
      }
    
    
}
