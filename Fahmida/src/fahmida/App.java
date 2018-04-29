/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahmida;

import java.util.Comparator;
import java.util.TreeSet;



    public class App {

    public static void main(String[] args) {
        Comparator c = (Comparator) new GradeComp();
        TreeSet studentSet = new TreeSet(c);
        studentSet.add(new Student("Mili", "Khan", 123466, 4.78));
        studentSet.add(new Student("Sony", "Akter", 1234776, 4.98));
        studentSet.add(new Student("Afrah", "Awal", 123423, 5.00));
        studentSet.add(new Student("Hapy", "Priya", 128466, 4.00));
        Object[] studentArray = studentSet.toArray();
        
        Student s;
        for (Object obj : studentArray) {
            s = (Student) obj;
            System.out.println(s.firstName() + " " + 
                    s.lastName() + " " + s.studentID() + " " + " GPA: " + s.GPA());
        }
    }
}

    
