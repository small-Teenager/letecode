package datastructure.lineartable;

/**
 * @author Search
 */
public class Node {
    // ��Ž���ֵ
    private Object data;
    // ��̽�������
    private Node next;

    // �޲���ʱ�Ĺ��캯��
    public Node() {
        this(null, null);
    }

    // ����һ������ʱ�Ĺ��캯��
    public Node(Object data) {
        this(data, null);
    }

    // ������������ʱ�Ĺ��캯��
    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
