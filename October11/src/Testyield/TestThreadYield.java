
package Testyield;

public class TestThreadYield implements Runnable{

    Thread t;
    TestThreadYield(String str){
    t =new Thread(this,str);
    t.start();
    }
    
    @Override
    public void run() {
        for(int i=0;i<20;i++){
        if((i%5)==0){
            System.out.println(Thread.currentThread().getName()+" yielding control");
            
            Thread.yield();
            
        }
        }
        System.out.println(Thread.currentThread().getName()+"finished");
       }
    
}
