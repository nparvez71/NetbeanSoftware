
package Page845;

import java.awt.Dimension;
import static java.awt.SystemColor.window;
import java.awt.Toolkit;

public class SKetcher {
    public static void main(String[] args) {
        window= new SKetchFrame("SKetcher");
        Toolkit theKit=window.getToolkit();
        Dimension wndSize=theKit.getScreenSize();
        window.setBounds(wndSize.width/4,wndSize.height/4,
                wndSize.width/2,wndSize.height/2);
        window.setVisible(true);
    }private static SKetchFrame window;
}
