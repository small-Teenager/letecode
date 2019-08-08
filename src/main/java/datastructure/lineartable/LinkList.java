package datastructure.lineartable;

import datastructure.lineartable.inter.IList;

import java.util.Scanner;

/**
 * @author Search
 * ���Ա����ʽ�洢��ʵ��
 */
public class LinkList implements IList {
    // �������ͷָ��
    private Node head;

    // ������Ĺ��캯��
    public LinkList() {
        // ��ʼ��ͷ���
        head = new Node();
    }

    public LinkList(int n, boolean Order) {
        // ��ʼ��ͷ���
        this();
        if (Order) {
            // ��β�巨˳����������
            create1(n);
        } else {
            // ��ͷ�巨˳����������
            create2(n);
        }
    }

    // ��ͷ�巨˳����������
    private void create2(int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            insert(0, sc.next());
        }
    }

    // ��β�巨˳����������
    private void create1(int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            insert(length(), sc.next());
        }
    }

    // ��һ���Ѿ����ڵĴ�ͷ���ĵ������óɿձ�
    @Override
    public void clear() {
        head.setData(null);
        head.setNext(null);
    }

    // �жϴ�ͷ���ĵ������Ƿ�Ϊ��
    @Override
    public boolean isEmpty() {
        return head.getNext() == null;
    }

    // ���ͷ���ĵ�����ĳ���
    @Override
    public int length() {
        // ��ʼ����pָ��ͷ��㣬lengthΪ������
        Node p = head.getNext();
        int length = 0;
        // ��ͷ��㿪ʼ�����ң�ֱ��pΪ��
        while (p != null) {
            // ָ���̽��
            p = p.getNext();
            // ���ȼ�1
            length++;
        }
        return length;
    }

    // ��ȡ��ͷ���ĵ������еĵ�i�����
    @Override
    public Object get(int i) {
        // TODO Auto-generated method stub
        Node p = head.getNext();
        int j = 0;
        while (p != null && j < i) {
            p = p.getNext();
            j++;
        }
        // iС��0���ߴ��ڱ���1
        if (j > i || p == null) {
            throw new RuntimeException("the" + i + "element does not exist");
        }
        return p.getData();
    }

    // ��ͷ���ĵ������еĵ�i�����֮ǰ����һ��ֵΪx���½��
    @Override
    public void insert(int i, Object x) {
        Node p = head;
        int j = -1;
        // Ѱ�ҵ�i������ǰ��
        while (p != null && j < i - 1) {
            p = p.getNext();
            j++;
        }
        if (j > i - 1 || p == null) {
            throw new RuntimeException("Illegal insertion position");
        }
        Node s = new Node(x);
        // �޸�����ʹ�½����뵽��������
        s.setNext(p.getNext());
        p.setNext(s);
    }

    // ɾ����ͷ���ĵ������еĵ�i�����
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
        // �޸���ָ�룬ʹ��ɾ�����ӵ�����������
        p.setNext(p.getNext().getNext());
    }

    // ����ָ����������Ԫ�ص�λ�ã����ڵ�������ֵ���ظ�λ�ã�������ڵ��������򷵻�-1
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

    // ����������е����н��
    @Override
    public void display() {
        // ȡ����ͷ���ĵ������е��׽��
        Node p = head.getNext();
        while (p != null) {
            // �������ֵ
            System.out.print(p.getData() + " ");
            // ȡ��һ�����
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
        System.out.println("������i��ֵ��");
        int i = new Scanner(System.in).nextInt();
        if (0 < i && i <= n) {
            System.out.println("��" + i + "��Ԫ�ص�ǰ����:" + L.get(i - 1));
        } else {
            System.out.println("��" + i + "��Ԫ�ص�ֱ��ǰ��������");
        }
    }
}