package problems.algorithm.linkedlist;

/**
 * @author Search ɾ�������еĽڵ�
 * @date 2019/6/26
 */
public class DeleteNode_237 {

	public void deleteNode(ListNode node) {

		// ע��: ���������β�ڵ㲻���á���Ŀ��Ҫ���˸�����node����β�ڵ�
		// ���Ǽ��node.next, ���Ϊnull���׳��쳣, ȷ����node����β�ڵ�
		if (node == null || node.next == null)
			throw new IllegalArgumentException("node should be valid and can not be the tail node.");

		node.val = node.next.val;
		node.next = node.next.next;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4 };

		ListNode head = new ListNode(arr);
		System.out.println(head);

		ListNode node2 = head.findNode(2);
		(new DeleteNode_237()).deleteNode(node2);
		System.out.println(head);
	}
}

class ListNode {

	public int val;
	public ListNode next = null;

	public ListNode(int x) {
		val = x;
	}

	// ����n��Ԫ�ص�����arr����һ������
	// ʹ��arrΪ��������������һ��ListNode�Ĺ��캯��
	public ListNode(int[] arr) {

		if (arr == null || arr.length == 0)
			throw new IllegalArgumentException("arr can not be empty");

		this.val = arr[0];
		ListNode curNode = this;
		for (int i = 1; i < arr.length; i++) {
			curNode.next = new ListNode(arr[i]);
			curNode = curNode.next;
		}
	}

	ListNode findNode(int x) {

		ListNode curNode = this;
		while (curNode != null) {
			if (curNode.val == x)
				return curNode;
			curNode = curNode.next;
		}
		return null;
	}

	// �����Ե�ǰListNodeΪͷ����������Ϣ�ַ���
	@Override
	public String toString() {

		StringBuilder s = new StringBuilder("");
		ListNode curNode = this;
		while (curNode != null) {
			s.append(Integer.toString(curNode.val));
			s.append(" -> ");
			curNode = curNode.next;
		}
		s.append("NULL");
		return s.toString();
	}
}
