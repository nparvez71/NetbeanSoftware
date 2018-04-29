/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic.com;

import java.util.ArrayList;

/**
 *
 * @author J2EE-33
 */
public class Autoboxing {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0, 5);
        list.add(1, 4);
          list.add(2, 8);
        list.add(3, 4);
        int ip = list.get(3);
        System.out.println("" + ip);
       
       
       // System.out.println("" + list);//(show all aarray with out for)
    }

}
