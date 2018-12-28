package algorithm.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ����ʵ��ջ 225
 * @author search
 *
 */
public class MyStack_225 {
/**
 * for push����ΪDeque���Ԫ�أ���Ϊ����ʹ��que��ʵ�ֶ�ջ
����top��pop������ֻ�跴תque�е����ݲ�����Ԫ�أ�
�����ڷ�ת֮��������κ���Ԫ�س��֣���push������Ҫʼ����addFirst����Ӹ�Ԫ��
 */
}
class MyStack {
    Deque<Integer> deque;
	boolean isReverse;

    /** Initialize your data structure here. */
    public MyStack() {
    	deque = new ArrayDeque<>();
        isReverse = false;
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        if(isReverse){
        	deque.addFirst(x);
        }
        else{
        	deque.addLast(x);   
       } 
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
		if (!isReverse) {
			deque = reverseQue(deque);
			isReverse = true;
		}
		return deque.removeFirst();
    }
    
    /** Get the top element. */
    public int top() {
		if (!isReverse) {
			deque = reverseQue(deque);
			isReverse = true;
		}
		return deque.peekFirst();
        
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return deque.isEmpty();
    }
    private Deque<Integer> reverseQue(Deque<Integer> q) {
	    if(q.isEmpty()){
			return q;
		} else{
			int data = q.removeFirst();
			q = reverseQue(q);
			q.addLast(data);
			return q;
		}
	}
}
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */