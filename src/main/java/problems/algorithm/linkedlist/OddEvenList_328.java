package problems.algorithm.linkedlist;

/**
 * 
 * @author Search 奇偶链表
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
		// head 为奇链表头结点，o 为奇链表尾节点
		ListNode o = head;
		// p 为偶链表头结点
		ListNode p = head.next;
		// e 为偶链表尾节点
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
