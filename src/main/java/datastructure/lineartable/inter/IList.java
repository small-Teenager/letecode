package datastructure.lineartable.inter;

/**
 * 线性表
 *
 * @author Search
 */
public interface IList {

    /**
     * 线性表置空操作
     */
    void clear();

    /**
     * 判断线性表是否为空操作
     *
     * @return
     */
    boolean isEmpty();

    /**
     * 获取线性表中元素的长度操作
     *
     * @return
     */
    int length();

    /**
     * 获取指定位置上面的元素操作
     *
     * @param i
     * @return
     */
    Object get(int i);

    /**
     * 在指定位置上面插入元素的操作
     *
     * @param i
     * @param x
     */
    void insert(int i, Object x);

    /**
     * 删除指定位置上面的元素的操作
     *
     * @param i
     */
    void remove(int i);

    /**
     * 查找指定元素的位置首次出现的位置操作
     *
     * @param x
     * @return
     */
    int indexOf(Object x);

    /**
     * 显示线性表中的内容操作
     */
    void display();
}