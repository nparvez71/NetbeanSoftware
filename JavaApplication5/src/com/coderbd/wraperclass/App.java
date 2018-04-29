/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.wraperclass;

import com.coderbd.field.Stock;
import java.util.Date;

/**
 *
 * @author J2EE-33
 */
public class App {
    public static void main(String[] args) {
        
        Stock stock =new Stock("abc",500.0);
        System.out.println("symbol-"+stock.getSymbol()+"price-"+stock.getPrice()
        +"Date-"+stock.getDate());
    }
    
}
