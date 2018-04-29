/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreatingFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author J2EE-33
 */
public class FileCreating {
    
    public static void main(String[] args)throws IOException{
        File f=new File("OldFile.txt");
         File f1=new File("OldFile1.txt");
         File f2=new File("oldFile2.doc");
         f.createNewFile();
         f1.createNewFile();
         f2.createNewFile();
         f2.delete();
         f2.createNewFile();
         f.renameTo(f1);
         try {BufferedWriter bw =new BufferedWriter(new FileWriter("OldFile1.txt"));
         
        } catch (Exception e) {
        }
         
         
         
         
    }
    
}
