/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandlineArgument;

import com.sun.org.apache.xerces.internal.xs.PSVIProvider;

/**
 *
 * @author J2EE-33
 */
public class TestArgument {
    public static void main(String[] args) {
        
        args=new String[3];
        args[0]="parvez";
        args[1]="garvez";
        args[2]="sarvez";
        for (int i = 0; i< args.length; i++){
            System.out.println("args[" + i + "] is'"+args[i]+" ' ");
        }
    }
    
}
