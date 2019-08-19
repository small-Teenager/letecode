package datastructure.lineartable;

import datastructure.lineartable.inter.IList;

/**
 * @author Search
 * 线性表的顺序存储及实现
 */
public class SqList implements IList {
    // 线性表存储空间
    private Object[] listElem;
    // 线性表的当前长度
    private int curLen;

    /**
     * 顺序表类的构造函数，构造一个存储空间容量为maxSize的线性表
     *
     * @param maxSize
     */
    public SqList(int maxSize) {
        curLen = 0;
        listElem = new Object[maxSize];
    }

    public void clear() {
        // 置顺序表的当前长度为0
        curLen = 0;
    }

    public boolean isEmpty() {
        return curLen == 0;
    }

    public int length() {
        // 返回顺序表的当前长度
        return curLen;
    }

    public Object get(int i) {
        if (i < 0 || i >= curLen) {
            throw new RuntimeException("the" + i + "element does not exist");
        }
        return listElem[i];
    }

    public void insert(int i, Object x) {
        // 判断表是否满了
        if (curLen == listElem.length) {
            throw new RuntimeException("storage space is full and new elements cannot be inserted");
        }
        // 插入的位置不合法
        if (i < 0 || i > curLen) {
            throw new RuntimeException("Illegal insertion position");
        }
        // 必须要从最后一个元素开始依次逐个后移动，直到第i个数据元素移动完毕为止。
        for (int j = curLen; j > i; j--) {
            listElem[j] = listElem[j - 1];
        }
        listElem[i] = x;
        curLen++;
    }

    public void remove(int i) {
        if (i < 0 || i > curLen - 1) {
            throw new RuntimeException("the deleted location is illegal");
        }
        for (int j = i; j < curLen; j++) {
            listElem[j] = listElem[j + 1];
        }
        curLen--;
    }

    public int indexOf(Object x) {
        for (int i = 0; i < curLen; i++) {
            if (listElem[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }

    public void display() {
        for (int i = 0; i < curLen; i++) {
            System.out.print(listElem[i] + " ");
        }
        System.out.println();
    }

    /**
     * test
     *
     * @param args
     */
    public static void main(String[] args) {
        SqList sqList = new SqList(10);
        sqList.insert(0, "a");
        sqList.insert(1, "z");
        sqList.insert(2, "d");
        sqList.insert(3, "m");
        sqList.insert(4, "z");
        int order = sqList.indexOf("x");
        if (order != -1) {
            System.out.println("顺序表中第一次出现的值为z的数据元素的位置为：" + order);
        } else {
            System.out.println("顺序表中不包括z元素");
        }
        sqList.display();
        sqList.insert(4, "x");
        sqList.display();
    }
}