package acgn.akatsuki.adapter;

import acgn.akatsuki.adaptee.Banner;
import acgn.akatsuki.target.Print;

/**
 * @author yXg
 * @version design-pattern V1.0
 **/
public class PrintBannerByDelegate implements Print {

    private final Banner banner;

    public PrintBannerByDelegate() {
        this("Hello, Nero!");
    }

    public PrintBannerByDelegate(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeek() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
