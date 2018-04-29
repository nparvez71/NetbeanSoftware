
public class Static {

    static int x = 10;

//    public static void main(String[] args) {
//        //Static st = new Static();
//        System.out.println(x);
//    }
}

class B{
    public static void main(String[] args) {
        System.out.println(Static.x);
    }
}