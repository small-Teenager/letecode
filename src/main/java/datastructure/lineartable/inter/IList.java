package datastructure.lineartable.inter;

/**
 * ���Ա�
 *
 * @author Search
 */
public interface IList {

    /**
     * ���Ա��ÿղ���
     */
    void clear();

    /**
     * �ж����Ա��Ƿ�Ϊ�ղ���
     *
     * @return
     */
    boolean isEmpty();

    /**
     * ��ȡ���Ա���Ԫ�صĳ��Ȳ���
     *
     * @return
     */
    int length();

    /**
     * ��ȡָ��λ�������Ԫ�ز���
     *
     * @param i
     * @return
     */
    Object get(int i);

    /**
     * ��ָ��λ���������Ԫ�صĲ���
     *
     * @param i
     * @param x
     */
    void insert(int i, Object x);

    /**
     * ɾ��ָ��λ�������Ԫ�صĲ���
     *
     * @param i
     */
    void remove(int i);

    /**
     * ����ָ��Ԫ�ص�λ���״γ��ֵ�λ�ò���
     *
     * @param x
     * @return
     */
    int indexOf(Object x);

    /**
     * ��ʾ���Ա��е����ݲ���
     */
    void display();
}