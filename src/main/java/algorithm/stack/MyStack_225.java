package algorithm.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 队列实现栈 225
 * @author search
 *
 */
public class MyStack_225 {
/**
 * for push总是为Deque添加元素，因为我们使用que来实现堆栈
对于top和pop方法，只需反转que中的数据并返回元素，
但是在反转之后如果有任何新元素出现，即push，则需要始终在addFirst中添加该元素
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