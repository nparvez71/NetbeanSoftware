/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.goog.map;

import java.util.Comparator;

/**
 *
 * @author J2EE-33
 */
public class NameComp implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
      return (((Student)o1).firstName().compareTo(((Student)o2).firstName()));
    }
    
}
