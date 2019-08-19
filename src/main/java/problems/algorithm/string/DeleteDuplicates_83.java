package problems.algorithm.string;
/**
 * 
 * @author search
 * 删除排序链表中的重复元素 83
 */
public class DeleteDuplicates_83 {

	// Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	class Solution {
		public ListNode deleteDuplicates(ListNode head) {
			ListNode current = head;
			while (current != null && current.next != null) {
				if (current.next.val == current.val) {
					current.next = current.next.next;
				} else {
					current = current.next;
				}
			}
			return head;
		}
	}
}
