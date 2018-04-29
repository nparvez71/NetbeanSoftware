package com.google;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.google.Country;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author J2EE-33
 */
@ManagedBean
public class CountryController {
    private Country country;
 String BirthDate ;
    public Country getCountry() {
        if(country == null){
        country = new Country();}
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
    
    
}
