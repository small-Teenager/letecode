package problems.algorithm.linkedlist;

/**
 * @author Search 删除链表中的节点
 * @date 2019/6/26
 */
public class DeleteNode_237 {

	public void deleteNode(ListNode node) {

		// 注意: 这个方法对尾节点不适用。题目中要求了给定的node不是尾节点
		// 我们检查node.next, 如果为null则抛出异常, 确保了node不是尾节点
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

	// 根据n个元素的数组arr创建一个链表
	// 使用arr为参数，创建另外一个ListNode的构造函数
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

	// 返回以当前ListNode为头结点的链表信息字符串
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
