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
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author J2EE-33
 */
public class AuditFilter implements Filter{
  private FilterConfig filterConfig = null;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
      this.filterConfig = filterConfig;
    
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
      long startTime = System.currentTimeMillis();
      String remoteAddress =request.getRemoteAddr();
      String remoteHost =request.getRemoteHost();
        HttpServletRequest myreq =(HttpServletRequest) request;
        String reqURI =myreq.getRequestURI();
        chain.doFilter(request, response);
        filterConfig.getServletContext().log(
        "user at IP"+remoteAddress+"("+remoteHost+") access resource "+ reqURI+
                " and used "+(System.currentTimeMillis() - startTime)+"ms"
        );
    }

    @Override
    public void destroy() {
  }
    
}
