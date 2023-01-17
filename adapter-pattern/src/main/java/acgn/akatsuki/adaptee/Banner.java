package acgn.akatsuki.adaptee;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 实际情况
 *
 * @author yXg
 * @version design-pattern V1.0
 **/
@Slf4j
@AllArgsConstructor
public class Banner {

    private final String string;

    public Banner() {
        this("Ivy");
    }

    public void showWithParen() {
        log.info("({})", string);
    }

    public void showWithAster() {
        log.info("*{}*", string);
    }
}
