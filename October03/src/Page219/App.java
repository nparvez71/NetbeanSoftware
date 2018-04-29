
package Page219;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Person p = new Person(01, "parvez", Gender.MALE,Country.BANG);
         Person p1 = new Person(11, "jamal", Gender.MALE,Country.BANG);
          Person p2 = new Person(21, "fahmida", Gender.FEMALE,Country.BANG);
           Person p3 = new Person(31, "tomalika", Gender.FEMALE,Country.BANG);
        List<Person> personList = new ArrayList<>();
        personList.add(p);
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        System.out.println ("id"+" " +"Name"+" "+ "Gender"+ " "+"country");
        for (Person person : personList) {
            if(person.getGender() == Gender.FEMALE){
            System.out.println ("" + person.getId() +" "+person.getName()+" "+person.getGender()+" "+person.getCountry());
            }
        }
    }

}
