/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parvez.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author J2EE-33
 */
public class SimpleFilter2 implements Filter{
    private FilterConfig filterConfig = null;
 
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig =filterConfig;
      }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        filterConfig.getServletContext().log("in simple file 222...");
        chain.doFilter(request, response);
        filterConfig.getServletContext().log("leaving  simple fil 22222");
  }

    @Override
    public void destroy() {
        
     }
}
