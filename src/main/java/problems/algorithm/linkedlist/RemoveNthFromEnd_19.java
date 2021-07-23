package problems.algorithm.linkedlist;

/**
 * 
 * @author Search 删除链表的倒数第N个节点
 *
 */
public class RemoveNthFromEnd_19 {

	// 先记录链表长度 后遍历
	public ListNode removeNthFromEnd(ListNode head, int n) {

		ListNode dummyHead = new ListNode(0);
		dummyHead.next = head;

		int length = 0;
		for (ListNode cur = dummyHead.next; cur != null; cur = cur.next)
			length++;

		int k = length - n;
		assert k >= 0;
		ListNode cur = dummyHead;
		for (int i = 0; i < k; i++)
			cur = cur.next;

		cur.next = cur.next.next;

		return dummyHead.next;
	}

	// 雙指針
	public ListNode removeNthFromEndV2(ListNode head, int n) {

		ListNode dummyHead = new ListNode(0);
		dummyHead.next = head;

		ListNode p = dummyHead;
		ListNode q = dummyHead;
		for (int i = 0; i < n + 1; i++) {
			assert q != null;
			q = q.next;
		}

		while (q != null) {
			p = p.next;
			q = q.next;
		}

		p.next = p.next.next;

		return dummyHead.next;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		ListNode head = new ListNode(arr);
		System.out.println(head);

		head = (new RemoveNthFromEnd_19()).removeNthFromEnd(head, 2);
		System.out.println(head);
	}
}
