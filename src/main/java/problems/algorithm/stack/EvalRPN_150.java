package problems.algorithm.stack;

import java.util.Stack;

/**
 * @author Search 逆波兰表达式求值
 * @date 2019/6/28
 */
public class EvalRPN_150 {

	// 遍历数组 tokens，如果遇到非运算符，则入栈，如果遇到运算符则弹出栈顶两个元素进行计算，然后将计算结果入栈。
	public int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<Integer>();
		for (String token : tokens) {
			if (!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")) {
				stack.push(Integer.parseInt(token));
			} else {
				int e2 = stack.pop();
				int e1 = stack.pop();
				stack.push(calculate(e1, e2, token));
			}
		}
		return stack.pop();
	}

	private int calculate(int i1, int i2, String op) {
		Integer res = new Integer(0);
		switch (op) {
		case "+":
			res = i1 + i2;
			break;
		case "-":
			res = i1 - i2;
			break;
		case "*":
			res = i1 * i2;
			break;
		case "/":
			if (i2 != 0) {
				res = i1 / i2;
			}
			break;
		}
		return res;
	}

}
