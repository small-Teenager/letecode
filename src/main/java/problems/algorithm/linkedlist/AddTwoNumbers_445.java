package problems.algorithm.linkedlist;


/**
 * 
 * @author Search 两数相加 II
 *
 */
public class AddTwoNumbers_445 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		l1 = reverse(l1);
		l2 = reverse(l2);
		ListNode head = new ListNode(0), p = head;
		int carry = 0;

		while (l1 != null || l2 != null || carry != 0) {
			ListNode t = new ListNode(0);
			t.val += carry;
			if (l1 != null) {
				t.val += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				t.val += l2.val;
				l2 = l2.next;
			}
			carry = t.val / 10;
			t.val = t.val % 10;
			p.next = t;
			p = t;
		}
		if (head.next == null)
			return head;
		return reverse(head.next);
	}

	ListNode reverse(ListNode l) {
		if (l == null || l.next == null)
			return l;
		ListNode newnode = reverse(l.next);
		l.next.next = l;
		l.next = null;
		return newnode;
	}
}
