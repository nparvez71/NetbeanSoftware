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
public class ThreadController {

    private Runner r = new Runner();
    private Thread t = new Thread(r);

    public  void StartThread() {
        t.start();
    }

    public void stopthread() {
        r.stopRunning();
    }
}
