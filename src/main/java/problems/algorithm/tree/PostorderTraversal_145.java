package problems.algorithm.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 
 * @author Search 二叉树的后序遍历
 */
public class PostorderTraversal_145 {

	// Definition for a binary tree node.
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	// V1 递归
	public List<Integer> postorderTraversal(TreeNode root) {

		ArrayList<Integer> res = new ArrayList<Integer>();
		postorderTraversal(root, res);
		return res;
	}

	private void postorderTraversal(TreeNode node, List<Integer> list) {
		if (node != null) {
			postorderTraversal(node.left, list);
			postorderTraversal(node.right, list);
			list.add(node.val);
		}
	}

	private class Command {
		String s; // go, print
		TreeNode node;

		Command(String s, TreeNode node) {
			this.s = s;
			this.node = node;
		}
	};

	// v2非递归
	public List<Integer> postorderTraversalV2(TreeNode root) {

		ArrayList<Integer> res = new ArrayList<Integer>();
		if (root == null)
			return res;

		Stack<Command> stack = new Stack<Command>();
		stack.push(new Command("go", root));
		while (!stack.empty()) {
			Command command = stack.pop();

			if (command.s.equals("print"))
				res.add(command.node.val);
			else {
				assert command.s.equals("go");
				stack.push(new Command("print", command.node));
				if (command.node.right != null)
					stack.push(new Command("go", command.node.right));
				if (command.node.left != null)
					stack.push(new Command("go", command.node.left));
			}
		}
		return res;
	}
}
