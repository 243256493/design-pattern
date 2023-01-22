package acgn.akatsuki.template;

/**
 * 抽象AbstractDisplay
 *
 * @author yXg
 * @version design-pattern V1.0
 **/
public abstract class AbstractDisplay {

    protected abstract void open();

    protected abstract void print();

    protected abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
