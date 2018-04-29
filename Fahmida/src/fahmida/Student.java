
package fahmida;


public class Student {

    String firstName, lastName;
    int StudentID;
    double GPA = 0.0;

    public Student(String firstName, String lastName, int StudentID, double GPA) {

        if (firstName == null || lastName == null || StudentID == 0 || GPA == 0.0) {
            throw new IllegalArgumentException();
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.StudentID = StudentID;
        this.GPA = GPA;
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public int studentID() {
        return StudentID;
    }

    public double GPA() {
        return GPA;
    }


}

   
    

