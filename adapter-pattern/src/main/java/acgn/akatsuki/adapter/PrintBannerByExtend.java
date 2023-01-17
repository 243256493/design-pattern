package acgn.akatsuki.adapter;

import acgn.akatsuki.adaptee.Banner;
import acgn.akatsuki.target.Print;

/**
 * @author yXg
 * @version design-pattern V1.0
 **/
public class PrintBannerByExtend extends Banner implements Print {

    public PrintBannerByExtend() {
        super();
    }

    public PrintBannerByExtend(String string) {
        super(string);
    }

    @Override
    public void printWeek() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
