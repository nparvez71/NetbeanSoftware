package com.parvez;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.TagSupport;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J2EE-33
 */
public class DateTimeTag extends TagSupport{
    public int doStartTag() throws JspException{
        DateFormat dt=DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
        
        try {
            pageContext.getOut().write(dt.format(new Date()));
            
        } catch (IOException ioe) {
            throw new JspTagException(ioe.getMessage());
        }
        return SKIP_BODY;
    
    }
    
}
