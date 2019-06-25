package problems.algorithm.linkedlist;

/**
 * @author Search ɾ�����������е��ظ�Ԫ��
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
	 * ������ֵ����֮��Ľ����бȽ���ȷ�����Ƿ�Ϊ�ظ���㡣��������ظ��ģ����ĵ�ǰ���� next
	 * ָ�룬�Ա���������һ����㲢ֱ��ָ����һ�����֮��Ľ�㡣
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
