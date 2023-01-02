package acgn.akatsuki.operation;

/**
 * @author yXg
 * @version V1.0
 **/
public class Add implements Operation {
    @Override
    public double getResult(double a, double b) {
        return a + b;
    }
}
