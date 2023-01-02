package acgn.akatsuki.operation;

/**
 * 给定两个操作数，完成两操作数的运算，getResult实现需要的运算逻辑
 *
 * @author yXg
 * @version V1.0
 **/
public interface Operation {

    /**
     * 输入操作数a和b,输出通过给定运算表达的结果；
     *
     * @param a 操作数a
     * @param b 操作数b
     * @return a和b通过给定运算输出的结果
     */
    double getResult(double a, double b);
}
