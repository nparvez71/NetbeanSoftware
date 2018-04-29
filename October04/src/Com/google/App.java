/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.google;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author J2EE-33
 */
public class App {
    public static void main(String[] args) {
        
        Student s1=new Student(101, "farjana", Gender.FEMALE,new SEction("A"), 400);
          Student s2=new Student(102, "sanjana", Gender.FEMALE, new SEction("B"), 400);
            Student s3=new Student(103, "faruk", Gender.MALE,  new SEction("C"), 1400);
              Student s4=new Student(104, "shakil;", Gender.MALE,  new SEction("D"), 1800);
              List<Student> studentList=new ArrayList<>();
              
              studentList.add(s1);
               studentList.add(s2);
                studentList.add(s3);
                 studentList.add(s4);
                 
                 System.out.println("Size"+ studentList.size());
                 System.out.println("ID"+"Nmae"+"GenDer"+"Section"+"Fees");
                 for(Student s:studentList){
                     System.out.println(""+s.getId()+""+s.getName()+""+s.getGender()+""+s.getSection()+""+s.getMontlyFees());
                 }
    }
    
}
