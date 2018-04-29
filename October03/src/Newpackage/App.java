package Newpackage;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Person p1 = new Person(01, "parvez", Gender.MALE, new Country("bang", 101), 10000);
        Person p2 = new Person(02, "sharirar", Gender.MALE, new Country("bang", 101), 10000);
        Person p3 = new Person(03, "jakir", Gender.MALE, new Country("india", 101), 10500);
        Person p4 = new Person(04, "firoja", Gender.FEMALE, new Country("usa", 101), 19000);
        Person p11 = new Person(11, "shabib", Gender.MALE, new Country("bang", 101), 10000);
        Person p12 = new Person(12, "urmi", Gender.FEMALE, new Country("bang", 101), 10000);
        Person p13 = new Person(13, "shamim", Gender.MALE, new Country("india", 101), 10500);
        Person p14 = new Person(14, "rohul", Gender.FEMALE, new Country("usa", 101), 19000);
        List<Person> personList = new ArrayList<>();

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p11);
        personList.add(p12);
        personList.add(p13);
        personList.add(p14);
        System.out.println("size" + personList.size());
        System.out.println("ID" + "Name" + "Gender" + "Country" + "Salary");
        for (Person p : personList) {
            if (p.getGendr() == Gender.FEMALE && p.getCountry().getCountryname() == "USA") {
                System.out.println("" + p.getId() + "" + p.getName() + "" + p.getGendr() + "" + p.getCountry().getCountryname() + "" + p.getSalary()
                );
            }
        }

    }
}
