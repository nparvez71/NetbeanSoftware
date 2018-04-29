
package fahmida;

import java.util.Comparator;



    
    public class NameComp implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
      return
             (((Student)o1).firstName.compareTo(((Student)o2).firstName));
    }
    
}
    

