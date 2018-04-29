/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import com.parvez.TicketTable;
import java.util.List;

/**
 *
 * @author J2EE-33
 */
public interface Ticketdao {

    
    public void save(TicketTable tb);
//we shall update student object according to student ID into database.

    public void update(TicketTable tb);
//we shall delete student object from database according to ID.

    public void delete(int id);
//if we want to get all rows from database table then we shall return list of Student

    public List<TicketTable> getTicketTables();

    //if we want to get a single / one row from database table according to ID then we shall return  Student 
    public TicketTable getStudent(int id);
}
    

