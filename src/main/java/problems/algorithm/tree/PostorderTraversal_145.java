package problems.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

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
}
