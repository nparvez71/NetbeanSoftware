
package com.abstrac;

public class App {
    
    public static void main(String[] args) {
         Account ac =new Account();
         ac.deposite(3000);
         ac.withdraw(2000);
      //   double presentBalance = ac.chacke();
         System.out.println("new balance"+ac.chacke());
    }
   
    
}
