/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreatingFile;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author J2EE-33
 */
public class Testfile1 {
    public static void main(String[] args) throws IOException {
        File firstfile =new File("myFirst_file.txt");
        File secondfile =new File("mysecondfile_file.txt");
        boolean fileCreated =firstfile.createNewFile();
        if(fileCreated ||firstfile.exists()){
        printFileDetailts(firstfile);
                printFileDetailts(secondfile);
        }
    }
     public static void printFileDetailts(File f){
        System.out.println("Absolute path:"+f.getAbsoluteFile());
          System.out.println("Absolute path:"+f.exists());
    }
    
}
