/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parvez.checkbox;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author J2EE-33
 */
@ManagedBean
public class Checkbox {

    private String status;
    private String[] countries;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;

    }

    public String[] getCountries() {
        return countries;
    }

    public void setCountries(String[] countries) {
        this.countries = countries;
    }

    public void checkDisplay() {
        System.out.println("chhh" + status);
        for (String s : countries) {
            System.out.println("countries;;" + s + ",");
        }

    }

}
