
package com.org;

public class AnnonymousInnerDemmo {
    
    public static void main(String[] args) {
        BBforannonymous bb =new BBforannonymous(){
        
          @Override
          public void displayMsg(){
              
        System.out.println(" hey,, im from....class a");
    }
        
        };
        bb.displayMsg();
        
    }
    }
    

