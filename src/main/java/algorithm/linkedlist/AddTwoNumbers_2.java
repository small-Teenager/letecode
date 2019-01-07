package algorithm.linkedlist;

/**
 * @author Search
 * 2. 两数相加
 * @date 2019/1/2
 */
public class AddTwoNumbers_2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode p = l1, q = l2, curr = listNode;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return listNode.next;
    }
}

///**
// * Definition for singly-linked list.
// * /
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
