package problems.algorithm.linkedlist;

/**
 * 
 * @author Search ��ż����
 *
 */
public class OddEvenList_328 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode oddEvenList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		// head Ϊ������ͷ��㣬o Ϊ������β�ڵ�
		ListNode o = head;
		// p Ϊż����ͷ���
		ListNode p = head.next;
		// e Ϊż����β�ڵ�
		ListNode e = p;
		while (o.next != null && e.next != null) {
			o.next = e.next;
			o = o.next;
			e.next = o.next;
			e = e.next;
		}
		o.next = p;
		return head;
	}
}
