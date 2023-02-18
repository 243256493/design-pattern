package acgn.akatsuki;

import acgn.akatsuki.framework.Factory;
import acgn.akatsuki.framework.Product;
import acgn.akatsuki.idcard.EmpCardFactory;
import acgn.akatsuki.idcard.IdCardFactory;
import org.junit.Test;

/**
 * @author yXg
 * @version design-pattern V1.0
 **/
public class FactoryMethodPatternTest {

    @Test
    public void testIdCardFactory() {
        Factory factory = new IdCardFactory();
        Product card1 = factory.create("Shizuka");
        Product card2 = factory.create("Sakura");
        Product card3 = factory.create("Yuki");
        card1.use();
        card2.use();
        card3.use();
    }

    @Test
    public void testEmpCardFactory() {
        Factory factory = new EmpCardFactory();
        Product card1 = factory.create("Yui");
        Product card2 = factory.create("Hanako");
        Product card3 = factory.create("asuna");
        card1.use();
        card2.use();
        card3.use();
    }
}
