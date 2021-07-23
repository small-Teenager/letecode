package problems.algorithm.linkedlist;

/**
 * @author Search 翻转链表
 * @date 2019/1/2
 */
public class ReverseList_206 {

	// Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode reverseList(ListNode head) {

		ListNode pre = null;
		ListNode cur = head;
		while (cur != null) {
			ListNode next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}

		return pre;
	}

	// 递归方式翻转
	public ListNode reverseListV2(ListNode head) {

		// 递归终止条件
		if (head == null || head.next == null)
			return head;

		ListNode rhead = reverseList(head.next);

		// head->next此刻指向head后面的链表的尾节点
		// head->next->next = head把head节点放在了尾部
		head.next.next = head;
		head.next = null;

		return rhead;
	}
}
