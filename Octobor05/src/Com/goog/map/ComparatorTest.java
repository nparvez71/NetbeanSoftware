package Com.goog.map;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorTest {

    public static void main(String[] args) {
        Comparator c = new NameComp();
        TreeSet studentSet = new TreeSet(c);
 
        studentSet.add(new Student("Parvez", "Mia", 1225312, 4.60));
        studentSet.add(new Student("fahim", "Mia", 1225311, 3.60));
        studentSet.add(new Student("raju", "Mia", 1225310, 2.60));
        studentSet.add(new Student("shamim", "Mia", 1225312, 5.0));

        Object[] studentArray = studentSet.toArray();
        Student s;
        for (Object obj : studentArray) {

            s = (Student) obj;
            
            System.out.println("Name " + s.firstName()+ " LastName " + s.lastName()+ " Id " + s.StudentId()+ " Gpa " + s.GPA());

        }
    }

}
