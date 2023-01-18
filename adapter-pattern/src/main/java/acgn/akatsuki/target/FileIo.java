package acgn.akatsuki.target;

import java.io.IOException;

/**
 * @author yXg
 * @version design-pattern V1.0
 **/
public interface FileIo {

    /**
     * 读取文件
     *
     * @param filename 文件名
     * @throws IOException IO异常
     */
    void readFromFIle(String filename) throws IOException;

    /**
     * 写入文件
     *
     * @param filename 文件名
     * @throws IOException IO异常
     */
    void write2File(String filename) throws IOException;

    /**
     * 设键值对
     *
     * @param key 键
     * @param value 值
     */
    void setValue(String key, String value);

    /**
     * 获取值
     *
     * @param key 键名
     * @return 键值
     */
    String getValue(String key);
}
