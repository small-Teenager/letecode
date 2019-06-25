package problems.algorithm.linkedlist;

/**
 * @author Search ��ת����
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

	// �ݹ鷽ʽ��ת
	public ListNode reverseListV2(ListNode head) {

		// �ݹ���ֹ����
		if (head == null || head.next == null)
			return head;

		ListNode rhead = reverseList(head.next);

		// head->next�˿�ָ��head����������β�ڵ�
		// head->next->next = head��head�ڵ������β��
		head.next.next = head;
		head.next = null;

		return rhead;
	}
}
