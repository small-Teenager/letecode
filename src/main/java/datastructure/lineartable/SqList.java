package datastructure.lineartable;

import datastructure.lineartable.inter.IList;

/**
 * @author Search
 * ���Ա��˳��洢��ʵ��
 */
public class SqList implements IList {
    // ���Ա�洢�ռ�
    private Object[] listElem;
    // ���Ա�ĵ�ǰ����
    private int curLen;

    /**
     * ˳�����Ĺ��캯��������һ���洢�ռ�����ΪmaxSize�����Ա�
     *
     * @param maxSize
     */
    public SqList(int maxSize) {
        curLen = 0;
        listElem = new Object[maxSize];
    }

    public void clear() {
        // ��˳���ĵ�ǰ����Ϊ0
        curLen = 0;
    }

    public boolean isEmpty() {
        return curLen == 0;
    }

    public int length() {
        // ����˳���ĵ�ǰ����
        return curLen;
    }

    public Object get(int i) {
        if (i < 0 || i >= curLen) {
            throw new RuntimeException("the" + i + "element does not exist");
        }
        return listElem[i];
    }

    public void insert(int i, Object x) {
        // �жϱ��Ƿ�����
        if (curLen == listElem.length) {
            throw new RuntimeException("storage space is full and new elements cannot be inserted");
        }
        // �����λ�ò��Ϸ�
        if (i < 0 || i > curLen) {
            throw new RuntimeException("Illegal insertion position");
        }
        // ����Ҫ�����һ��Ԫ�ؿ�ʼ����������ƶ���ֱ����i������Ԫ���ƶ����Ϊֹ��
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
            System.out.println("˳����е�һ�γ��ֵ�ֵΪz������Ԫ�ص�λ��Ϊ��" + order);
        } else {
            System.out.println("˳����в�����zԪ��");
        }
        sqList.display();
        sqList.insert(4, "x");
        sqList.display();
    }
}