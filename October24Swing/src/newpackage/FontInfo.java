
package newpackage;

import java.awt.*;
import java.awt.Toolkit;
import java.util.Locale;


public class FontInfo {
    public static void main(String[] args) {
        Toolkit theKit=Toolkit.getDefaultToolkit();
        System.out.println("\nScreen Resolution:"+theKit.getScreenResolution()+"dots per inch");
        Dimension screenDim=theKit.getScreenSize();
        System.out.println("Screen size:"+screenDim.width+"by"+screenDim.height+"pixel");
        
        GraphicsEnvironment e= GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontnames=e.getAvailableFontFamilyNames();
        System.out.println("/n Font available on this platform:");
        int count=0;
        for(String fontname :fontnames)
        {System.out.printf("%-30s", fontname);
        if(++count %3==0){System.out.println("");}
        }    return;    
    }
}
