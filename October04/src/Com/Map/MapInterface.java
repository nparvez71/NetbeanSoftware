/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author J2EE-33
 */
public class MapInterface {
    public static void main(String[] args) {
        
        Map map =new HashMap();
        map.put("One", "1st");
        map.put("Second", new Integer(2));
        map.put("third", "3rd");
        
        map.put("third", "III");
        
        Set set1=map.keySet();
        
        Collection collection=map.values();
        
        Set set2=map.entrySet();
        System.out.println(set1+"\n"+collection+"\n"+set2);
        
        
    }
    
    
}
