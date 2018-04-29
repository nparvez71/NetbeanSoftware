/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Page219;

/**
 *
 * @author J2EE-33
 */
public class Person {
    private long id;
    private String name;
    private Gender gender;
    private Country country;

    public Person(long id, String name, Gender gender, Country country) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.country = country;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Country getCountry() {
        return country;
    }

  
    
    
}
