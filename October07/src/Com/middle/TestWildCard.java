package Com.middle;


import java.util.List;

public class TestWildCard {
    public static void insertElements(List<? super A> list) {
        list.add(new A());
         list.add(new B());
          list.add(new C());
         //  list.add(new D());// D is illigel because it not extend anyone.
    }
    
}
