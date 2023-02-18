package acgn.akatsuki.framework;

/**
 * 工厂类
 *
 * @author yXg
 * @version design-pattern V1.0
 **/
public abstract class Factory {

    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
