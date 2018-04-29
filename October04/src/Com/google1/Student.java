
package Com.google1;


public  class Student implements Comparable{
    String firstName,lastName;
    int studentId=0;
    double GPA=0.0;

    public Student(String firstName, String lastName, int studentId, double GPA) {
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
     


    @Override
    public int compareTo(Object o) {
          double f = GPA-((Student)o).GPA;
     if(f == 0.0)
         return 0;
     else if (f<0.0)
         return -1;
     else 
         return 1;
    }

 
   
    
    
}
