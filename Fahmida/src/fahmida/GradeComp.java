
package fahmida;

import java.util.Comparator;

    
    
    public class GradeComp implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (((Student) o1).StudentID == ((Student) o2).StudentID) {
            return 0;
        } else if (((Student) o1).StudentID < ((Student) o2).StudentID) {
            return -1;
        } else {
            return 1;
        }
    }

}
    

