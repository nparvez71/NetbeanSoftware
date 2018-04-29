/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.google;

/**
 *
 * @author J2EE-33
 */
public class Student {
    
    private long id;
    private String name;
    private Gender gender;
    private String section;
    private double montlyFees;

    public Student(long id, String name, Gender gender, String section, double montlyFees) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.section = section;
        this.montlyFees = montlyFees;
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

    public String getSection() {
        return section;
    }

    public double getMontlyFees() {
        return montlyFees;
    }
    
    
}
