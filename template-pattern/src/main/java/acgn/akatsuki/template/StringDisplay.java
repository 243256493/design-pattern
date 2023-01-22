package acgn.akatsuki.template;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yXg
 * @version design-pattern V1.0
 **/
@Slf4j
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StringDisplay extends AbstractDisplay{

    private String string;

    @Override
    protected void open() {
        printLine();
    }

    @Override
    protected void print() {
        log.info("|{}|", string);
    }

    @Override
    protected void close() {
        printLine();
    }

    private void printLine() {
        log.info("{}", "+");
        for (int i = 0; i < this.string.length(); i++) {
            log.info("{}", "-");
        }
        log.info("{}", "+");
    }
}
