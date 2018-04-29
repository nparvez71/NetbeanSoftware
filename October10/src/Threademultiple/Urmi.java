package Threademultiple;


public class Urmi implements Runnable{

int i;
    public void run() {
          i = 0;
        while (true) {

            System.out.println("Urmi" + i++);
            if (i == 50) {
                break;
            }
        }
         }

 

}
