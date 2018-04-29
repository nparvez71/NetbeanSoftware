
package Question18;

import java.io.File;

public class DOS {
    public static void main(String[] args) {
        File dir=new File("dir");
        dir.mkdir();
        File f1=new File("f1.doc");
        try {
            f1.createNewFile();
            
        } catch (Exception e) {;
        }
        File newDir1=new File("newDir1");
        dir.renameTo(newDir1);
        System.out.println("success..");
    }
}
