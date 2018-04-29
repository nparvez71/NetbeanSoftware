
package Com.goog.map;


public class Student {
    String firstName,lastName;
    int studentId;
    double GPA;

    public Student(String firstName, String lastName, int studentId, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.GPA = GPA;
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public int StudentId() {
        return studentId;
    }

    public double GPA() {
        return GPA;
    }
    
    
}
