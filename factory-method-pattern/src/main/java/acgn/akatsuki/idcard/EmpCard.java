package acgn.akatsuki.idcard;

import acgn.akatsuki.framework.Product;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yXg
 * @version design-pattern V1.0
 **/
@Setter
@Getter
@Slf4j
public class EmpCard extends Product {

    private String owner;

    private int serial;

    EmpCard(String owner, int serial) {
        this.owner = owner;
        this.serial = serial;
        log.info("Construct EMP:{} card of {}.", serial, owner);
    }

    @Override
    public void use() {
        log.info("Use EMP:{} card of {}.", getSerial(), this.getOwner());
    }
}
