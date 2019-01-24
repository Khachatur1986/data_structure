package encapsulation.first;

/**
 * Created by Khach on 24-Jan-19.
 */
public class B extends A {
    public int i = 30;

    @Override
    public int getI() {
        return i;
    }

    @Override
    public void addI() {
        i = i + 1000;
    }
}
