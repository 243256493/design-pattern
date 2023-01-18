package acgn.akatsuki.adapter;

import acgn.akatsuki.target.FileIo;
import lombok.Getter;
import lombok.Setter;

import java.io.*;
import java.nio.file.Files;
import java.util.Properties;

/**
 * @author yXg
 * @version design-pattern V1.0
 **/
@Setter
@Getter
public class FileProperties implements FileIo {

    private static String DEFAULT_COMMENT = "written by FileProperties";

    private final Properties properties;

    public FileProperties() {
        this.properties = new Properties();
    }

    @Override
    public void readFromFIle(String filename) throws IOException {
        properties.load(Files.newInputStream(new File(filename).toPath()));
    }

    @Override
    public void write2File(String filename) throws IOException {
        properties.store(Files.newOutputStream(new File(filename).toPath()), DEFAULT_COMMENT);
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
