/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corejavaproblems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsExample2 {

    public static int sum(List<Integer> list) {

        int sum = 0;


        for (Iterator<Integer> iter = list.iterator(); iter.hasNext(); ) {
            int i = ((Integer) iter.next()).intValue();
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(1400);
        list.add(25);
        

        System.out.println("The sum is : " + sum(list));

        for (int i : list) {
            System.out.println(i);
        }
    }
}