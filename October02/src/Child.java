/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J2EE-33
 */
public class Child extends Father{
    private int age;
    private double income;
    private double cproperty= property(50000);

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
    
   public double house (double i){
   cproperty-=i;
   return cproperty; }
    
   public double income (double i){
   cproperty+=i;
   return cproperty; }

  

  
    
}
