package acgn.akatsuki.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 表示书的类
 *
 * @author yXg
 * @version design-pattern V1.0
 **/
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String name;

    public String getName() {
        return name;
    }
}
