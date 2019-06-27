package problems.algorithm.stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ��·��
 * 
 * @author search
 *
 */
public class SimplifyPath_71 {
	
	//ջ���,�ѵ�ǰĿ¼ѹ��ջ��,����..����ջ��,��󷵻�ջ��Ԫ��.
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
