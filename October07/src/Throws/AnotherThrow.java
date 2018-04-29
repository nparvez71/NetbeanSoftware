
package Throws;

public class AnotherThrow {
    public static void main(String[] args) {
        try {
            AnotherThrow met =new AnotherThrow();
            System.out.println("length of dhaka"+met.getStringSize("dhaka"));
               System.out.println("length of kamal"+met.getStringSize("kamal"));
                  System.out.println("length of jamal"+met.getStringSize("jamal"));
        } catch (Exception ex) {
            System.out.println("exceeption message"+ex.getMessage());
        }
        }
    
        public int getStringSize(String str) throws Exception{
        if(str == null){
        throw new Exception("string inputt is null");
        }
        return str.length();
        }
    }
    

