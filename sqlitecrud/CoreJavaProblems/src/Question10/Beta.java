/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

/**
 *
 * @author J2EE-33
 */
public class Beta {
    class A implements Foo{

        @Override
        public int bar() {
            return 1;
            
          
        }
        public  int fubar(Foo foo){return foo.bar();
        
        }
    }
}
