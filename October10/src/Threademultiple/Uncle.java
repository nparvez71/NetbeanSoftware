
package Threademultiple;


public class Uncle implements Runnable{
    
    int i;
    
    @Override
    public void run() {
          i = 0;
        while (true) {

            System.out.println("uncle" + i++);
            if (i == 50) {
                break;
            }
        }
         }
    
}
