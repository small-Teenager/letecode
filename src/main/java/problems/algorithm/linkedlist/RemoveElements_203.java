package problems.algorithm.linkedlist;

/**
 * 
 * @author Search �Ƴ�����Ԫ��
 *
 */
public class RemoveElements_203 {

	public ListNode removeElements(ListNode head, int val) {

		// ��Ҫ��ͷ���������⴦��
		while (head != null && head.val == val) {
			ListNode node = head;
			head = head.next;
		}

		if (head == null)
			return head;

		ListNode cur = head;
		while (cur.next != null) {
			if (cur.next.val == val) {
				ListNode delNode = cur.next;
				cur.next = delNode.next;
			} else
				cur = cur.next;
		}

		return head;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}

	}

}
