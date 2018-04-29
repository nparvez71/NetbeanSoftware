/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parvez.controller;

import com.sun.faces.util.MessageUtils;

/**
 *
 * @author masum
 */
public class Controller {
    
    
    public  void addMessage(){
        boolean selectValue = false;
    String summaryKey = selectValue ? "checkbox.checked" : "checkbox.unchecked" ;
        MessageUtil.addInfoMessage(summaryKey);
    
    }
     public  void onDateSelect(DateSelectEvent event){
     
     Date date =event.getDate();
      MessageUtil.addInfoMessage("selected.date",date);
     }
    
}
