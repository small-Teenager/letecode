package problems.algorithm.stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 简化路径
 * 
 * @author search
 *
 */
public class SimplifyPath_71 {
	
	//栈解决,把当前目录压入栈中,遇到..弹出栈顶,最后返回栈中元素.
	public String simplifyPath(String path) {
		Deque<String> stack = new LinkedList<>();
		for (String item : path.split("/")) {
			if (item.equals("..")) {
				if (!stack.isEmpty())
					stack.pop();
			} else if (!item.isEmpty() && !item.equals("."))
				stack.push(item);
		}
		String res = "";
		for (String d : stack)
			res = "/" + d + res;
		return res.isEmpty() ? "/" : res;
	}

}
