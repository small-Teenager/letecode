package problems.algorithm.linkedlist;

/**
 * @author Search 删除排序链表中的重复元素 II
 * @date 2019/6/25
 */
public class DeleteDuplicates_82 {

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return head;
		if (head.next != null && head.val == head.next.val) {
			while (head.next != null && head.val == head.next.val) {
				head = head.next;
			}
			return deleteDuplicates(head.next);
		} else
			head.next = deleteDuplicates(head.next);
		return head;
	}

	// Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

}
