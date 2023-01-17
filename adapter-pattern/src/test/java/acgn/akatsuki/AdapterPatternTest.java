package acgn.akatsuki;

import acgn.akatsuki.adapter.PrintBannerByDelegate;
import acgn.akatsuki.adapter.PrintBannerByExtend;
import org.junit.Test;

/**
 * @author yXg
 * @version design-pattern V1.0
 **/
public class AdapterPatternTest {

    @Test
    public void printBannerByExtendTest() {
        PrintBannerByExtend printBanner = new PrintBannerByExtend("Hello, Death Note!");
        printBanner.printWeek();
        printBanner.printStrong();
    }

    @Test
    public void printBannerByDelegateTest() {
        PrintBannerByDelegate printBanner = new PrintBannerByDelegate();
        printBanner.printWeek();
        printBanner.printStrong();
    }
}
