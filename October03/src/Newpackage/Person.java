/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Newpackage;

/**
 *
 * @author J2EE-33
 */
public class Person {

    private long id;
    private String name;
    private Gender gendr;
    private Country country;
    private double salary;

    public Person(long id, String name, Gender gendr, Country country, double salary) {
        this.id = id;
        this.name = name;
        this.gendr = gendr;
        this.country = country;
        this.salary = salary;

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gender getGendr() {
        return gendr;
    }

    public Country getCountry() {
        return country;
    }

    public double getSalary() {
        return salary;
    }

}
