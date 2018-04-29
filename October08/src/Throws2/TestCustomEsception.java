/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Throws2;

/**
 *
 * @author J2EE-33
 */
public class TestCustomEsception {
    public static void main(String[] args) {
        try {
            TestCustomEsception.myTestmethod(null);
        } catch (CustomException mae) {
            System.out.println("inside catch bloock"+mae.getMessage());
        }
    }
  static void  myTestmethod(String str) throws CustomException{
  if(str == null){
  throw new CustomException("String value is null");
  }
  }
}
