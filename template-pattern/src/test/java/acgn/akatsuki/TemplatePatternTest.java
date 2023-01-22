package acgn.akatsuki;

import acgn.akatsuki.template.AbstractDisplay;
import acgn.akatsuki.template.CharDisplay;
import acgn.akatsuki.template.StringDisplay;
import org.junit.Test;

/**
 * @author yXg
 * @version design-pattern V1.0
 **/
public class TemplatePatternTest {

    @Test
    public void displayTest() {
        AbstractDisplay display1 = new CharDisplay('H');
        AbstractDisplay display2 = new StringDisplay("Hello, world!");
        AbstractDisplay display3 = new StringDisplay("Death NOte.");
        display1.display();
        display2.display();
        display3.display();
    }
}
