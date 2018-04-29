/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page308;

/**
 *
 * @author J2EE-33
 */
public class Runner implements Runnable{
    private boolean timeToQuit=false;
public void run()
    {
        while (!timeToQuit){
            
        }
       }
    
    public void stopRunning(){
    timeToQuit=true;
    }
}
