package problems.algorithm.linkedlist;

/**
 * @author Search 删除排序链表中的重复元素
 * @date 2019/6/25
 */
public class DeleteDuplicates_83 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	/**
	 * 将结点的值与它之后的结点进行比较来确定它是否为重复结点。如果它是重复的，更改当前结点的 next
	 * 指针，以便它跳过下一个结点并直接指向下一个结点之后的结点。
	 * 
	 * @param head
	 * @return
	 */
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
