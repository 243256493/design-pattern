package acgn.akatsuki.aggregate;

import acgn.akatsuki.iterator.Iterator;

/**
 * 表示集合接口
 *
 * @author yXg
 * @version design-pattern V1.0
 **/
public interface Aggregate {

    /**
     * 生成一个用于遍历集合的迭代器
     *
     * @return 迭代器
     */
    Iterator<?> iterator();
}
