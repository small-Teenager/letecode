package problems.algorithm.linkedlist;

/**
 * 
 * @author Search 合并两个有序链表
 */
public class MergeTwoLists_21 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode rspHead = new ListNode(0);
		ListNode rsp = rspHead;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				rspHead.next = l1;
				l1 = l1.next;
			} else {
				rspHead.next = l2;
				l2 = l2.next;
			}
			rspHead = rspHead.next;
		}
		if (l1 == null) {
			rspHead.next = l2;
		} else {
			rspHead.next = l1;
		}
		return rsp.next;
	}

}
