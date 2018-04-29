
package Catpackage;


public class EqualUsing {
    public static void main(String[] args) {
        String p ="hello";
         String q = new String(new char[]{'h','e','l','l','o'});
        System.out.println(p == q);  //false
         System.out.println(p.equals(q));  //true
        //
          String m ="hello";
          String n ="hel"+"lo";
          System.out.println(m == n); //true
           System.out.println(m.equals(n)); 
    }
    
}
