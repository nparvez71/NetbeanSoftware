/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.google3;

import Com.Google2.*;

/**
 *
 * @author J2EE-33
 */
public class page228 {
    
     String firstName,lastName;
    int studentId=0;
    double GPA=0.0;

    public page228(String firstName, String lastName, int studentId, double GPA) {
        if(firstName==null ||lastName==null || studentId==0 ||GPA==0.0)
        {throw new IllegalArgumentException();}
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.GPA = GPA;
    }

    public String firstName(){return firstName;}
    public String lastName(){return lastName;}
     public int studentId(){return studentId;}
     public double GPA(){return GPA;}
     
    public int compareTo(Object o) {
          double f = GPA-((page228)o).GPA;
     if(f == 0.0)
         return 0;
     else if (f<0.0)
         return -1;
     else 
         return 1;
    }

  
     
}
