/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WriteFile;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author J2EE-33
 */
public class WriteToFile {
    public static void main(String[] args) {
        
        String destFile ="my_second_file.html";
        try(BufferedWriter bw =new BufferedWriter(new FileWriter(destFile))) {
            bw.append("Dhaka");
              bw.newLine();
              bw.append("Is");
               bw.newLine();
                bw.append("the");
                  bw.newLine();
                    bw.append("cpital");
                    
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            System.out.println("write done");
        }
        
        
    }
    
    
}
