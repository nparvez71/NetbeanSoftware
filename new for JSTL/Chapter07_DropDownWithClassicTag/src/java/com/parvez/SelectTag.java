/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parvez;

import java.beans.PropertyDescriptor;
import java.util.Collection;
import java.util.Iterator;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.TagSupport;
public class SelectTag extends TagSupport {

    private String name;
    private String label;
    private String value;
    private Collection items;

    public void setName(String name) {
        this.name = name;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setItems(Collection items) {
        this.items = items;
    }

    public void setId(String id) {
        this.id = id;
    }

 
    

    public int doStartTag() throws JspException {

        Iterator iterator = items.iterator();
        try {
            JspWriter out = pageContext.getOut();
            out.print("<select name=\"");
            out.print(name);
            out.print("\">");
            while (iterator.hasNext()) {
                Object o = iterator.next();
                PropertyDescriptor labelPD
                        = new PropertyDescriptor(label, o.getClass());
                PropertyDescriptor valuePD
                        = new PropertyDescriptor(value, o.getClass());
                
                out.print("<option value=\"");
                out.print(valuePD.getReadMethod().invoke(o, new Object[]{}).toString());
                out.print("\">");
                out.print(labelPD.getReadMethod().invoke(o, new Object[]{}).toString());
                out.print("</option >");
            
          
                }
                out.print("</select>");
        } catch (Exception e) {
            throw new JspTagException(e.getMessage());
        }

        return SKIP_BODY;

    }

   
    
    
}
