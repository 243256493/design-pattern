package acgn.aktatsuki;

import acgn.akatsuki.factory.OperationFactory;
import acgn.akatsuki.operation.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author yXg
 * @version V1.0
 **/
public class OperationFactoryTest {

    public static final double NUMBER_A = 10d;

    public static final double NUMBER_B = 20d;

    @Test
    public void testAdd() throws Exception {
        Operation operation = OperationFactory.buildOperation(Add.class);
        double result = operation.getResult(NUMBER_A, NUMBER_B);
        Assert.assertEquals(30, result, 1E-6);
    }

    @Test
    public void testSub() throws Exception {
        Operation operation = OperationFactory.buildOperation(Sub.class);
        double result = operation.getResult(NUMBER_A, NUMBER_B);
        Assert.assertEquals(-10, result, 1E-6);
    }

    @Test
    public void testMul() throws Exception {
        Operation operation = OperationFactory.buildOperation(Mul.class);
        double result = operation.getResult(NUMBER_A, NUMBER_B);
        Assert.assertEquals(200, result, 1E-6);
    }

    @Test
    public void testDiv() throws Exception {
        Operation operation = OperationFactory.buildOperation(Div.class);
        double result = operation.getResult(NUMBER_A, NUMBER_B);
        Assert.assertEquals(0.5d, result, 1E-6);
    }
}
