package acgn.akatsuki.template;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yXg
 * @version design-pattern V1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Slf4j
public class CharDisplay extends AbstractDisplay {

    private char ch;

    @Override
    protected void open() {
        log.info("{}", "<<");
    }

    @Override
    protected void print() {
        log.info("{}", ch);
    }

    @Override
    protected void close() {
        log.info("{}", ">>");
    }
}
