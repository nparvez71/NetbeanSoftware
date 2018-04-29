/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Throws2;


public class CustomException extends Exception{
    private String message =null;
    public CustomException(){
    super();
    }
     public CustomException(String message ){
     super(message);
     this.message=message;
     }
     public CustomException(Throwable cause){
     super(cause);
     }

    @Override
    public String toString() {
        return  message ;
    }
  @Override
    public String getMessage() {
        return message;
    }

     
}
