
package Exam;


public class Child implements Father{
    public String Childname;

      double amountOfProperty=5000;

    @Override
    public void name(String name) {
        }

    @Override
    public void amountOfProperty(double amoount) {
     amountOfProperty+= amoount; }

    @Override
    public void byHouse(double amoount) {
      amountOfProperty-= amoount;}

    @Override
    public void income(double amoount) {
     amountOfProperty+= amoount;}

    @Override
    public void age(int age) {
       }
    
}
