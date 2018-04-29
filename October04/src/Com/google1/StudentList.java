
package Com.google1;

import java.util.TreeSet;



public class StudentList {
    public static void main(String[] args) {
        TreeSet studentSet=new TreeSet();
        studentSet.add(new Student("Mike","Hauffmammn",101,4.0));
        studentSet.add(new Student("John","Lynn",102,2.8));
         studentSet.add(new Student("Jim","Max",103,3.6));
        studentSet.add(new Student("kelly","Grant",104,2.3));
        
        Object[] studentArrary =studentSet.toArray();
        Student s;
        for(Object obj : studentArrary){
        s =(Student) obj;
         System.out.println("fName="+ s.firstName()+"lname:"+s.lastName()+"id"+s.studentId()+"gpa"+s.GPA());
        
        
           // System.out.println("fName= %s %s Id = %d GPA =%f",
                 //   s.firstName(),s.lastName(),s.studentId(),s.GPA());
           // = "+s.studentId+" GPA = "+s.GPA);
        }
        
    }
    
}
