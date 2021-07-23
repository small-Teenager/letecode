package problems.algorithm.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


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
	//V1 递归
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
	
	  private class Command{
	        String s;   // go, print
	        TreeNode node;
	        Command(String s, TreeNode node){
	            this.s = s;
	            this.node = node;
	        }
	    };
	    //非递归
	    public List<Integer> preorderTraversalV2(TreeNode root) {

	        ArrayList<Integer> res = new ArrayList<Integer>();
	        if(root == null)
	            return res;

	        Stack<Command> stack = new Stack<Command>();
	        stack.push(new Command("go", root));
	        while(!stack.empty()){
	            Command command = stack.pop();

	            if(command.s.equals("print"))
	                res.add(command.node.val);
	            else{
	                assert command.s.equals("go");
	                if(command.node.right != null)
	                    stack.push(new Command("go",command.node.right));
	                if(command.node.left != null)
	                    stack.push(new Command("go",command.node.left));
	                stack.push(new Command("print", command.node));
	            }
	        }
	        return res;
	    }
	    
	    //v3 stack
	    public List<Integer> preorderTraversalV3(TreeNode root) {

	        ArrayList<Integer> res = new ArrayList<Integer>();
	        if(root == null)
	            return res;

	        Stack<TreeNode> stack = new Stack<TreeNode>();
	        stack.push(root);
	        while(!stack.empty()){
	            TreeNode curNode = stack.pop();
	            res.add(curNode.val);

	            if(curNode.right != null)
	                stack.push(curNode.right);
	            if(curNode.left != null)
	                stack.push(curNode.left);
	        }
	        return res;
	    }

}
