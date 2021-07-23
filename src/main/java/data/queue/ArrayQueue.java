package data.queue;

/**
 * @author Search
 * @version 1.0
 * @date 2019/10/15 10:03
 * 用数组实现的队列
 */
public class ArrayQueue {

    /**
     * 数组：items，数组大小：n
     */
    private String[] items;
    private int n = 0;
    /**
     * head表示队头下标，tail表示队尾下标
     */
    private int head = 0;
    private int tail = 0;

    /**
     * 申请一个大小为capacity的数组
     *
     * @param capacity
     */
    public ArrayQueue(int capacity) {
        items = new String[capacity];
        n = capacity;
    }

    /**
     * 入队
     * 将item放入队尾
     *
     * @param item
     * @return
     */
    public boolean enqueue(String item) {
//        // 如果tail == n 表示队列已经满了
//        if (tail == n) {
//            return false;
//        }
//        items[tail] = item;
//        ++tail;
//        return true;
        if (tail == n) {
            //tail==n&&head==0 表示整个队列都满了
            if (head == 0) {
                return false;
            }
            //数据搬移
            for (int i = head; i < tail; ++i) {
                items[i - head] = items[i];
            }
            //搬移完之后重新更新head和tail
            tail -= head;
            head = 0;
        }
        items[tail] = item;
        ++tail;
        return true;
    }

    /**
     * 出队
     *
     * @return
     */
    public String dequeue() {
        // 如果head == tail 表示队列为空
        if (head == tail) {
            return null;
        }
        String ret = items[head];
        ++head;
        return ret;
    }

    public void printAll() {
        for (int i = head; i < tail; ++i) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }
}
