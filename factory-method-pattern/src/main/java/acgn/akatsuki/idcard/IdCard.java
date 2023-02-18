package acgn.akatsuki.idcard;

import acgn.akatsuki.framework.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * 身份证产品类
 *
 * @author yXg
 * @version design-pattern V1.0
 **/
@Slf4j
@Setter
@Getter
@NoArgsConstructor
public class IdCard extends Product {
    private String owner;

    IdCard(String owner) {
        this.owner = owner;
        log.info("Construct ID card of {}.", owner);
    }

    @Override
    public void use() {
        log.info("Use ID card of {}.", this.getOwner());
    }
}
