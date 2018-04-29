
package Generic.com;

import java.util.ArrayList;


public class TestGeneric {
    
    public static void main(String[] args) {
        
      ArrayList<String> list=new ArrayList<String>();
      list.add("Rahul");
      list.add("jai");
     // list.add(32);
      String s =list.get(1);
        System.out.println("element is:"+s);
        
      /*  Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(""+itr.next());}*/
        for ( String fs : list ){
        System.out.println(fs);
        
        }
        
        }
      
        
    }
    

