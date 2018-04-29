
package com.Jdbc.DAO;

import com.Jdbc.Domain.Student;
import java.util.List;

public interface StudentDAO {
    public void save(Student s);
          public void update(Student s)   ;
              public void delete(int id);
     public List<Student>getStudents();
              public Student getStudent(int id);
              
}
