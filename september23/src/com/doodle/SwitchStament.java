
package com.doodle;

public class SwitchStament {
    public static int x=10;
    public static int add(int value){
    x+=value;
    return x;
    }
      public static int substruct(int value){
    x-=value;
    return x;
    }
    
    public static void main(String[] args) {
        switch(x){
            case 10:
                System.out.println(" x:"+x);
                System.out.println("add:"+add(10));
                 System.out.println("substur:"+substruct(5));
                break;
            case 20:
          System.out.println("value is 20");
          break;
        
           case 30:
          System.out.println("value is 30");
          break;
           default:
               System.out.println("not recognised");
        }
        
    }
    
}
