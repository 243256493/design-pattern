package acgn.akatsuki;

import acgn.akatsuki.adapter.FileProperties;
import acgn.akatsuki.adapter.PrintBannerByDelegate;
import acgn.akatsuki.adapter.PrintBannerByExtend;
import acgn.akatsuki.target.FileIo;
import acgn.akatsuki.target.Print;
import org.junit.Test;

import java.io.IOException;

/**
 * @author yXg
 * @version design-pattern V1.0
 **/
public class AdapterPatternTest {

    private static final String INPUT_FILE_NAME = "src/test/resources/file/file.properties";

    private static final String OUTPUT_FILE_NAME = "src/test/resources/file/new.properties";

    @Test
    public void printBannerByExtendTest() {
        Print printBanner = new PrintBannerByExtend("Hello, Death Note!");
        printBanner.printWeek();
        printBanner.printStrong();
    }

    @Test
    public void printBannerByDelegateTest() {
        Print printBanner = new PrintBannerByDelegate();
        printBanner.printWeek();
        printBanner.printStrong();
    }

    @Test
    public void filePropertiesTest() {
        FileIo fileIo = new FileProperties();
        try {
            fileIo.readFromFIle(INPUT_FILE_NAME);
            fileIo.setValue("month", "4");
            fileIo.setValue("day", "21");
            fileIo.write2File(OUTPUT_FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
