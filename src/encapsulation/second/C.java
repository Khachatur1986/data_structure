package encapsulation.second;

/**
 * Created by Khach on 24-Jan-19.
 */
public class C {
    private static int test;

    public C(int a) {
        C.test = a;
    }

    public int getTest(){
        return C.test;
    }

}
