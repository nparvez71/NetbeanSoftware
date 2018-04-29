/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parvez;

/**
 *
 * @author J2EE-33
 */
public class TicketTable {
    private int ticketcode;
      private String from;
       private String to;
       private String date;
       private int availableset;
        private int ticketamount;
         private int ticketprice;
        private int totalprice;

    public TicketTable() {
    }

    public TicketTable(int ticketcode, String from, String to, String date, int availableset, int ticketamount, int ticketprice, int totalprice) {
        this.ticketcode = ticketcode;
        this.from = from;
        this.to = to;
        this.date = date;
        this.availableset = availableset;
        this.ticketamount = ticketamount;
        this.ticketprice = ticketprice;
        this.totalprice = totalprice;
    }

    public TicketTable(int i, String uttara) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public int getTicketcode() {
        return ticketcode;
    }

    public void setTicketcode(int ticketcode) {
        this.ticketcode = ticketcode;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAvailableset() {
        return availableset;
    }

    public void setAvailableset(int availableset) {
        this.availableset = availableset;
    }

    public int getTicketamount() {
        return ticketamount;
    }

    public void setTicketamount(int ticketamount) {
        this.ticketamount = ticketamount;
    }

    public int getTicketprice() {
        return ticketprice;
    }

    public void setTicketprice(int ticketprice) {
        this.ticketprice = ticketprice;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }
        
        
}
