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
public class Country {

    private String countryname;
    private long id;

    public Country(String countryname, long id) {
        this.countryname = countryname;
        this.id = id;
    }

    public String getCountryname() {
        return countryname;
    }

    public long getId() {
        return id;
    }

}
