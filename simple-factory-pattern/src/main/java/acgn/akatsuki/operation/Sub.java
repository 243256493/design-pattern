package acgn.akatsuki.operation;

/**
 * @author yXg
 * @version V1.0
 **/
public class Sub implements Operation {
    @Override
    public double getResult(double a, double b) {
        return a - b;
    }
}
