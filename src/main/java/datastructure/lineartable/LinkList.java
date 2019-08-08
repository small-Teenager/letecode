package datastructure.lineartable;

import datastructure.lineartable.inter.IList;

import java.util.Scanner;

/**
 * @author Search
 * 线性表的链式存储及实现
 */
public class LinkList implements IList {
    // 单链表的头指针
    private Node head;

    // 单链表的构造函数
    public LinkList() {
        // 初始化头结点
        head = new Node();
    }

    public LinkList(int n, boolean Order) {
        // 初始化头结点
        this();
        if (Order) {
            // 用尾插法顺序建立单链表
            create1(n);
        } else {
            // 用头插法顺序建立单链表
            create2(n);
        }
    }

    // 用头插法顺序建立单链表
    private void create2(int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            insert(0, sc.next());
        }
    }

    // 用尾插法顺序建立单链表
    private void create1(int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            insert(length(), sc.next());
        }
    }

    // 将一个已经存在的带头结点的单链表置成空表
    @Override
    public void clear() {
        head.setData(null);
        head.setNext(null);
    }

    // 判断带头结点的单链表是否为空
    @Override
    public boolean isEmpty() {
        return head.getNext() == null;
    }

    // 求带头结点的单链表的长度
    @Override
    public int length() {
        // 初始化，p指向头结点，length为计数器
        Node p = head.getNext();
        int length = 0;
        // 从头结点开始向后查找，直到p为空
        while (p != null) {
            // 指向后继结点
            p = p.getNext();
            // 长度加1
            length++;
        }
        return length;
    }

    // 读取带头结点的单链表中的第i个结点
    @Override
    public Object get(int i) {
        // TODO Auto-generated method stub
        Node p = head.getNext();
        int j = 0;
        while (p != null && j < i) {
            p = p.getNext();
            j++;
        }
        // i小于0或者大于表长减1
        if (j > i || p == null) {
            throw new RuntimeException("the" + i + "element does not exist");
        }
        return p.getData();
    }

    // 在头结点的单链表中的第i个结点之前插入一个值为x的新结点
    @Override
    public void insert(int i, Object x) {
        Node p = head;
        int j = -1;
        // 寻找第i个结点的前驱
        while (p != null && j < i - 1) {
            p = p.getNext();
            j++;
        }
        if (j > i - 1 || p == null) {
            throw new RuntimeException("Illegal insertion position");
        }
        Node s = new Node(x);
        // 修改链，使新结点插入到单链表中
        s.setNext(p.getNext());
        p.setNext(s);
    }

    // 删除带头结点的单链表中的第i个结点
    @Override
    public void remove(int i) {
        Node p = head;
        int j = -1;
        while (p.getNext() != null && j < i - 1) {
            p = p.getNext();
            j++;
        }
        if (j > i - 1 || p.getNext() == null) {
            throw new RuntimeException("Illegal deletion position");
        }
        // 修改链指针，使待删除结点从单链表中脱离
        p.setNext(p.getNext().getNext());
    }

    // 查找指定单链表中元素的位置，若在单链表中值发回该位置，如果不在单链表中则返回-1
    @Override
    public int indexOf(Object x) {
        // TODO Auto-generated method stub
        Node p = head.getNext();
        int j = 0;
        while (p != null && p.getData().equals(x)) {
            p = p.getNext();
            j++;
        }
        if (p == null) {
            return -1;
        } else {
            return j;
        }
    }

    // 输出单链表中的所有结点
    @Override
    public void display() {
        // 取出带头结点的单链表中的首结点
        Node p = head.getNext();
        while (p != null) {
            // 输出结点的值
            System.out.print(p.getData() + " ");
            // 取下一个结点
            p = p.getNext();
        }
        System.out.println();
    }

    /**
     * test
     *
     * @param args
     */
    public static void main(String[] args) {
        int n = 10;
        LinkList L = new LinkList();
        for (int i = 0; i < n; i++) {
            L.insert(i, i);
        }
        System.out.println("请输入i的值：");
        int i = new Scanner(System.in).nextInt();
        if (0 < i && i <= n) {
            System.out.println("第" + i + "个元素的前驱是:" + L.get(i - 1));
        } else {
            System.out.println("第" + i + "个元素的直接前驱不存在");
        }
    }
}