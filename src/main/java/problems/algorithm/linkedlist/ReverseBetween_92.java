package problems.algorithm.linkedlist;
/**
 * 
 * @author Search 
 * 反转链表 II
 *
 */
public class ReverseBetween_92 {

	// Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode pre = dummy;
		for (int i = 1; i < m; i++) {
			pre = pre.next;
		}
		head = pre.next;
		for (int i = m; i < n; i++) {
			ListNode nex = head.next;
			head.next = nex.next;
			nex.next = pre.next;
			pre.next = nex;
		}
		return dummy.next;
	}
}
