package acgn.akatsuki.factory;

import acgn.akatsuki.operation.Operation;

/**
 * @author yXg
 * @version V1.0
 **/
public class OperationFactory {
    public static Operation buildOperation(Class<? extends Operation> operationClass) throws Exception {
        return operationClass.getConstructor().newInstance();
    }
}
