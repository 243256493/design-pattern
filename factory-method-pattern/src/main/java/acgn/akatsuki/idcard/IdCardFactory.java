package acgn.akatsuki.idcard;

import acgn.akatsuki.framework.Factory;
import acgn.akatsuki.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * 身份证工厂类
 *
 * @author yXg
 * @version design-pattern V1.0
 **/
public class IdCardFactory extends Factory {

    private final List<String> owners = new ArrayList<>();

    @Override
    protected synchronized Product createProduct(String owner) {
        return new IdCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IdCard) product).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
