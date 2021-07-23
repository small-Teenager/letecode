package problems.algorithm.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/**
 * 二叉树的中序遍历
 * 
 * @author search
 *
 */
public class InorderTraversal_94 {

	// Definition for a binary tree node.
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	//V1 递归
	public List<Integer> inorderTraversal(TreeNode root) {

		ArrayList<Integer> res = new ArrayList<Integer>();
		inorderTraversal(root, res);
		return res;
	}

	private void inorderTraversal(TreeNode node, List<Integer> list) {
		if (node != null) {
			inorderTraversal(node.left, list);
			list.add(node.val);
			inorderTraversal(node.right, list);
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

	//V2 非递归
	public List<Integer> inorderTraversalV2(TreeNode root) {

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
				if (command.node.right != null)
					stack.push(new Command("go", command.node.right));
				stack.push(new Command("print", command.node));
				if (command.node.left != null)
					stack.push(new Command("go", command.node.left));
			}
		}
		return res;
	}
}
