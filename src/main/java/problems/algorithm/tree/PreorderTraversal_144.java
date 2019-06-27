package problems.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Search 二叉树的前序遍历
 */
public class PreorderTraversal_144 {

	// Definition for a binary tree node.
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<Integer> preorderTraversal(TreeNode root) {

		ArrayList<Integer> res = new ArrayList<Integer>();
		preorderTraversal(root, res);
		return res;
	}

	private void preorderTraversal(TreeNode node, List<Integer> list) {
		if (node != null) {
			list.add(node.val);
			preorderTraversal(node.left, list);
			preorderTraversal(node.right, list);
		}
	}
}
