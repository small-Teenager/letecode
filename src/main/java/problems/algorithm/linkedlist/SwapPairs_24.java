package problems.algorithm.linkedlist;

/**
 * @author Search 两两交换链表中的节点
 * @date 2019/6/26
 */
public class SwapPairs_24 {

	// Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}

	}

	public ListNode swapPairs(ListNode head) {

		ListNode dummyHead = new ListNode(0);
		dummyHead.next = head;

		ListNode p = dummyHead;
		while (p.next != null && p.next.next != null) {
			ListNode node1 = p.next;
			ListNode node2 = node1.next;
			ListNode next = node2.next;
			node2.next = node1;
			node1.next = next;
			p.next = node2;
			p = node1;
		}

		return dummyHead.next;
	}

}
