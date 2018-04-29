/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreatingFile;

import java.io.File;

/**
 *
 * @author J2EE-33
 */
public class TestFile {
    public static void main(String[] args) throws Exception {
        File newFile = new File("my new file.doc");
        printFileDetailts(newFile);
        
        boolean fileCreated =newFile.createNewFile();
        if(!fileCreated){
            System.out.println(newFile+"could not created");
        }
        printFileDetailts(newFile);
        
       newFile.delete();
        System.out.println("After deleting the new file");
         printFileDetailts(newFile);
        
        newFile.createNewFile();
        printFileDetailts(newFile);
        //last delete than exit
           newFile.deleteOnExit();
           System.out.println("After deletingonexit the new file");
          printFileDetailts(newFile);
    }
   
    public static void printFileDetailts(File f){
        System.out.println("Absolute path:"+f.getAbsoluteFile());
          System.out.println("Absolute path:"+f.exists());
    }
}
