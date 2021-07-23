package problems.algorithm.stack;

import java.util.Stack;

/**
 * 用栈实现队列 232
 * 
 * @author search
 *
 */
public class MyQueue_232 {

}

class MyQueue {

	Stack<Integer> stack;
	Stack<Integer> stack1;

	/** Initialize your data structure here. */
	public MyQueue() {
		stack = new Stack<>();
		stack1 = new Stack<>();
	}

	/** Push element x to the back of queue. */
	public void push(int x) {
		stack.push(x);
	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {
		if (stack1.isEmpty()) {
			if (!stack.isEmpty()) {
				while (!stack.isEmpty()) {
					stack1.push(stack.pop());
				}
				return stack1.pop();
			} else {
				empty();
			}
		}
		return stack1.pop();

	}

	/** Get the front element. */
	public int peek() {
		if (stack1.isEmpty()) {
			if (!stack.isEmpty()) {
				while (!stack.isEmpty()) {
					stack1.push(stack.pop());
				}
				return stack1.peek();
			} else {
				empty();
			}
		}

		return stack1.peek();
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		if (stack1.isEmpty()) {
			if (!stack.isEmpty()) {
				while (!stack.isEmpty()) {
					stack1.push(stack.pop());
				}
				return false;
			} else {
				return true;
			}
		}
		return false;
	}
}

/**
 * Your MyQueue object will be instantiated and called as such: MyQueue obj =
 * new MyQueue(); obj.push(x); int param_2 = obj.pop(); int param_3 =
 * obj.peek(); boolean param_4 = obj.empty();
 */