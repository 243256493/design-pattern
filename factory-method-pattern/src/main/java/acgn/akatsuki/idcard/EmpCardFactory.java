package acgn.akatsuki.idcard;

import acgn.akatsuki.framework.Factory;
import acgn.akatsuki.framework.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yXg
 * @version design-pattern V1.0
 **/
public class EmpCardFactory extends Factory {

    private final Map<Integer, String> database = new HashMap<>();

    private int serial = 100;


    @Override
    protected synchronized Product createProduct(String owner) {
        EmpCard empCard = new EmpCard(owner, serial);
        serial++;
        return empCard;
    }

    @Override
    protected void registerProduct(Product product) {
        EmpCard card = (EmpCard) product;
        database.put(card.getSerial(), card.getOwner());
    }

    public Map<Integer, String> getDatabase() {
        return database;
    }
}
