package problems.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

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
}
