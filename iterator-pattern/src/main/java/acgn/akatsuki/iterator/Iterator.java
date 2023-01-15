package acgn.akatsuki.iterator;

/**
 * 遍历集合的接口
 *
 * @author yXg
 * @version design-pattern V1.0
 **/
public interface Iterator<E> {

    /**
     * 判断是否存在下一个元素
     *
     * @return 存在则返回true，否则返回false
     */
    boolean hasNext();

    /**
     * 获取下一个元素
     *
     * @return 下一个元素
     */
    E next();
}
