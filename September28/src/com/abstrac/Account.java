
package com.abstrac;
public class Account implements Balance{
  double balance=5000;

    @Override
    public void deposite(double amount) {
      balance+=amount;}

    @Override
    public void withdraw(double amount) {
         balance-=amount;}

    @Override
    public double chacke() {
      
    return balance;}
    
 

    
}
