/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JdbcDomain;

/**
 *
 * @author J2EE-33
 */
public class Employees {
    private int employyeeId;
private String lastName;

    public Employees() {
    }



    public Employees(int employyeeId, String lastName) {
        this.employyeeId = employyeeId;
        this.lastName = lastName;
    }

    public int getEmployyeeId() {
        return employyeeId;
    }

    public void setEmployyeeId(int employyeeId) {
        this.employyeeId = employyeeId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
}
