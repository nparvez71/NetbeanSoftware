/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parvez.DateTime;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author J2EE-33
 */
public class DateTimeTag extends SimpleTagSupport{
    public void doTag() throws JspException, IOException{
        DateFormat dt=DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
        getJspContext().getOut().write(dt.format(new Date()));
       
    }
    
    
}
